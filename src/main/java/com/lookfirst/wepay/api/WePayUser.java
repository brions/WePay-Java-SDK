package com.lookfirst.wepay.api;

import java.io.Serializable;

import lombok.Data;

/**
 * https://stage.wepay.com/developer/reference/user
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class WePayUser implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The unique ID of the user. */
	private String userId;
	/** The first name of the user */
	private String firstName;
	/** The last name of the user */
	private String lastName;
	/** The email of the user */
	private String email;
	/** Either "registered" if the user has registered, or "pending" if the user still needs to confirm their registration */
	private String state;

	/** Either "registered" if the user has registered, or "pending" if the user still needs to confirm their registration */
	public boolean isRegistered() {
		return state != null && state.equals("registered");
	}
}