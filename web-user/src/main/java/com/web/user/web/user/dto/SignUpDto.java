package com.web.user.web.user.dto;

import java.io.Serializable;
import java.util.UUID;

import com.medical.video.entity.Role;
import com.medical.video.enumeration.Status;
import com.medical.video.enumeration.UserRoleType;

import lombok.Data;

@Data
public class SignUpDto implements Serializable {

	private static final long serialVersionUID = 1L;

    private UUID userId; 
    
  	private String fullName;

	private String userName;

	private String email;

	private String phoneNumber1;
	
	private String phoneNumber2;

	private String password;

	
	private UserRoleType userRole;
	
	
	private Status status;
	
	private String addressLine1;
	
	private String addressLine2;
	
	private UUID countryId;
	
	private UUID stateId;
	
	private UUID cityId;
	
	private Role roleObj;
	

}





