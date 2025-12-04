package com.example
public class App {
    public static void main(String[] args) {
        String apiKey = System.getenv("API_KEY");

        if (apiKey != null && !apiKey.isEmpty()) {
            System.out.println("Secret retrieved successfully.");
        } else {
            System.out.println("Failed to retrieve secret.");
        }
    }
}
