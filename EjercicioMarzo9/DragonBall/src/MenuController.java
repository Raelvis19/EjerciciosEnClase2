

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class MenuController {

    @FXML
    private void abrirRegistro(ActionEvent event) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("Goku.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void abrirLista(ActionEvent event) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("Personajes.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void volverMenu(ActionEvent event) throws IOException {

    FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
    Parent root = loader.load();

    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);

    stage.setScene(scene);
    stage.show();
   }

    @FXML
    private void salir() {
        System.exit(0);
    }

    @FXML
private MenuButton menuRaza;

 @FXML
 private void seleccionarRaza(ActionEvent event){

    MenuItem item = (MenuItem) event.getSource();
    menuRaza.setText(item.getText());

 }

}