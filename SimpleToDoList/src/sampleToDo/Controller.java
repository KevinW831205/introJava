package sampleToDo;

import dataModel.ToDoData;
import dataModel.Todoitem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Controller {

    private List<Todoitem> todoitems;

    @FXML
    private ListView<Todoitem> todoListView;
    @FXML
    private TextArea itemDetail;
    @FXML
    private Label deadLineLabel;
    @FXML
    private BorderPane mainBorderPane;


    public void initialize(){


//        Todoitem item1 = new Todoitem("Learn Java","do x y z practice", LocalDate.of(2019, Month.NOVEMBER,5));
//        Todoitem item2 = new Todoitem("Attend orientation","Location", LocalDate.of(2019, Month.NOVEMBER,6));
//        Todoitem item3 = new Todoitem("Something","Something more detail", LocalDate.of(2019, Month.DECEMBER,5));
//        Todoitem item4 = new Todoitem("Just example","more detail examples", LocalDate.of(2020, Month.NOVEMBER,5));
//        Todoitem item5 = new Todoitem("Birthday","Happy", LocalDate.of(2019, Month.JANUARY,5));
//        todoitems = new ArrayList<>();
//        todoitems.add(item1);
//        todoitems.add(item2);
//        todoitems.add(item3);
//        todoitems.add(item4);
//        todoitems.add(item5);
//        ToDoData.getInstance().setTodoitems(todoitems);

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Todoitem>() {
            @Override
            public void changed(ObservableValue<? extends Todoitem> observable, Todoitem oldValue, Todoitem newValue) {
                if(newValue != null){
                    Todoitem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetail.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy MM dd");
                    deadLineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });

        todoListView.getItems().setAll(ToDoData.getInstance().getTodoitems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void handleClickListView(){
        Todoitem item = todoListView.getSelectionModel().getSelectedItem();
//        System.out.println("Selected "+
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due: ");
//        sb.append(item.getDeadline());
//        itemDetail.setText(sb.toString());
        itemDetail.setText(item.getDetails());
        deadLineLabel.setText(item.getDeadline().toString());
    }

    @FXML
    public void showAddTodoItemDialog(){
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        try{
            Parent root = FXMLLoader.load(getClass().getResource("addTodoDialog.fxml"));
            dialog.getDialogPane().setContent(root);
        } catch (IOException e){
            System.out.println("Can't load additem dialog");
            e.printStackTrace();;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK){
            System.out.println("Ok pressed");
        } else {
            System.out.println("Button pressed");
        }

    }

}
