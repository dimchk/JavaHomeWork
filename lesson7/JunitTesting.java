package lesson7;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JunitTesting {

    @BeforeAll
    @Test
    static void testBefore()
    {
        System.out.println("BeforeAll");
    }
}
