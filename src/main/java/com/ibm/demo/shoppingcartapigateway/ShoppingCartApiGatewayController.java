package com.ibm.demo.shoppingcartapigateway;

import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

@RestController
@RequestMapping("/shoppingcartapigateway")
public class ShoppingCartApiGatewayController {
	
	@RequestMapping(path = "/default", method = RequestMethod.GET)
	public String getDefaultMessage() {
		
		
		
		return "Welcome To CurrencyCloudApiGateway";
	}
	
	
	/*
    	@GetMapping("/greeting")
	    public String greeting(@AuthenticationPrincipal OidcUser oidcUser, Model model,
	                           @RegisteredOAuth2AuthorizedClient("okta") OAuth2AuthorizedClient client) {
    		  model.addAttribute("username", oidcUser.getEmail());
    	        model.addAttribute("idToken", oidcUser.getIdToken());
    	        model.addAttribute("accessToken", client.getAccessToken());

    	        return "greeting";
	    }
	*/


}
