package eu.markurion.enchancedtodolist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Image icon = new Image(String.valueOf(getClass().getResource("icon.png")));

        stage.getIcons().add(icon);
        stage.setTitle(Version.NAME +  " " + Version.VERSION);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Mainmenu.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
