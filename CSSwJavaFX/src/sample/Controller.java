package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label label1;

    public void initialize(){
//        label1.setScaleX(2.0);
//        label1.setScaleY(2.0);
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
}
