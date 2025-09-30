package eu.markurion.enchancedtodolist;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button btn_newTask;
    @FXML
    private Button btn_newIdea;
    @FXML
    private Text text_current;
    @FXML
    private Text text_ideas;
    @FXML
    public Text text_done;
    @FXML
    private Button btn_current;
    @FXML
    private Button btn_ideas;
    @FXML
    private Button btn_done;
    @FXML
    private Button btn_groups;
    @FXML
    private Button btn_settings;
    @FXML
    private Button btn_info;
    @FXML
    private Text text_main;
    @FXML
    private Text txt_now;
    @FXML
    private TextField txtField_now;
    @FXML
    private Text txt_infoBar;

    public MainController(){
        System.out.println("Main Controller Initialize Part \n");
    }

    // This method is called by the FXMLLoader when initialization is complete
    @FXML public void initialize() throws IOException {
        System.out.println("Main Controller Initialize Part 2 \n");
        this.btn_info.setOnAction(event -> {
            try {
                btnInfoClicked();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void btnInfoClicked() throws IOException {
        System.out.println("Info button clicked");
        showInfoScene();
    }

    public void showInfoScene() throws IOException{
        FXMLLoader infoLoader = new FXMLLoader(getClass().getResource("info.fxml"));
        Image icon = new Image(String.valueOf(getClass().getResource("info.png")));
        root = infoLoader.load();
        Scene scene = new Scene(root);
        Stage stageinfo = new Stage();

        InfoController infoController = infoLoader.getController();
        infoController.setStage(stageinfo);
        stageinfo.getIcons().add(icon);
        stageinfo.setScene(scene);
        stageinfo.setResizable(false);
        stageinfo.setTitle("Info");
        stageinfo.show();
    }
}


