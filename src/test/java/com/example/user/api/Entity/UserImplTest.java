package com.example.user.api.Entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserImplTest {
    UserImpl ui = new UserImpl();

    @Test
    public void getId() {
        ui.setId(1);
        assertEquals(1, ui.getId());
    }

    @Test
    public void getName() {
        ui.setName("giTestName");
        assertEquals("giTestName", ui.getName());
    }
}