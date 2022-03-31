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

    @Value("#{dataBaseConfig.getDbNameBySpEL()}")
    private String dbNameMethod;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{systemProperties['os.version']}")
    private String osVersion;

    @Value("#{systemProperties['java.version']}")
    private String javaVersion;

    @Value("#{systemEnvironment.Path}")
    private String path;

    @Value("#{dataBaseConfig.getDbNameBySpEL() + dataBaseConfig.getDbNameBySpEL()}")
    private String value;

    @Value("#{'hello ' + 'world'}")
    private String greeting;

    @Value("#{1 eq 5}")
    private boolean trueOrFalse;

    @Value("#{'${user.age}' eq '30'}")
    private boolean userAgeCheck;
}
