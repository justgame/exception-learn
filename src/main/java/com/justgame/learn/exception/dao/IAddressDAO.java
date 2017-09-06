package com.justgame.learn.exception.dao;

import com.justgame.learn.exception.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author XieCl
 * @ClassName: IAddressDAO
 * @Description:
 * @date 2017-09-06 1:06
 */
@Repository
public interface IAddressDAO extends JpaRepository<Address, Integer> {
}
