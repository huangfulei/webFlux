package com.liftChina.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Fulei
 */
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class AuthResponse {
	
	private String token;

}
