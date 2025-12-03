
package com.example;

import java.io.InputStream;

public class App {
    private static final String API_KEY_PROPERTY_NAME = "saas.api.key";
    
    public static void main(String[] args) {
        String apiKey = System.getProperty(API_KEY);
        
        if (apiKey != null && !apiKey.isEmpty()) {
            System.out.println("API Key: " + apiKey);
        } else {
            System.err.println("API Key not found.");
            System.exit(1);
        }
    }
}
