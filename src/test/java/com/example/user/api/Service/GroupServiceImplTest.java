package com.example.user.api.Service;

import com.example.user.api.Repository.GroupRepository;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import javax.validation.constraints.AssertTrue;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static java.util.Optional.empty;
import static org.junit.Assert.*;

public class GroupServiceImplTest {


    @Autowired
    GroupRepository groupRepository;

    GroupServiceImpl gsi = new GroupServiceImpl();


    @Test
    public void create() {
        assertNotNull(gsi);
    }


}