package com.test.TestLayer.testingweb.junit;

import org.junit.jupiter.api.Test;//junit for sanity tests
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest ///tells Spring Boot to look for a main configuration class (one with @SpringBootApplication, for instance) and use that to start a Spring application context.
public class TestingWebApplicationTest {

    @Test
    public void contextLoads() {
    }
}
