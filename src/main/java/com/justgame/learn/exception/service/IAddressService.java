package com.justgame.learn.exception.service;

import com.justgame.learn.exception.entity.Address;

import java.util.List;

/**
 * @author XieCl
 * @ClassName: IAddressService
 * @Description:
 * @date 2017-09-06 1:09
 */
public interface IAddressService {
    /**
     * 创建收货地址
     * @param uid
     * @param address
     * @return
     */
    Address createAddress(Integer uid, Address address);


    /**
     * 删除收货地址
     * @param uid
     * @param aid
     */
    void deleteAddress(Integer uid, Integer aid);

    /**
     * 查询用户所有的收货地址
     * @param id
     * @return
     */
    List<Address> listAddress(Integer id);
}
