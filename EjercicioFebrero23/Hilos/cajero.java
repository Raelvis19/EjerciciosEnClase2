package EjerciciosEnClase2.EjercicioFebrero23.Hilos;
import java.util.Random;


public class cajero implements Runnable{
    private String nombre;
    private boveda boveda;
    private int transacionesRealizadas = 0;
    private Random random = new Random();

    public cajero(String nomb , boveda bove){
        this.nombre = nomb;
        this.boveda = bove;
    }

    @Override
    public void run(){
        int clientes = random.nextInt(3) + 3;
        for(int i = 0; i < clientes; i++){
            try{
                int tiempo = (random.nextInt(3)+1) * 1000;
                Thread.sleep(tiempo);

                double monto = random.nextInt(1501) + 500;

                boolean ok = boveda.retirar(monto, nombre);
                if(ok){
                    transacionesRealizadas++;
                }
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("El cajero: " + nombre + "Termino");
        
    }

    public int getTransaccioneRealizada(){
        return transacionesRealizadas;
    }
    public String getNombre(){
        return nombre;
    }

}
