



import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;



public class PersonajesController {

    @FXML
    private TableView<Personaje> tablaPersonajes;

    @FXML
    private TableColumn<Personaje,String> colNombre;

    @FXML
    private TableColumn<Personaje,String> colRaza;

    @FXML
    private TableColumn<Personaje,Integer> colPoder;

    @FXML
    private TableColumn<Personaje,String> colPlaneta;

    @FXML
    private TableColumn<Personaje,String> colTecnica;

    @FXML
    private TableColumn<Personaje,Integer> colEdad;

    @FXML
    public void initialize(){

        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colRaza.setCellValueFactory(new PropertyValueFactory<>("raza"));
        colPoder.setCellValueFactory(new PropertyValueFactory<>("nivelPoder"));
        colPlaneta.setCellValueFactory(new PropertyValueFactory<>("planetaOrigen"));
        colTecnica.setCellValueFactory(new PropertyValueFactory<>("tecnicaEspecial"));
        colEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));

    }
    

}