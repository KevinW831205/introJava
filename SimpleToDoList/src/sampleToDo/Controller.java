package sampleToDo;

import dataModel.Todoitem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<Todoitem> todoitems;

    @FXML
    private ListView<Todoitem> todoListView;
    @FXML
    private TextArea itemDetail;

    public void initialize(){
        Todoitem item1 = new Todoitem("Learn Java","do x y z practice", LocalDate.of(2019, Month.NOVEMBER,5));
        Todoitem item2 = new Todoitem("Attend orientation","Location", LocalDate.of(2019, Month.NOVEMBER,6));
        Todoitem item3 = new Todoitem("Something","Something more detail", LocalDate.of(2019, Month.DECEMBER,5));
        Todoitem item4 = new Todoitem("Just example","more detail examples", LocalDate.of(2020, Month.NOVEMBER,5));
        Todoitem item5 = new Todoitem("Birthday","Happy", LocalDate.of(2019, Month.JANUARY,5));

        todoitems = new ArrayList<>();
        todoitems.add(item1);
        todoitems.add(item2);
        todoitems.add(item3);
        todoitems.add(item4);
        todoitems.add(item5);

        todoListView.getItems().setAll(todoitems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    }

    @FXML
    public void handleClickListView(){
        Todoitem item = todoListView.getSelectionModel().getSelectedItem();
//        System.out.println("Selected "+
        StringBuilder sb = new StringBuilder(item.getDetails());
        sb.append("\n\n\n\n");
        sb.append("Due: ");
        sb.append(item.getDeadline());
        itemDetail.setText(sb.toString());

    }
}
