package com.yu.dao;

import com.yu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Auther: yuchangying
 * @Date: 2018/11/26 11:32
 * @Description:
 * @Email yu.changying@trs.com.cn
 * @Version 1.0
 */
@Repository
public interface UserDao extends JpaRepository<User,Long> {

}
