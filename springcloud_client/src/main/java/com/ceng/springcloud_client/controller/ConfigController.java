package com.ceng.springcloud_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cengizhan Ozcan on 5.04.2018.
 */
@RestController
public class ConfigController {

	@Value ("${security.oauth2.clientId}")
	private String clientId;

	@Value ("${security.oauth2.accessTokenUri}")
	private String clientAccessTokenUri;

	@Value ("${security.oauth2.clientSecret}")
	private String clientSecret;

	@RequestMapping ("/oauth2Info")
	public String getOAuth2Information() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client Id: ").append(clientId)
				.append("\nClient Secret: ").append(clientSecret)
				.append("\nClient Access Token Uri: ").append(clientAccessTokenUri);

		return builder.toString();
	}
}
