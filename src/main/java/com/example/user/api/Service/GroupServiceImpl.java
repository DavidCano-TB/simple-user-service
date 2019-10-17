package com.example.user.api.Service;

import com.example.user.api.Entity.GroupImpl;
import com.example.user.api.Entity.IGroup;
import com.example.user.api.Repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author davcan 16.10.2019
 */

@RestController
public class GroupServiceImpl implements IGroupService {

    @Autowired
    GroupRepository groupRepository;

    @Override
    @GetMapping("/group")
    public List findAll() {
        return groupRepository.findAll();
    }

    @GetMapping("/group/{id}")
    public IGroup findGroupById(@PathVariable String id) {
        int groupId = Integer.parseInt(id);
        return groupRepository.findOne(groupId);
    }

    @PostMapping("/group/create")
    public IGroup create(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        String userId = body.get("userId");
        return (IGroup) groupRepository.save(new GroupImpl(name, userId));
    }

    @PutMapping("/group/{id}")
    public GroupImpl update(@PathVariable String id, @RequestBody Map<String, String> body) throws IOException {
        int userId = Integer.parseInt(id);
        try {
            GroupImpl groupImpl = (GroupImpl) groupRepository.findOne(userId);
            groupImpl.setName(body.get("name"));
            groupImpl.setUserId(body.get("userpId"));
            groupRepository.save(groupImpl);
            return groupImpl;
        } catch (NullPointerException e) {
            return null;
        }
    }

    @DeleteMapping("group/{id}")
    public String delete(@PathVariable String id) {
        if (id != null) {
            int groupId = Integer.parseInt(id);
            groupRepository.delete(groupId);
            return "deleted";
        }
        return "the argument is null";
    }
}