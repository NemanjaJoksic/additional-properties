package org.joksin.additionalproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Config {

    @Value("${app.name:#{null}}")
    private String appName;

    @Value("${app.security.enabled:#{null}}")
    private Boolean appSecurityEnabled;

    @Value("${app.user-service.url:#{null}}")
    private String appUserServiceUrl;

    @Value("${app.user-service.username:#{null}}")
    private String appUserServiceUsername;

    @Value("${app.user-service.password:#{null}}")
    private String appUserServicePassword;

    public Map<String, Object> toMap() {
        Map<String, Object> configMap = new HashMap<>();
        configMap.put("appName", appName);
        configMap.put("appSecurityEnabled", appSecurityEnabled);
        configMap.put("appUserServiceUrl", appUserServiceUrl);
        configMap.put("appUserServiceUsername", appUserServiceUsername);
        configMap.put("appUserServicePassword", appUserServicePassword);
        return configMap;
    }

}
