package com.example.springstudy.spring.ymls;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class YmlPropertyTest {

    @Autowired
    BaseProperties baseProperties;

    @Autowired
    AppProperties appProperties;

    @Autowired
    AppValueProperties appValueProperties;

    @Test
    void BaseProperties_테스트(){
        List<String> username = baseProperties.getUsername();
        List<String> password = baseProperties.getPassword();
        Long userAge = baseProperties.getUserAge();
        List<String> userList = baseProperties.getUserList();

        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("userAge: " + userAge);
        System.out.println("userList: " + userList);
    }

    @Test
    void AppProperties_테스트(){
        long tokenExpirationMsec = appProperties.getAuth().getTokenExpirationMsec();
        String tokenSecret = appProperties.getAuth().getTokenSecret();

        List<String> authorizedRedirectUris = appProperties.getOauth2().getAuthorizedRedirectUris();

        System.out.println("tokenExpirationMsec: " + tokenExpirationMsec);
        System.out.println("tokenSecret: " + tokenSecret);
        System.out.println("authorizedRedirectUris: " + authorizedRedirectUris);
    }

    @Test
    void AppValueProperties_테스트(){
        long tokenExpirationMsec = appValueProperties.getAuthValue().getTokenExpirationMsec();
        String tokenSecret = appValueProperties.getAuthValue().getTokenSecret();

        List<String> authorizedRedirect = appValueProperties.getOauth2Value().getAuthorizedRedirect();
        List<String> authorizedRedirectTest = appValueProperties.getOauth2Value().getAuthorizedRedirectTest();

        System.out.println("tokenExpirationMsec: " + tokenExpirationMsec);
        System.out.println("tokenSecret: " + tokenSecret);
        System.out.println("authorizedRedirect: " + authorizedRedirect);
        System.out.println("authorizedRedirectTest: " + authorizedRedirectTest);
    }
}