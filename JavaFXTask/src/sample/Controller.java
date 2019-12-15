package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;

public class Controller {

    private Task<ObservableList<String>> task;


    @FXML
    private ListView listView;

    @FXML
    private ProgressBar progressBar;

    public void initialize() {
        task = new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                Thread.sleep(1000);

                String[] names = {
                        "name1",
                        "name2",
                        "name3",
                        "name4",
                        "name5",
                        "name6"
                };

                ObservableList<String> employees = FXCollections.observableArrayList();

                for(int i=0; i<6; i++){
                    employees.add(names[i]);
                    updateProgress(i+1,6);
                    Thread.sleep(200);
                }
                return employees;
            }
        };
        listView.itemsProperty().bind(task.valueProperty());

    }

    @FXML
    public void buttonPressed() {
        new Thread(task).start();
    }
}
