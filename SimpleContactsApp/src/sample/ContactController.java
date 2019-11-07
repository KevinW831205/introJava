package sample;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.datamodel.Contact;

public class ContactController {

    @FXML
    private TextField firstNameInput;
    @FXML
    private TextField lastNameInput;
    @FXML
    private TextField phoneNumberInput;
    @FXML
    private TextField notesInput;

    public Contact getNewContact(){
        String firstName = firstNameInput.getText();
        String lastName = lastNameInput.getText();
        String phoneNumber = phoneNumberInput.getText();
        String notes = notesInput.getText();

        Contact newContact = new Contact(firstName, lastName, phoneNumber, notes);
        return newContact;
    }

}
