package EjerciciosEnClase2.EjercicioFebrero23.Archivos;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        SistemaEstudiantes sistemaEstudiantes = new SistemaEstudiantes();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("----MENU----");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Buscar por matricula");
            System.out.println("3. Listar Estudiantes");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese La Matricula: ");
                    String matricula = sc.nextLine();
                    System.out.println("Ingrese el Promedio: ");
                    double promedio = sc.nextDouble();
                    sistemaEstudiantes.agregarEstudiante(new esrudiante(nombre, matricula, promedio));

                    break;
                case 2:
                    System.out.println("Ingrese la matricula que quiere buscar: ");
                    String buscar = sc.nextLine();
                    sistemaEstudiantes.buscarPorMatricula(buscar);
                    break;
                case 3:
                    sistemaEstudiantes.listarEstudiantes();
                    break;
                case 0:
                    System.out.println("Saliendooo");
                    break;
            
                default:
                    System.out.println("Opcion no valida");
                    
            }


        }while(opcion != 0);

        sc.close();
        
    }
    
}
