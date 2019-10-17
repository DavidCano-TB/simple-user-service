package com.example.user.api.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class GroupImplTest {

    GroupImpl gi = new GroupImpl();

    @Test
    public void getId() {
        gi.setId(1);
        assertEquals(1, gi.getId());
    }

    @Test
    public void getName() {
        gi.setName("giTestName");
        assertEquals("giTestName", gi.getName());
    }

}