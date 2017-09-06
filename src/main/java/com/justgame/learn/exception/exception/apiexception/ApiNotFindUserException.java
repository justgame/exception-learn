package com.justgame.learn.exception.exception.apiexception;

/**
 * @author XieCl
 * @ClassName: ApiNotFindUserException
 * @Description:
 * @date 2017-09-06 23:42
 */
public class ApiNotFindUserException extends ApiException {
    public ApiNotFindUserException(String message) {
        super(AddressErrorCode.NotFindUserErrorCode, message, null, null);
    }
}
