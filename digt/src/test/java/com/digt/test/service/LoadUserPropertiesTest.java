package com.digt.test.service;

import com.digt.test.model.Config;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class LoadUserPropertiesTest {
    LoadUserProperties loadUserProperties = new LoadUserProperties();

    @Test
    public void testConfig() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ClassLoader classLoader = getClass().getClassLoader();
        String filepath  = classLoader.getResource("config.json").getPath();
        Assertions.assertEquals(Config.class,objectMapper.readValue(new File(filepath), Config.class).getClass());

    }

}