package principal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCuentas {

    Cuenta cuenta1 = new Cuenta("12345", "Manuel", 50);
    //Cuenta cuenta2 = new Cuenta("67890", "Alvaro", 0);
    
    @Test
    void test() {
        
        cuenta1.retirar(100);
        assertEquals(-250, cuenta1.getSaldo());
    }

}
