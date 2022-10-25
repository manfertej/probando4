package principal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAutomatico {

    @Test
    void testSuma() {
        assertEquals(5, Matematicas.suma(2,3));
    }
}
