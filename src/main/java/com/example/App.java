package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {

    public String getApiKey() {
        Properties config = new Properties();
        try (InputStream input = App.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                System.out.println("Error: application.properties file not found in the classpath.");
                return null;
            }
            config.load(input);
            return config.getProperty("api.key");
        } catch (IOException ex) {
            System.out.println("An error occurred while reading the file:");
            ex.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        App app = new App();
        String apiKey = app.getApiKey();

        if (apiKey != null) {
            System.out.println("Successfully loaded API Key:");
            System.out.println("API Key: " + apiKey);
        }
    }
}