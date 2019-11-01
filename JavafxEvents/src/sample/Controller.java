package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField1;

    public void onButtonClick(){
        System.out.println("Hello, you typed "+ textField1.getText());
    }
}
