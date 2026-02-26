package EjerciciosEnClase2.EjercicioFebrero25;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


public class GeneradorReporte {

    public static void generar(ResultadoCompartido resultado, long tiempoMs) {

        try (FileWriter fw = new FileWriter("estadisticas.txt")) {

            fw.write("=== REPORTE DE PALABRAS ===\n\n");

            for (Map.Entry<String, Integer> entry :
                    resultado.getResultados().entrySet()) {

                fw.write("Archivo: " + entry.getKey() + "\n");
                fw.write("Cantidad de palabras: " + entry.getValue() + "\n\n");
            }

            fw.write("TOTAL DE PALABRAS: " +
                    resultado.getTotalPalabras() + "\n");

            fw.write("Tiempo de procesamiento: " +
                    tiempoMs + " ms\n");

            System.out.println("Reporte generado: estadisticas.txt");

        } catch (IOException e) {
            System.out.println("Error al escribir reporte: " + e.getMessage());
        }
    }
}
