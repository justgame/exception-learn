package com.justgame.learn.exception.controller;

import com.justgame.learn.exception.dto.AddressDTO;
import com.justgame.learn.exception.entity.Address;
import com.justgame.learn.exception.exception.NotFindUserException;
import com.justgame.learn.exception.exception.apiexception.ApiException;
import com.justgame.learn.exception.exception.apiexception.ApiNotFindUserException;
import com.justgame.learn.exception.service.IAddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author XieCl
 * @ClassName: TestController
 * @Description:
 * @date 2017-09-06 23:23
 */
@RequestMapping("/address")
@RestController
public class TestController {
    @Resource
    private IAddressService addressService;

    @PostMapping("/add")
    public AddressDTO add(@Valid AddressDTO addressDTO) {
        Address address = new Address();
        BeanUtils.copyProperties(addressDTO, address);
        Address result;
        try {
            result = addressService.createAddress(addressDTO.getUid(), address);
        } catch (NotFindUserException e) {
            throw new ApiNotFindUserException("没有找到用户");
        } catch (Exception e) {
            throw new ApiException();
        }
        AddressDTO resultDTO = new AddressDTO();
        BeanUtils.copyProperties(result, addressDTO);
        resultDTO.setUid(result.getUser().getId());
        return resultDTO;
    }
}
