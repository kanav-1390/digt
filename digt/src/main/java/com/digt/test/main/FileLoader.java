package com.digt.test.main;

import com.digt.test.service.LoadUserProperties;

import java.io.IOException;

/**
 * Main class
 */

public class FileLoader {
    //Config config;
    public static void main(String[] args) throws IOException {
       new  LoadUserProperties().loadConfigs(args[0]);
    }
}
