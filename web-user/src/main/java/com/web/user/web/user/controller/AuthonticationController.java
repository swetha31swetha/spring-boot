package com.web.user.web.user.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.medical.video.entity.PasswordUtil;
import com.web.user.web.user.dto.ErrorDto;
import com.web.user.web.user.dto.LoginRequest;
import com.web.user.web.user.entity.WebUser;
import com.web.user.web.user.repository.WebRepository;
import com.web.user.web.user.response.ResponseGenerator;
import com.web.user.web.user.response.TransactionContext;
import com.web.user.web.user.security.JwtUtil;
import com.web.user.web.user.service.WebService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
public class AuthonticationController {


private static final Logger logger = Logger.getLogger(AuthenticationController.class);
private @NonNull ResponseGenerator responseGenerator;

private @NonNull WebRepository userRepository;

private @NonNull WebService userservice;
@ApiOperation(value = "Logs the user in to the system and return the auth tokens")
@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
public ResponseEntity<?> login(@ApiParam(value = "The LoginRequest payload") @RequestBody LoginRequest request,
		@RequestHeader HttpHeaders httpHeader) throws Exception {
	ErrorDto errorDto = null;
	Map<String, Object> response = new HashMap<String, Object>();
	if (null == request) {
		errorDto = new ErrorDto();
		errorDto.setCode("400");
		errorDto.setMessage("Invalid request payload.!");
		response.put("status", 0);
		response.put("error", errorDto);
		return ResponseEntity.badRequest().body(response);
	}
	Optional<WebUser> userOptional = userRepository.findByUserName(request.getUserName());
	if (!userOptional.isPresent()) {
		errorDto = new ErrorDto();
		errorDto.setCode("400");
		errorDto.setMessage("Invalid username.!");
		response.put("status", 0);
		response.put("error", errorDto);
		return ResponseEntity.badRequest().body(response);
	}
	WebUser user = userOptional.get();
	String enPassword = PasswordUtil.getEncryptedPassword(request.getPassword());

	if (!user.getUserName().equals(request.getUserName())) {
		errorDto = new ErrorDto();
		errorDto.setCode("400");
		errorDto.setMessage("Invalid username.!");
		response.put("status", 0);
		response.put("error", errorDto);
		return ResponseEntity.badRequest().body(response);
	}
	if (!user.getUserPassword().equals(enPassword)) {
		errorDto = new ErrorDto();
		errorDto.setCode("400");
		errorDto.setMessage("Password is wrong.!");
		response.put("status", 0);
		response.put("error", errorDto);
		return ResponseEntity.badRequest().body(response);
	}

	final String token = JwtUtil.generateToken(webuser);
	response.put("status", 1);
	response.put("message", "Logged in successfully.!");
	response.put("jwt", token);
	// response.put("isOtpVerified", user.getIsOtpVerified());
	TransactionContext context = responseGenerator.generateTransationContext(httpHeader);
	try {
		return responseGenerator.successResponse(context, response, HttpStatus.OK);
	} catch (Exception e) {
		e.printStackTrace();
		logger.error(e.getMessage(), e);
		return responseGenerator.errorResponse(context, e.getMessage(), HttpStatus.BAD_REQUEST);
	}

}
}