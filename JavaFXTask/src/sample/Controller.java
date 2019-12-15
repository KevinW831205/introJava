package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;

public class Controller {

    private Task<ObservableList<String>> task;

    public void initialize(){
        task = new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                Thread.sleep(1000);
                return FXCollections.observableArrayList(
                        "name1",
                        "name2",
                        "name3",
                        "name4",
                        "name5",
                        "name6"
                );
            }
        };
    }

    @FXML
    public void buttonPressed(){
        new Thread(task).start();

    }
}
