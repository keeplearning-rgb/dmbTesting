package com.ibm.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

import org.springframework.http.ResponseEntity;
import com.ibm.model.GetCustomerCardDetailsOutput;


public class GetCustomerCardDetailsResponseWrapper {

	private GetCustomerCardDetailsOutput response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public GetCustomerCardDetailsOutput getResponse(){
            return response;
	}
 
	public void setResponse(GetCustomerCardDetailsOutput response){
            this.response=response;
	} 
}
