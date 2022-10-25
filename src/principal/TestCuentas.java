package principal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCuentas {

    static Cuenta cuenta1, cuenta2;
    
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        cuenta1 = new Cuenta("12345", "Manuel", 50);
        cuenta2 = new Cuenta("67890", "Alvaro", 0);
    }

    @Test
    void test() {
        
        //assertEquals(50, cuenta1.getSaldo());
        //assertEquals(0, cuenta1.getSaldo());
        
        
        try {
            cuenta1.retirar(200);
            cuenta2.retirar(350);
            cuenta1.ingresar(100);
            cuenta2.retirar(200);
            cuenta2.retirar(150);
            cuenta1.retirar(200);
            cuenta2.ingresar(50);
            cuenta2.retirar(100);
        } catch (Exception e) {}
        
        assertEquals(-250, cuenta1.getSaldo());
        assertEquals(-450, cuenta2.getSaldo());
        
        
    }

}
