package com.web.user.web.user.service;
public class BCryptPasswordEncoder {
	 public static void main(String[] args) {
		    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		    // Encrypt a password
		    String encryptedPassword = encoder.matches("password");
		    System.out.println("Encrypted Password: " + encryptedPassword);

		    // Check if a plain text password matches the encrypted password
		    boolean isPasswordMatch = encoder.matches("password", encryptedPassword);
		    System.out.println("Password match: " + isPasswordMatch);
		  }

	private String matches(String string) {
		
		return string;
	}

	private boolean matches(String string, String encryptedPassword) {
		// TODO Auto-generated method stub
		return false;
	}


		}



