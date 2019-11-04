package dataModel;

import javafx.collections.FXCollections;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
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

    public void addTodoItem(Todoitem item){
        todoitems.add(item);
    }

//    public void setTodoitems(List<Todoitem> todoitems) {
//        this.todoitems = todoitems;
//    }

    public void loadTodoItems() throws IOException{
        todoitems = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(path);
        String input;

        try{
            while((input = br.readLine()) != null){
                String[] itemPieces = input.split("\t");
                String description = itemPieces[0];
                String details = itemPieces[1];
                String dateString = itemPieces[2];
                LocalDate date = LocalDate.parse(dateString,df);
                Todoitem item = new Todoitem(description,details,date);
                todoitems.add(item);
            }
        } finally {
            if(br != null){
                br.close();
            }
        }
    }

    public void storeTodoItems() throws IOException{
        Path path = Paths.get(filename);
        BufferedWriter bw = Files.newBufferedWriter(path);

        try{
            Iterator<Todoitem> iterator = todoitems.iterator();
            while (iterator.hasNext()){
                Todoitem item = iterator.next();
                bw.write(String.format( "%s\t%s\t%s",
                        item.getDescription(),
                        item.getDetails(),
                        item.getDeadline().format(df)
                        ));
                bw.newLine();
            }
        }finally {
            if(bw!= null){
                bw.close();
            }
        }
    }

}
