package net.osmd.service;

import net.osmd.models.Users;

import javax.inject.Named;
import java.util.List;

/**
 * Created by WEO on 11/22/16.
 */

@Named
public interface UsersService {

    Users findByName(String name);
    Users addUser (Users user);
    void delete (int id);
    Users getById (int id);
    Users editUser (Users user);
    List<Users> getAll();
}
