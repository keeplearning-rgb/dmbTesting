package com.ibm.services;

import com.ibm.model.CardsCardsAccountsGetP;
import com.ibm.model.CardsCardsAccountsGetResponseWrapper;

public interface CardsCardsAccountsGetI {

    public CardsCardsAccountsGetResponseWrapper execute(CardsCardsAccountsGetP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
