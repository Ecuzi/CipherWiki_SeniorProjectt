package interfaces.dataencryptionproject_sp25;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class GUIStarter extends Application {
    public static void main(String[] args) { // (does not need to be called main)
        launch(); // call launch from within MyFX class
    }
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/HomePage.fxml")));
        stage.setTitle("Cipher Wiki!");
        stage.setScene(new Scene(root,1001,717));
        stage.show();
    }
}
