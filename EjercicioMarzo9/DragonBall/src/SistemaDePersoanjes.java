import java.util.ArrayList;

public class SistemaDePersoanjes {
    



    private ArrayList<Personaje> personajes;

    public SistemaDePersoanjes() {
        personajes = new ArrayList<>();
    }

    
    public void registrarPersonaje(Personaje p) {
        personajes.add(p);
    }

    
    public void mostrarPersonajes() {

        if (personajes.isEmpty()) {
            System.out.println("No hay personajes registrados.");
            return;
        }

        for (Personaje p : personajes) {
            System.out.println(p);
        }
    }

    
    public Personaje buscarPersonaje(String nombre) {

        for (Personaje p : personajes) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }

        return null;
    }
}
    

