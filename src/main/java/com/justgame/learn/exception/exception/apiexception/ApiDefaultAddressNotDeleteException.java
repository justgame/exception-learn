package com.justgame.learn.exception.exception.apiexception;

/**
 * @author XieCl
 * @ClassName: ApiDefaultAddressNotDeleteException
 * @Description:
 * @date 2017-09-06 23:20
 */
public class ApiDefaultAddressNotDeleteException extends ApiException {
    public ApiDefaultAddressNotDeleteException(String message) {
        super(AddressErrorCode.DefaultAddressNotDeleteErrorCode, message, null);
    }
}
