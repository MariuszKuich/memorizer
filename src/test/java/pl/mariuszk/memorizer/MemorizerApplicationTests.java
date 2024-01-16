package pl.mariuszk.memorizer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// Steps for configuring H2 in-memory database for tests:
// 1. Add com.h2database.h2 dependency with test scope in pom.xml.
// 2. Configure H2 database in src/test/resources/application.yml properties file.
@SpringBootTest
class MemorizerApplicationTests {

    @Test
    void contextLoads() {
    }
}
