package com.example.user.api.Repository;

import com.example.user.api.Entity.IUser;
import com.example.user.api.Entity.UserImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author davcan 16.10.2019
 */

@Repository
public interface UserRepository extends JpaRepository<UserImpl, Integer> {

    List<UserImpl> findAllUsersFromGroupByGroupId(String text);
}
