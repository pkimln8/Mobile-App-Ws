package com.appsdeveloperblog.app.ws.shared.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDto implements Serializable {

	private static final long serialVersionUID = 545810113694492329L;
	private long id;
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String encryptedPassword;
	private String emailVerificationToken;
	private Boolean emailVerificationStatus = false;
	
}
