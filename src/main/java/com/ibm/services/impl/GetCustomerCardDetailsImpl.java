package com.ibm.services.impl;
 
import java.util.*;
 
import com.ibm.model.GetCustomerCardDetailsP;
import com.ibm.model.GetCustomerCardDetailsResponseWrapper;
import com.ibm.services.GetCustomerCardDetailsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class GetCustomerCardDetailsImpl implements GetCustomerCardDetailsI {
 
    private static final Log logger = LogFactory.getLog(GetCustomerCardDetailsImpl.class);
   
    public GetCustomerCardDetailsResponseWrapper reliable(GetCustomerCardDetailsP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new GetCustomerCardDetailsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public GetCustomerCardDetailsResponseWrapper execute(GetCustomerCardDetailsP requestParams){
        //TODO
        return new GetCustomerCardDetailsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
