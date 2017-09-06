package com.justgame.learn.exception.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author XieCl
 * @ClassName: User
 * @Description:
 * @date 2017-09-06 0:52
 */
@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
    private List<Address> addresses;
}
