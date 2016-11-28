package net.osmd.service.impl;

import net.osmd.models.Users;
import net.osmd.repository.UsersRepository;
import net.osmd.service.UsersService;
import org.springframework.stereotype.Service;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by WEO on 11/22/16.
 */

@Named
@ManagedBean
@SessionScoped
@Service
public class UsersServiceImpl implements UsersService {

    @Inject
    private UsersRepository usersRepository;

    @Override
    public  Users findByName(String name){
        return usersRepository.findByName(name);
    };

    @Override
    public Users addUser(Users user) {
        Users savedUser = usersRepository.saveAndFlush(user);
        return savedUser;
    }

    @Override
    public void delete(int id) {
        usersRepository.delete(id);
    }

    @Override
    public Users getById(int id) {
        return usersRepository.findOne(id);
    }

    @Override
    public Users editUser(Users user) {
        return usersRepository.saveAndFlush(user);
    }

    @Override
    public List<Users> getAll() {
        return usersRepository.findAll();
    }
}
