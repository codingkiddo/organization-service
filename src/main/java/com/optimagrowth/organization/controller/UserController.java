//package com.optimagrowth.organization.controller;
//
//
//import java.util.Collection;
//import java.util.Map;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.core.oidc.OidcIdToken;
//import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(value="v1/organization")
//public class UserController {
//	@GetMapping("/user")
//	public Collection<? extends GrantedAuthority> getUser() {
//		Authentication authentication  = SecurityContextHolder.getContext().getAuthentication();
//		Collection<? extends GrantedAuthority> authorities =  authentication.getAuthorities();
//		System.out.println(authentication.isAuthenticated());
//		return authorities;
//	}
//}
