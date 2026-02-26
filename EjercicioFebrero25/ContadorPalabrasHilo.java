package EjerciciosEnClase2.EjercicioFebrero25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContadorPalabrasHilo extends Thread{
    private String nombreArchivo;
    private ResultadoCompartido resultado;

    public ContadorPalabrasHilo(String nombre , ResultadoCompartido result){
        this.nombreArchivo = nombre;
        this.resultado = result;
    }

    @Override
    public void run(){
        int contador = ContarPalabras(nombreArchivo);
        resultado.agregarResultado(nombreArchivo, contador);
        System.out.println(getName() + "conto: " + nombreArchivo + "Palabras: " + contador);

    }

    private int ContarPalabras(String archivo){
        int Palabras = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea = br.readLine())!= null){
                String[] partes = linea.trim().split("\\s+");
                if (!linea.trim().isEmpty()) {
                    Palabras += partes.length;

                    
                }
            }
        }catch(IOException e){
            System.out.println("Error al lerr " + archivo + " : " + e.getMessage());
        }
        return Palabras;
    }

    
}
