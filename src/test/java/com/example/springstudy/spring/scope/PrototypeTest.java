package com.example.springstudy.spring.scope;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest {

    @Test
    public void singletonScope() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(
                SingletonBean.class, SingletonClientBean.class);

        Set<SingletonBean> beans = new HashSet<>();

        //DL (Dependency Lookup)
        //bean을 개발자들이 직접 컨테이너에서 api를 이용해 lookup하는 것을 말함
        beans.add(ac.getBean(SingletonBean.class));
        beans.add(ac.getBean(SingletonBean.class));
        assertEquals(beans.size(), 1);

        //DI (Dependency Injection)
        //각 class 의존관계를 빈 설정 정보를 바탕으로 컨테이너가 자동으로 연결
        beans.add(ac.getBean(SingletonClientBean.class).bean1);
        beans.add(ac.getBean(SingletonClientBean.class).bean2);
        assertEquals(beans.size(), 1);
    }

    static class SingletonBean {}
    static class SingletonClientBean {
        @Autowired SingletonBean bean1;
        @Autowired SingletonBean bean2;
    }

    @Test
    public void prototypeScope(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(
                PrototypeBean.class, PrototypeClientBean.class);

        Set<PrototypeBean> beans = new HashSet<>();
        beans.add(ac.getBean(PrototypeBean.class));
        assertEquals(beans.size(), 1);
        beans.add(ac.getBean(PrototypeBean.class));
        assertEquals(beans.size(), 2);

        beans.add(ac.getBean(PrototypeClientBean.class).bean1);
        assertEquals(beans.size(), 3);
        beans.add(ac.getBean(PrototypeClientBean.class).bean2);
        assertEquals(beans.size(), 4);
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    static class PrototypeBean {}

    static class PrototypeClientBean {
        @Autowired PrototypeBean bean1;
        @Autowired PrototypeBean bean2;
    }

}

