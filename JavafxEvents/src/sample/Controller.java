package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField1;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;

    @FXML
    private CheckBox clearTextFieldCB;

    @FXML
    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClick(ActionEvent e){
        if(e.getSource().equals(helloButton)){
            System.out.println("hello, your input "+textField1.getText());
        } else if(e.getSource().equals(byeButton)) {
            System.out.println("bye, your input "+textField1.getText());
        } else {
            System.out.println("unknown button");
        }
        if(clearTextFieldCB.isSelected()){
            textField1.clear();
        }
    }

    @FXML
    public void handleChange(){
        System.out.println("Checkbox state: " + (clearTextFieldCB.isSelected() ? "checked": "not checked"));
    }

    @FXML
    public void handleKeyReleased(){
        String text = textField1.getText();
        boolean buttonsDisabled = text.isEmpty() | text.trim().isEmpty();
        helloButton.setDisable(buttonsDisabled);
        byeButton.setDisable(buttonsDisabled);
    }
}
