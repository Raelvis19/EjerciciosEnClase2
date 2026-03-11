import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    

    @Override
    public void start(Stage arg0) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TableView.fxml"));
        Scene eScene = new Scene(loader.load());
        arg0.setTitle("TableView");
        arg0.setScene(eScene);
        arg0.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
