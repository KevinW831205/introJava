package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField1;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;

    @FXML
    public void onButtonClick(ActionEvent e){
        if(e.getSource().equals(helloButton)){
            System.out.println("hello, your input "+textField1.getText());

        } else if(e.getSource().equals(byeButton)) {
            System.out.println("bye, your input "+textField1.getText());
        } else {
            System.out.println("unknown button");
        }
    }
}
