package com.justgame.learn.exception.dao;

import com.justgame.learn.exception.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author XieCl
 * @ClassName: IUserDAO
 * @Description:
 * @date 2017-09-06 1:05
 */
@Repository
public interface IUserDAO extends JpaRepository<User, Integer> {
}
