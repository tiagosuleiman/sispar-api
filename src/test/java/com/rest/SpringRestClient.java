package com.rest;
	  
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
	 
		  
	public class SpringRestClient {
	  
	    public static final String REST_SERVICE_URI = "http://localhost:8080/sispar-api";
	  
	    /*
	     * Add HTTP Authorization header, using Basic-Authentication to send user-credentials.
	     */
	    private static HttpHeaders getHeaders(){
	        String plainCredentials="admin:admin";
	        String base64Credentials = new String(Base64.encodeBase64(plainCredentials.getBytes()));
	         
	        HttpHeaders headers = new HttpHeaders();
	        headers.add("Authorization", "Basic " + base64Credentials);
	        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        return headers;
	    }
	     
	    /*
	     * Send a GET request to get list of all users.
	     */
	    @SuppressWarnings("unchecked")
	    private static void listAllUsers(){
	        RestTemplate restTemplate = new RestTemplate(); 
	         
	        HttpEntity<String> request = new HttpEntity<String>(getHeaders());
	        ResponseEntity<List> response = restTemplate.exchange(REST_SERVICE_URI+"/request/", HttpMethod.GET, request, List.class);
	        List<LinkedHashMap<String, Object>> jsonList = (List<LinkedHashMap<String, Object>>)response.getBody();
	         
	        System.out.println();
	        System.out.println(jsonList);
	    }
	      
	    public static void main(String args[]){
	        listAllUsers();
	    }
	}