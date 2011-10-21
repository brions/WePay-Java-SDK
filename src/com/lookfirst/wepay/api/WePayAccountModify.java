package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * Updates the specified properties. If reference_id is passed it MUST be unique for the user/application pair.
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayAccountModify extends WePayRequest<WePayAccountModifyResponse> {

	/** The unique ID of the account you want to modify. */
	private String accountId;
	/** The name of the account you want to modify. */
	private String name;
	/** The description of the account you want to modify. */
	private String description;
	/** The reference id of the account. Can be any integer, but must be unique for the application/user pair. */
	private String referenceId;
	/** The uri for an image that you want to use for the accounts icon. This image will be used in the co-branded checkout process. */
	private String imageUri;

	/** */
	public WePayAccountModify() {
		super(WePayAccountModifyResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/account/modify";
	}
}