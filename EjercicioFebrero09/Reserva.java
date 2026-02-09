package EjercicioFebrero09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reserva {

    private String nombreCliente;
    private Date fechaReserva;
    private int cantidadPersonas;

    public Reserva(String nombreCliente, String fechaTexto, int cantidadPersonas)
        throws ReservaInvalidaException {

        // VALIDACIÓN NOMBRE
        if (nombreCliente == null || nombreCliente.trim().isEmpty()) {
            throw new ReservaInvalidaException("Nombre invalido.");
        }
        this.nombreCliente = nombreCliente.trim();

        // VALIDACIÓN FECHA
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // no permite fechas raras

        try {
            this.fechaReserva = sdf.parse(fechaTexto);
        } catch (ParseException e) {
            throw new ReservaInvalidaException("Formato de fecha incorrecto. Use dd/MM/yyyy");
        }

        // VALIDACIÓN PERSONAS
        if (cantidadPersonas <= 0) {
            throw new ReservaInvalidaException("Cantidad de personas debe ser mayor a 0.");
        }

        this.cantidadPersonas = cantidadPersonas;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Cliente: " + nombreCliente +
               " | Fecha: " + sdf.format(fechaReserva) +
               " | Personas: " + cantidadPersonas;
    }
}

