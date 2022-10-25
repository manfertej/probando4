package principal;

import java.util.List;

public class Cuenta { 
    String mNumero; 
    String nTitular; 
    List <Movimiento> mMovimientos;
    double saldo;
    
    public Cuenta(String numero, String titular, double saldoInicial) {
        
        this.mNumero = numero;
        this.saldo = saldoInicial;
        this.nTitular = titular;
    }
    
    
    
    public String getmNumero() {
        return mNumero;
    }
    public void setmNumero(String mNumero) {
        this.mNumero = mNumero;
    }
    public String getnTitular() {
        return nTitular;
    }
    public void setnTitular(String nTitular) {
        this.nTitular = nTitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public void ingresar(double x) {
        this.saldo += x; 
    }
    public void retirar(double x) throws Exception {
        
        if (this.saldo - x < -500) {
            return;
        }
        
        this.saldo -= x;
    }
}
