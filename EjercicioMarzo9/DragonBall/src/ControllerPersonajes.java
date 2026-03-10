import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.MenuButton;



public class ControllerPersonajes {
    





    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPoder;

    @FXML
    private TextField txtPlaneta;

    @FXML
    private TextField txtTecnica;

    @FXML
    private TextField txtEdad;

    @FXML
    private MenuButton menuRaza;

    private static SistemaDePersoanjes sistema = new SistemaDePersoanjes();

    @FXML
    private void agregarPersonaje() {

        String nombre = txtNombre.getText();
        String raza = menuRaza.getText();
        int poder = Integer.parseInt(txtPoder.getText());
        String planeta = txtPlaneta.getText();
        String tecnica = txtTecnica.getText();
        int edad = Integer.parseInt(txtEdad.getText());

        Personaje p = new Personaje(nombre, raza, poder, planeta, tecnica, edad);

        sistema.registrarPersonaje(p);

        System.out.println("Personaje registrado");
    }
}

