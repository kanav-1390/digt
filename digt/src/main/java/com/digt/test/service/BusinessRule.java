package com.digt.test.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Implementing the Business rule provoided in the task.
 */
public class BusinessRule {
    /**
     * @param filepath  path of file
     * @param character character to be comapred
     * @param value     counter with which words with length greater than to be published
     * @return
     * @throws FileNotFoundException
     */
    public Map<String, List<String>> countWords(String filepath, Character character, int value) throws FileNotFoundException {
        File file = new File(filepath);
        Map<String, List<String>> map = new HashMap<>();
        Scanner scanner = new Scanner(file);
        int counter = 0;
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        if (file.exists()) {
            while (scanner.hasNextLine()) {
                String word = scanner.next();
                if (Character.toUpperCase(word.charAt(0)) == character) {
                    counter++;
                    list.add(word);
                }
                if (word.length() > value) {
                    list2.add(word);
                }
            }
        }
        System.out.println("Total no of words found with the letter mentioned by the user is : "+counter);
        if (list.size() > 0) {
            map.put("Counter", list);
        }
        if (list2.size() > 0) {
            map.put("Words", list2);
        }
        if (map.size() > 0) {
            return map;
        } else
            return null;
    }
}
