package alisa.learn.java.patterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PatternsApplicationTest {

    @Test
    void firstTest() {
        assertEquals("a", "a");
    }
}