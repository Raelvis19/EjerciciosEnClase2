package EjerciciosEnClase2.EjercicioFebrero23.Archivos;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaEstudiantes {
    private static final String ARCHIVO = "estudiantes.dat";
    private List<esrudiante> estudianteslista = new ArrayList();

    public SistemaEstudiantes(){
        inicializarArchivo();
        cargarDatos();
    }

    private void inicializarArchivo(){
        try{
            File f = new File(ARCHIVO);
            if (!f.exists()) {
                f.createNewFile();
                System.out.println("Archivo Creado");            
            }
        }catch(Exception e){
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    private void cargarDatos(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))){
            estudianteslista = (List<esrudiante>) ois.readObject();
            System.out.println("Estudiantes cargados correctamente..");

        }catch(Exception e){
            System.out.println("Archivo no encontrado , corrupto o vacio: " + e.getMessage());
        }
    }

    private void guardarDatos(){
        try (ObjectOutputStream oos =
            new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {

            oos.writeObject(estudianteslista);

        } catch (IOException e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }

    public void agregarEstudiante(esrudiante e){
        estudianteslista.add(e);
        guardarDatos();
        System.out.println("Estudiante agregado");
    }

    public void listarEstudiantes(){
        if(estudianteslista.isEmpty()){
            System.out.println("No hay estudiantes registrados aun");
            return;
        }

        for (esrudiante esrudiante : estudianteslista) {
            System.out.println(esrudiante);
        }
    }

    public void buscarPorMatricula(String matriculaBuscada){
        try(RandomAccessFile raf = new RandomAccessFile(ARCHIVO, "r")){
            if (estudianteslista.isEmpty()) {
                System.out.println("No hay estudiantes para buscar");
                return;
            }
            boolean encontrado = false;
            for (esrudiante esrudiante : estudianteslista) {
                if (esrudiante.getMatricula().equalsIgnoreCase(matriculaBuscada)) {
                    System.out.println("Encontrado " + esrudiante);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Estudiante no encontrado");
            }

        }catch(Exception e){
            System.out.println("Archivo no encontrado o error al abrirlo: " + e.getMessage());
        }
    }
}
