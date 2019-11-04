package sampleToDo;

import dataModel.ToDoData;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import dataModel.Todoitem;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField descriptionInput;
    @FXML
    private TextArea detailInput;
    @FXML
    private DatePicker deadlineInput;

    public void processResult(){
        String descriptionVal = descriptionInput.getText().trim();
        String detailVal = detailInput.getText().trim();
        LocalDate deadlineVal = deadlineInput.getValue();

        ToDoData.getInstance().addTodoItem(new Todoitem(descriptionVal,detailVal,deadlineVal));
    }

}
