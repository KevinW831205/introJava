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

    public Todoitem processResult(){
        String descriptionVal = descriptionInput.getText().trim();
        String detailVal = detailInput.getText().trim();
        LocalDate deadlineVal = deadlineInput.getValue();

        Todoitem newItem = new Todoitem(descriptionVal,detailVal,deadlineVal);
        ToDoData.getInstance().addTodoItem(newItem);
        return newItem;
    }

    public void populateWhenEdit(Todoitem editingItem){
        descriptionInput.setText(editingItem.getDescription());
        detailInput.setText(editingItem.getDetails());
        deadlineInput.setValue(editingItem.getDeadline());
    }

    public Todoitem editResult(Todoitem editingItem){
        String descriptionVal = descriptionInput.getText().trim();
        String detailVal = detailInput.getText().trim();
        LocalDate deadlineVal = deadlineInput.getValue();

        ToDoData.getInstance().editTodoItem(editingItem,descriptionVal,detailVal,deadlineVal);
        return editingItem;
    }

}
