package EjercicioFebrero09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // LISTA, NO ARRAY
        List<Reserva> reservas = new ArrayList<>();

        int opcion = -1;

        while (opcion != 0) {
            try {

                System.out.println("\n--- MENU RESERVAS ---");
                System.out.println("1. Registrar reserva");
                System.out.println("2. Mostrar reservas");
                System.out.println("0. Salir");
                System.out.print("Opción: ");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1:
                        try {
                            System.out.print("Nombre cliente: ");
                            String nombre = sc.nextLine();

                            System.out.print("Fecha (dd/MM/yyyy): ");
                            String fecha = sc.nextLine();

                            System.out.print("Cantidad personas: ");
                            int personas = Integer.parseInt(sc.nextLine());

                            Reserva r = new Reserva(nombre, fecha, personas);
                            reservas.add(r);

                            System.out.println("Reserva registrada correctamente.");

                        } catch (ReservaInvalidaException e) {
                            System.out.println("Error de reserva: " + e.getMessage());
                        } catch (NumberFormatException e) {
                            System.out.println("Debe ingresar números válidos.");
                        }
                        break;

                    case 2:
                        if (reservas.isEmpty()) {
                            System.out.println("No hay reservas registradas.");
                        } else {
                            for (Reserva r : reservas) {
                                System.out.println(r); // usa toString()
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }

            } catch (Exception e) {
                // CAPTURA GENERAL → el programa nunca se cae
                System.out.println("Error inesperado. Intente nuevamente.");
            }
        }

        sc.close();
    }
}

