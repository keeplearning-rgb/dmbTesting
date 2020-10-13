package com.ibm.services.impl;
 
import java.util.*;
 
import com.ibm.model.CardsCardsAccountsGetP;
import com.ibm.model.CardsCardsAccountsGetResponseWrapper;
import com.ibm.services.CardsCardsAccountsGetI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class CardsCardsAccountsGetImpl implements CardsCardsAccountsGetI {
 
    private static final Log logger = LogFactory.getLog(CardsCardsAccountsGetImpl.class);
   
    public CardsCardsAccountsGetResponseWrapper reliable(CardsCardsAccountsGetP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new CardsCardsAccountsGetResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public CardsCardsAccountsGetResponseWrapper execute(CardsCardsAccountsGetP requestParams){
        //TODO
        return new CardsCardsAccountsGetResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
