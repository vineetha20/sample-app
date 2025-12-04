public class App {
    public static void main(String[] args) {
        // Read environment name and API key from environment variables
        String env = System.getenv("DEPLOY_ENV");
        String apiKey = System.getenv("API_KEY");

        if (env == null) env = "unknown";
        if (apiKey == null || apiKey.isEmpty()) {
            System.out.println("No API key found for " + env + " environment.");
        } else {
            System.out.println("Deploying to " + env + " environment...");
            System.out.println("Using API key: " + apiKey);
        }
    }
}
