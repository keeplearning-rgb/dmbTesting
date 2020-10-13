package com.ibm.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

import org.springframework.http.ResponseEntity;
import com.ibm.model.GetCardAccountEnquiryOutput;


public class CardsCardsAccountsGetResponseWrapper {

	private GetCardAccountEnquiryOutput response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public GetCardAccountEnquiryOutput getResponse(){
            return response;
	}
 
	public void setResponse(GetCardAccountEnquiryOutput response){
            this.response=response;
	} 
}
