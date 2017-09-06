package com.justgame.learn.exception.service;

import com.justgame.learn.exception.dao.IAddressDAO;
import com.justgame.learn.exception.dao.IUserDAO;
import com.justgame.learn.exception.entity.Address;
import com.justgame.learn.exception.entity.User;
import com.justgame.learn.exception.exception.DefauleAddressNotDeleteException;
import com.justgame.learn.exception.exception.NotFindAddressException;
import com.justgame.learn.exception.exception.NotFindUserException;
import com.justgame.learn.exception.exception.NotMatchUserAddressException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author XieCl
 * @ClassName: IAddressServiceImpl
 * @Description:
 * @date 2017-09-06 1:17
 */
@Service
public class IAddressServiceImpl implements IAddressService {
    @Resource
    private IUserDAO userDAO;
    @Resource
    private IAddressDAO addressDAO;

    @Override
    public Address createAddress(Integer uid, Address address) {
        if (null == uid) {
            throw new RuntimeException("用户id为空");
        }
        User user = userDAO.findOne(uid);
        if (null == user) {
            throw new NotFindUserException();
        }
        if (null == user.getAddresses() || user.getAddresses().isEmpty()) {
            address.setIsDefault(true);
        }
        address.setUser(user);
        Address result = addressDAO.save(address);
        return result;
    }

    @Override
    public void deleteAddress(Integer uid, Integer aid) {
        if (null == uid) {
            throw new RuntimeException("用户id为空");
        }
        User user = userDAO.findOne(uid);
        if (null == user) {
            throw new NotFindUserException();
        }
        if (null == aid) {
            throw new RuntimeException("地址id为空");
        }
        Address address = addressDAO.findOne(aid);
        if (null == address) {
            throw new NotFindAddressException();
        }
        if (!address.getUser().equals(user)) {
            throw new NotMatchUserAddressException();
        }
        if (address.getIsDefault()) {
            throw new DefauleAddressNotDeleteException();
        }
        addressDAO.delete(aid);
    }

    @Override
    public List<Address> listAddress(Integer id) {
        if (null == id) {
            throw new RuntimeException("用户id为空");
        }
        User user = userDAO.findOne(id);
        if (null == user) {
            throw new NotFindUserException();
        }
        return user.getAddresses();
    }
}
