package com.usopp.repository;

import com.usopp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fov on 2017/3/11.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String userName);

}
