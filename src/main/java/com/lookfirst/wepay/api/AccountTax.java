package com.lookfirst.wepay.api;

import java.io.Serializable;

import lombok.Data;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class AccountTax implements Serializable {
	private static final long serialVersionUID = 1L;

	/** The tax tables for the account. */
	private String taxes;
}