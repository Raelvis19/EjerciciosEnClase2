package EjerciciosEnClase2.EjercicioFebrero25;

import java.util.HashMap;
import java.util.Map;

public class ResultadoCompartido {

    private Map<String, Integer> resultados = new HashMap<>();
    private int totalPalabras = 0;

    
    public synchronized void agregarResultado(String archivo, int cantidad) {
        resultados.put(archivo, cantidad);
        totalPalabras += cantidad;
    }

    public Map<String, Integer> getResultados() {
        return resultados;
    }

    public int getTotalPalabras() {
        return totalPalabras;
    }
}
