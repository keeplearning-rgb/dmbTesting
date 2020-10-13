package com.ibm.services.impl;
 
import java.util.*;
 
import com.ibm.model.CreateCardTransactionP;
import com.ibm.model.CreateCardTransactionResponseWrapper;
import com.ibm.services.CreateCardTransactionI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class CreateCardTransactionImpl implements CreateCardTransactionI {
 
    private static final Log logger = LogFactory.getLog(CreateCardTransactionImpl.class);
   
    public CreateCardTransactionResponseWrapper reliable(CreateCardTransactionP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new CreateCardTransactionResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public CreateCardTransactionResponseWrapper execute(CreateCardTransactionP requestParams){
        //TODO
        return new CreateCardTransactionResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
