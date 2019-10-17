package com.example.user.api.Service;

import com.example.user.api.Entity.IUser;
import com.example.user.api.Entity.UserImpl;
import com.example.user.api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author davcan 16.10.2019
 */

@RestController
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @GetMapping("/user")
    public List findAll() {

        return userRepository.findAll();
    }

    @Override
    @GetMapping("/user/{id}")
    public IUser findUserById(@PathVariable String id) {
        int groupId = Integer.parseInt(id);
        return userRepository.findOne(groupId);
    }

    @PostMapping("/user/create")
    public IUser create(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        String groupId = body.get("groupId");
        return userRepository.save(new UserImpl(name, groupId));
    }

    @PostMapping("/user/search")// TODO
    public List<UserImpl> search(@RequestBody Map<String, String> body) {
        String searchTerm = body.get("name");
        return userRepository.findAllUsersFromGroupByGroupId(searchTerm);
    }

    @PutMapping("/user/{id}")
    public IUser update(@PathVariable String id, @RequestBody Map<String, String> body) throws IOException {
        {
            int userId = Integer.parseInt(id);
            try {
                UserImpl userImpl = (UserImpl) userRepository.findOne(userId);
                userImpl.setName(body.get("name"));
                userImpl.setGroupId(body.get("groupId"));
                return userRepository.save(userImpl);
            }catch (NullPointerException e) {
                return null;
            }
        }
    }

    @DeleteMapping("user/{id}")
    public String delete(@PathVariable String id) {
        if(id != null) {
            int userId = Integer.parseInt(id);
            userRepository.delete(userId);
            return "deleted";
        }
        return "the argument is null";
    }
}