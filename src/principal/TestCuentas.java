package principal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCuentas {

    Cuenta cuenta1 = new Cuenta("12345", "Manuel", 50);
    Cuenta cuenta2 = new Cuenta("67890", "Alvaro", 0);
    
    @Test
    void test() {
        
        try{ cuenta1.retirar(200); }
        catch(Exception ex){}


        try{ cuenta2.retirar(350); }
        catch(Exception ex){}
        
        cuenta1.ingresar(100);
        
        try {cuenta2.retirar(200);}
        catch (Exception e) {}
        
        try { cuenta2.retirar(150); } 
        catch (Exception e) {}
        
        try { cuenta1.retirar(200);} 
        catch (Exception e) {}

        cuenta2.ingresar(50);
        
        try { cuenta2.retirar(100); }
        catch (Exception ex){}
        
        
        assertEquals(-250, cuenta1.getSaldo());
        assertEquals(-450, cuenta2.getSaldo());
    }

}
