package Assignment_13;

public class Configuration {
    static{
        System.out.println("Loading Configuration .....");
        configValue = 1;
    }
    static int configValue;
    static int getConfigValue() {
        return configValue;
    }
}
