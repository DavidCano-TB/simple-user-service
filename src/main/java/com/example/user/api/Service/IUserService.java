package com.example.user.api.Service;

import com.example.user.api.Entity.IUser;

import java.io.IOException;
import java.util.List;

/**
 * @author igor
 * @Last modification davcan 16.10.2019
 */

public interface IUserService<T, ID extends String> {

    List findAll();

    IUser findUserById(ID var1);

    String delete(ID var1) throws IOException;

}



