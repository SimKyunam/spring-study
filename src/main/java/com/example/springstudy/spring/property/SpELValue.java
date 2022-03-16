package com.example.springstudy.spring.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
@Getter
@Setter
public class SpELValue {
    @Value("#{dataBaseConfig.dbNameBySpEL}")
    private String dbName;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{systemProperties['os.version']}")
    private String osVersion;

    @Value("#{systemProperties.os}")
    private Properties osProperties;

    @Value("#{systemEnvironment.Path}")
    private String path;

}
