package com.ibm.services.impl;
 
import java.util.*;
 
import com.ibm.model.UpdateDirectDebitsP;
import com.ibm.model.UpdateDirectDebitsResponseWrapper;
import com.ibm.services.UpdateDirectDebitsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class UpdateDirectDebitsImpl implements UpdateDirectDebitsI {
 
    private static final Log logger = LogFactory.getLog(UpdateDirectDebitsImpl.class);
   
    public UpdateDirectDebitsResponseWrapper reliable(UpdateDirectDebitsP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new UpdateDirectDebitsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public UpdateDirectDebitsResponseWrapper execute(UpdateDirectDebitsP requestParams){
        //TODO
        return new UpdateDirectDebitsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
