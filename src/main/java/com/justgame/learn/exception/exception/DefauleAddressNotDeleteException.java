package com.justgame.learn.exception.exception;

/**
 * @author XieCl
 * @ClassName: DefauleAddressNotDeleteException
 * @Description:
 * @date 2017-09-06 22:42
 */
public class DefauleAddressNotDeleteException extends RuntimeException {
    public DefauleAddressNotDeleteException() {
        super("此地址是该用户的默认收货地址，不能删除");
    }

    public DefauleAddressNotDeleteException(String message) {
        super(message);
    }
}
