package com.justgame.learn.exception.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author XieCl
 * @ClassName: AddressDTO
 * @Description:
 * @date 2017-09-06 23:26
 */
@Data
public class AddressDTO {
    @NotNull
    private Integer id;
    private String privince;
    private String city;
    private String county;
    private Boolean isDefault;
    private Integer uid;
}
