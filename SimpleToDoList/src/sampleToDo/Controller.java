package sampleToDo;

import dataModel.ToDoData;
import dataModel.Todoitem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.util.Callback;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

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
    @FXML
    private ContextMenu listContextMenu;
    @FXML
    private ToggleButton filterToggleButton;

    private FilteredList<Todoitem> filteredList;

    private Predicate<Todoitem> allItems;
    private Predicate<Todoitem> todayItems;


    public void initialize() {

        listContextMenu = new ContextMenu();
        MenuItem deleteMenuItem = new MenuItem("Delete");
        MenuItem editMenuItem = new MenuItem("Edit");
        deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Todoitem item = todoListView.getSelectionModel().getSelectedItem();
                deleteItem(item);
            }
        });


        editMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Todoitem item = todoListView.getSelectionModel().getSelectedItem();
                System.out.println("editing item");
                showEditItemDialog(item);
            }
        });

        listContextMenu.getItems().addAll(deleteMenuItem);
        listContextMenu.getItems().addAll(editMenuItem);

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
                if (newValue != null) {
                    Todoitem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetail.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy MM dd");
                    deadLineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });

        allItems = new Predicate<Todoitem>() {
            @Override
            public boolean test(Todoitem todoitem) {
                return true;
            }
        };

        todayItems = new Predicate<Todoitem>() {
            @Override
            public boolean test(Todoitem todoitem) {
                return todoitem.getDeadline().equals(LocalDate.now());
            }
        };

        filteredList = new FilteredList<Todoitem>(ToDoData.getInstance().getTodoitems(), allItems);

        SortedList<Todoitem> sortedList = new SortedList<Todoitem>(filteredList,
                new Comparator<Todoitem>() {
                    @Override
                    public int compare(Todoitem o1, Todoitem o2) {
                        return o1.getDeadline().compareTo(o2.getDeadline());
                    }
                });

//        todoListView.getItems().setAll(ToDoData.getInstance().getTodoitems());
//        todoListView.setItems(ToDoData.getInstance().getTodoitems());
        todoListView.setItems(sortedList);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();

        todoListView.setCellFactory(new Callback<ListView<Todoitem>, ListCell<Todoitem>>() {
            @Override
            public ListCell<Todoitem> call(ListView<Todoitem> param) {
                ListCell<Todoitem> cell = new ListCell<Todoitem>() {
                    @Override
                    protected void updateItem(Todoitem item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setText(null);
                        } else {
                            setText(item.getDescription());
                            if (item.getDeadline().isBefore(LocalDate.now().plusDays(1))) {
                                setTextFill(Color.RED);
                            } else if (item.getDeadline().equals(LocalDate.now().plusDays(1))) {
                                setTextFill(Color.ORANGE);
                            }
                        }

                    }
                };

                cell.emptyProperty().addListener(
                        (obs, wasEmpty, isNowEmpty) -> {
                            if (isNowEmpty) {
                                cell.setContextMenu(null);
                            } else {
                                cell.setContextMenu(listContextMenu);
                            }
                        });

                return cell;
            }
        });

    }

    @FXML
    public void handleKeyPressed(KeyEvent keyEvent) {
        Todoitem selectedItem = todoListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            if (keyEvent.getCode().equals(KeyCode.DELETE)) {
                deleteItem(selectedItem);
            }
        }
    }

    @FXML
    public void handleClickListView() {
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
    public void showAddTodoItemDialog() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Add New Todo Item");
        dialog.setHeaderText("Use this dialog to create a new todo item");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("addTodoDialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Can't load additem dialog");
            e.printStackTrace();
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            DialogController dctrl = fxmlLoader.getController();
            Todoitem addedItem = dctrl.processResult();
//            todoListView.getItems().setAll(ToDoData.getInstance().getTodoitems());
            todoListView.getSelectionModel().select(addedItem);
//            System.out.println("Ok pressed");
        } else {
//            System.out.println("Button pressed");
        }
    }

    @FXML
    public void showEditItemDialog(Todoitem item) {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Editing Todo Item");
        dialog.setHeaderText("Editing todo item " + item.getDescription());

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("addTodoDialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Can't load editItem dialog");
            e.printStackTrace();
        }

        DialogController dctrl = fxmlLoader.getController();

        dctrl.populateWhenEdit(item);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            Todoitem addedItem = dctrl.editResult(item);
//            todoListView.getItems().setAll(ToDoData.getInstance().getTodoitems());
            todoListView.getSelectionModel().select(addedItem);
//            System.out.println("Ok pressed");
        } else {
//            System.out.println("Button pressed");
        }


    }

    public void deleteItem(Todoitem item) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Deleting Todo Item");
        alert.setHeaderText("Deleting " + item.getDescription());
        alert.setContentText("Are you sure to delete " + item.getDetails() + "\n Press Ok to confirm or cancel to back out");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            ToDoData.getInstance().deleteTodoItem(item);
        }
    }

    public void handleFilterButton() {
        Todoitem selectedItem = todoListView.getSelectionModel().getSelectedItem();
        if (filterToggleButton.isSelected()) {
            filteredList.setPredicate(todayItems);
            if(filteredList.isEmpty()){
                itemDetail.clear();
                deadLineLabel.setText("");
            } else if(filteredList.contains(selectedItem)){
                todoListView.getSelectionModel().select(selectedItem);
            } else{
                todoListView.getSelectionModel().selectFirst();
            }
        } else {
            filteredList.setPredicate(allItems);
            todoListView.getSelectionModel().select(selectedItem);
        }
    }

}
