package EjerciciosEnClase2.EjercicioFebrero04;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cuenta Bancaria");
            System.out.println("2. Polimorfismo Empleados");
            System.out.println("3. Ocultamiento de Atributos");
            System.out.println("4. Arrays y Referencias");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ejercicioCuenta();
                    pausa();
                    break;
                case 2:
                    ejercicioEmpleados();
                    pausa();
                    break;
                case 3:
                    ejercicioOcultamiento();
                    pausa();
                    break;
                case 4:
                    ejercicioArrays();
                    pausa();
                    break;
            }

        } while (opcion != 0);
    }

    public static void pausa() {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nPresione ENTER para volver al menu");
    sc.nextLine();
    }


    // EJERCICIO 1
    public static void ejercicioCuenta() {
        CuentaBancaria c = new CuentaBancaria("001", 1000);
        c.Depositar(500);
        c.retirar(200);
        System.out.println("Saldo final: " + c.getSaldo());
    }

    // EJERCICIO 2
    public static void ejercicioEmpleados() {
        Empleado e1 = new EmpleadoFijo(1500);
        Empleado e2 = new EmpleadoPorHora(40, 10);

        System.out.println("Salario fijo: " + e1.calcularSalario());
        System.out.println("Salario por hora: " + e2.calcularSalario());
    }

    // EJERCICIO 3
    public static void ejercicioOcultamiento() {
        A obj = new B();
        System.out.println("Valor de x: " + obj.x);

    
    }

    // EJERCICIO 4
    public static void ejercicioArrays() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;

        arr2[1] = 99;

        System.out.println("Contenido de arr1:");
        for (int n : arr1) {
            System.out.print(n + " ");
        }
    }
    
    
}
