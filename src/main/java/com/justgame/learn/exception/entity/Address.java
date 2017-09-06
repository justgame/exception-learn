package com.justgame.learn.exception.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author XieCl
 * @ClassName: Address
 * @Description:
 * @date 2017-09-06 0:55
 */
@Entity
@Data
public class Address {
    @Id
    @GeneratedValue
    private Integer id;
    private String privince;
    private String city;
    private String county;
    private Boolean isDefault;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uid")
    private User user;
}
