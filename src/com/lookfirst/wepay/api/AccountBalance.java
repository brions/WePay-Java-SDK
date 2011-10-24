package com.lookfirst.wepay.api;

import lombok.Data;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
public class AccountBalance {

	/** The pending balance of the account. */
	private String pendingBalance;
	/** The actual amount of money that has cleared and is available to the account. */
	private String availableBalance;
	/** The currency of the above amounts. For now this will always be USD. */
	private String currency;
}