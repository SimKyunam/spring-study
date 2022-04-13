package com.example.springstudy.spring.ymls;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Component
@RequiredArgsConstructor
public class AppValueProperties {
    private final AuthValue authValue;
    private final OAuth2Value oauth2Value;

    @Getter
    @Setter
    @Component
    public static class AuthValue {
        @Value("${app.auth.tokenSecret}")
        private String tokenSecret;
        @Value("${app.auth.tokenExpirationMsec}")
        private long tokenExpirationMsec;
    }

    @Getter
    @Setter
    @Component
    public static class OAuth2Value {
        @Value("${app.oauth2.authorizedRedirect}")
        private List<String> authorizedRedirect;

        @Value("${app.oauth2.authorizedRedirectTest}")
        private List<String> authorizedRedirectTest;

        public OAuth2Value authorizedRedirectUris(List<String> authorizedRedirect, List<String> authorizedRedirectTest) {
            this.authorizedRedirect = authorizedRedirect;
            this.authorizedRedirectTest = authorizedRedirectTest;

            return this;
        }
    }
}
