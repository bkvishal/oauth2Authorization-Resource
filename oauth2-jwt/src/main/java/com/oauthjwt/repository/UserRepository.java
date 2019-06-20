package com.oauthjwt.repository;

import com.oauthjwt.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author : Vishal Srivastava
 * @Date : 14-06-2019
 **/
@Repository
public interface UserRepository  extends JpaRepository<Users, Integer> {

    @Query("select cd from Users cd where cd.username = :username")
    Users findByUsername(@Param("username") String username);

}
