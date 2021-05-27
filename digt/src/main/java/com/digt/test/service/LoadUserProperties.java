package com.digt.test.service;

import com.digt.test.model.Config;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LoadUserProperties {

    ObjectMapper objectMapper = new ObjectMapper();

    /**
     * @param filepath json filepath given in the args
     * @return config file which can be used
     * @throws IOException
     */
    public void loadConfigs(String filepath) throws IOException {
        Config config = objectMapper.readValue(new File(filepath), Config.class);
        BusinessRule businessRule = new BusinessRule();
        Map<String, List<String>> map;
        map = businessRule.countWords(config.getFileName(), config.getCharacterToCompare(), config.getCharacterCount());
        if (map.get("Counter") != null)
            System.out.println("Words Spotted which start with the letter mentioned by the user " + map.get("Counter"));
        if (map.get("Words") != null)
            System.out.println("Word found with length greater than " + config.getCharacterToCompare() +
                    " are " + map.get("Words"));
    }
}

