package com.ibm.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

import com.ibm.model.CreateCardTransactionInput;
import org.springframework.http.ResponseEntity;
import com.ibm.model.CreateCardTransactionOutput;


public class CreateCardTransactionResponseWrapper {

	private CreateCardTransactionOutput response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public CreateCardTransactionOutput getResponse(){
            return response;
	}
 
	public void setResponse(CreateCardTransactionOutput response){
            this.response=response;
	} 
}
