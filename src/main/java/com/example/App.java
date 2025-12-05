package com.example;
public class App {
    public static void main(String[] args) {
        String env = System.getenv("ENV");
        String apiKey = System.getenv("API_KEY");  // Changed from getProperty to getenv
        System.out.println("Environment: " + env);
        if (apiKey != null && !apiKey.isEmpty()) {
            System.out.println("Secret retrieved successfully.");
        } else {
            System.out.println("Failed to retrieve secret.");
        }
    }
}
