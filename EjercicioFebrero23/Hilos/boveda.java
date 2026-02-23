package EjerciciosEnClase2.EjercicioFebrero23.Hilos;
import java.util.Random;

public class boveda {
    private double saldo;

    public boveda(double sald){
        this.saldo = sald;
    }

    public synchronized boolean retirar(double monto , String cajero){
        if (saldo >= monto) {
            System.out.println(cajero + "Esta Retirando: " + monto);
            saldo -= monto;
            return true;
        }else{
            System.out.println(cajero + "Intento Retirar: " + monto + "Pero no hay fondos");
            return false;
        }
    }

    public synchronized double getSaldo(){
        return saldo;
    }

    
    
}
