package org.joksin.additionalproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConfigController {

    @Autowired
    private Config config;

    @GetMapping("/config")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, Object> getConfig() {
        return config.toMap();
    }

}
