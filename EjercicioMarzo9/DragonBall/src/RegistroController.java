

import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;


public class RegistroController {

    @FXML
    private TextField txtNombre;

    @FXML
    private MenuButton menuRaza;

    @FXML
    private TextField txtPoder;

    @FXML
    private TextField txtPlaneta;

    @FXML
    private TextField txtTecnica;

    @FXML
    private TextField txtEdad;

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

        System.out.println("Personaje registrado correctamente");
    }
}