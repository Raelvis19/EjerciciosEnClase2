package EjerciciosEnClase2.EjercicioFebrero23.Hilos;

public class monitorboveda implements Runnable {

    private boveda boveda;

    public monitorboveda(boveda boveda) {
        this.boveda = boveda;
    }

    @Override
    public void run(){
        try{
            while (true) {
                System.out.println("Saldo actual: " + boveda.getSaldo());
                Thread.sleep(2000);
            }
        }catch(Exception e){
            System.out.println("Monitor detenido: " + e.getMessage());
        }
    }

    
}
