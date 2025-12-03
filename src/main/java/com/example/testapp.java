package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {
    
    public static void main(String[] args) {
        
        // 1. Initialize the Properties object
        Properties config = new Properties();

        // 2. Locate and open the properties file from the classpath
        try (InputStream input = App.class.getClassLoader().getResourceAsStream("application.properties")) {
            
            if (input == null) {
                System.out.println("Error: application.properties file not found in the classpath.");
                return;
            }

            // 3. Load the key-value pairs from the InputStream into the Properties object
            config.load(input);

            // 4. Retrieve the API Key using its key name
            String apiKey = config.getProperty("saas.api.key");

            // 5. Print the retrieved key
            System.out.println("Successfully loaded API Key:");
            System.out.println("API Key: " + apiKey);
            
        } catch (IOException ex) {
            // Handle exceptions that occur during file reading
            System.out.println("An error occurred while reading the file:");
            ex.printStackTrace();
        }
    }
}