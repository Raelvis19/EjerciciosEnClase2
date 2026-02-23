package EjerciciosEnClase2.EjercicioFebrero23.Archivos;

import java.io.Serializable;

public class esrudiante implements Serializable {
    private static final long serialversionUID = 1L;

    private String nombre;
    private String matricula;
    private double promedio;

    public esrudiante(String nombre, String matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public String getMatricula(){
        return matricula;
    }

    @Override
    public String toString(){
        return "Estudiante: " + "Nombre = " + nombre + "  " + "Matricula = " + matricula + " " +
        "Promedio = " + promedio; 
    }


    
}
