package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

public class Controller {
    @FXML
    private Label label1;
    @FXML
    private Button button4;
    @FXML
    private GridPane mainGridPane;

    public void initialize(){
//        label1.setScaleX(2.0);
//        label1.setScaleY(2.0);
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleMouseOver(){
        label1.setScaleX(2.0);
        label1.setScaleY(2.0);
    }

    @FXML
    public void handleMouseExit(){
        label1.setScaleX(1.0);
        label1.setScaleY(1.0);
    }

    @FXML
    public void handleClick(){
        FileChooser chooser = new FileChooser();
        chooser.showOpenDialog(mainGridPane.getScene().getWindow());
    }
}
