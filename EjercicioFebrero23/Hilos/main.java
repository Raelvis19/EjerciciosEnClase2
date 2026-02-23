package EjerciciosEnClase2.EjercicioFebrero23.Hilos;

public class main {
    public static void main(String[] args) {
        boveda boveda = new boveda(50000);

        cajero c1 = new cajero("Cajero 1", boveda);
        cajero c2 = new cajero("Cajero 2", boveda);
        cajero c3 = new cajero("Cajero 3", boveda);

        Thread hilo1 = new Thread(c1);
        Thread hilo2 = new Thread(c2);
        Thread hilo3 = new Thread(c3);

        Thread monitor = new Thread(new monitorboveda(boveda));
        monitor.setDaemon(true);
        monitor.start();

        hilo1.start();
        hilo2.start();
        hilo3.start();

        try{
            hilo1.join();
            hilo2.join();
            hilo3.join();

        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("=====RESUMEN====");
            System.out.println(c1.getNombre() + ": " + c1.getTransaccioneRealizada());
            System.out.println(c2.getNombre() + ": " + c1.getTransaccioneRealizada());
            System.out.println(c3.getNombre() + ": " + c3.getTransaccioneRealizada());
            System.out.println("Saldo Final: " + boveda.getSaldo());
        }
    }
}
