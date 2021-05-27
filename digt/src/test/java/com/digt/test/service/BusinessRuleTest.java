package com.digt.test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusinessRuleTest {
    BusinessRule businessRule=new BusinessRule();

    @Test
    void countWordsTest() throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        String path  = classLoader.getResource("test.txt").getPath();
        Map<String, List<String>> map;
        map=businessRule.countWords(path,'M',4);
        Assertions.assertEquals(map.get("Counter").size(),3);
        Assertions.assertEquals(map.get("Words").size(),2);

    }

}