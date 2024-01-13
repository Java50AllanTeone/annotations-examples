package telran.configuration;

public class ConfigObjectAppl {
    public static void main(String[] args) throws Exception {
        ConfigObject configObject = new ConfigObject();
        Configuration configuration = new Configuration(configObject);
        configuration.configInjection();

        System.out.println(configObject);
    }
}
