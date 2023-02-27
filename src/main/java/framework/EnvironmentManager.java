package framework;

import utils.LoggerManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EnvironmentManager {
    private static final LoggerManager log = LoggerManager.getInstance();
    private static final String envFilePath = System.getProperty("user.dir") + File.separator + "environments.properties";
    private static EnvironmentManager instance;
    private Properties properties;
    private String envId;

    private EnvironmentManager() {
        initialize();
    }

    private void initialize(){
        String aeEnvironmentId = System.getProperty("envId");
        if ((aeEnvironmentId == null) || (aeEnvironmentId.isEmpty())) {
            envId = "local";
        } else {
            envId = aeEnvironmentId.toLowerCase();
        }
        log.info("AutomationExercise Environment Id --> " + envId);

        properties = new Properties();
        Properties envProperties = new Properties();
        try {
            envProperties.load(new FileInputStream(envFilePath));
        } catch (IOException e) {
            log.error("unable to load properties file");
        }
        properties.putAll(envProperties);
    }

    public static EnvironmentManager getInstance() {
        if (instance == null) {
            instance = new EnvironmentManager();
        }
        return instance;
    }

    private String getEnvironmentSetting(String setting) {
        return (String) getInstance().properties.get(setting);
    }

    public String getEnvId() {
        return envId;
    }

    public String getBaseURL() {
        return getEnvironmentSetting(getEnvId() + ".baseURL");
    }

    public String getUsername(String userRole) {
        return getEnvironmentSetting(getEnvId() + "." + userRole + ".username");
    }

    public String getPassword(String userRole) {
        return getEnvironmentSetting(getEnvId() + "." + userRole + ".password");
    }

    public String getUserEmail(String userRole) {
        return getEnvironmentSetting(getEnvId() + "." + userRole + ".email");
    }

}