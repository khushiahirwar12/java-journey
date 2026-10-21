final class SecuritySystem {
    void authenticateUser(String username) {
        System.out.println("Authenticating: " + username);
    }
}

class BaseConfig {
    final String appVersion = "v2.4.0";
    final double PI = 3.14159;

    final void printSecurityPolicy() {
        System.out.println("Policy: Strict 256-bit encryption active.");
    }

    void displayAppInfo() {
        System.out.println("Application Version: " + appVersion);
        System.out.println("PI Value: " + PI);
    }
}

class ExtendedConfig extends BaseConfig {
    @Override
    void displayAppInfo() {
        super.displayAppInfo();
        System.out.println("Extended configuration loaded successfully.");
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        String leadEngineer = "Khushi Ahirwar";
        System.out.println("System Configurator: " + leadEngineer);
        System.out.println("----------------------------------");

        ExtendedConfig config = new ExtendedConfig();
        config.displayAppInfo();
        config.printSecurityPolicy();

        SecuritySystem security = new SecuritySystem();
        security.authenticateUser(leadEngineer);
    }
}
