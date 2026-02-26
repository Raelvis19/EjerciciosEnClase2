package EjerciciosEnClase2.EjercicioFebrero25;

public class main {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();

        ResultadoCompartido resultado = new ResultadoCompartido();

        
        ContadorPalabrasHilo h1 =
                new ContadorPalabrasHilo("texto1.txt", resultado);
        ContadorPalabrasHilo h2 =
                new ContadorPalabrasHilo("texto2.txt", resultado);
        ContadorPalabrasHilo h3 =
                new ContadorPalabrasHilo("texto3.txt", resultado);

        
        h1.start();
        h2.start();
        h3.start();

        
        try {
            h1.join();
            h2.join();
            h3.join();
        } catch (InterruptedException e) {
            System.out.println("Error esperando hilos.");
        }

        long fin = System.currentTimeMillis();

        
        GeneradorReporte.generar(resultado, (fin - inicio));
    }
}