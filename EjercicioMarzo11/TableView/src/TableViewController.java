import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TableViewController {
    @FXML
    private TextField Nombre;

    @FXML
    private TextField Precio;

    @FXML
    private TextField Cantidad;

    @FXML
    private TableView<Producto> tablaProductos;

    @FXML
    private TableColumn<Producto, String> colNombre;

    @FXML
    private TableColumn<Producto, Number> colPrecio;

    @FXML
    private TableColumn<Producto, Number> colCantidad;

    private ObservableList<Producto> listaProductos = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

    colNombre.setCellValueFactory(data -> data.getValue().nombreProperty());
    colPrecio.setCellValueFactory(data -> data.getValue().precioProperty());
    colCantidad.setCellValueFactory(data -> data.getValue().cantidadProperty());

    tablaProductos.setItems(listaProductos);
    }  
    
    
   @FXML
    private void agregarProducto() {

        try {

        String nom = Nombre.getText();
        double pre = Double.parseDouble(Precio.getText());
        int cant = Integer.parseInt(Cantidad.getText());

        Producto producto = new Producto(nom, pre, cant);

        listaProductos.add(producto);

     } catch (NumberFormatException e) {
        System.out.println("Precio o cantidad inválidos");
     }
    }

    @FXML
    private void eliminarProducto() {

    Producto seleccionado = tablaProductos.getSelectionModel().getSelectedItem();

    if (seleccionado != null) {
        listaProductos.remove(seleccionado);
    }

    }

}
