package dataModel;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class ToDoData {
    private static ToDoData instance = new ToDoData();
    private static String filename = "TodoListItems.txt";
    private List<Todoitem> todoitems;
    private DateTimeFormatter df;
    public static ToDoData getInstance(){
        return instance;
    }

    private ToDoData(){
        df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    }

    public List<Todoitem> getTodoitems() {
        return todoitems;
    }

    public void setTodoitems(List<Todoitem> todoitems) {
        this.todoitems = todoitems;
    }


}
