package com.sparrow.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {
    List<User> getUserByUsername(String username);

    @Query(value = "select * from t_user where id=(select max(id) from t_user)", nativeQuery = true)
    User maxIdUser();
}