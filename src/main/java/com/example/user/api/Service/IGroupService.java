package com.example.user.api.Service;

import com.example.user.api.Entity.IGroup;

import java.util.List;

/**
 * @author igor
 * @Last modification davcan 16.10.2019
 */

public interface IGroupService<T, ID extends String> {

    List<T> findAll();

    IGroup findGroupById(ID var1);

    T delete(ID var1);

    /**
     * @return {@code Map} of users by groupId
     */
    // Map<String, List<T>> findAllGroupByUserId();
}