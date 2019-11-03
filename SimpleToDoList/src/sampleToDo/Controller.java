package sampleToDo;

import dataModel.Todoitem;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Controller {

    private List<Todoitem> todoitems;

    public void initialize(){
        Todoitem item1 = new Todoitem("Learn Java","do x y z practice", LocalDate.of(2019, Month.NOVEMBER,5));
        Todoitem item2 = new Todoitem("Attend orientation","Location", LocalDate.of(2019, Month.NOVEMBER,6));
        Todoitem item3 = new Todoitem("Something","Something more detail", LocalDate.of(2019, Month.DECEMBER,5));
        Todoitem item4 = new Todoitem("Just example","more detail examples", LocalDate.of(2020, Month.NOVEMBER,5));
        Todoitem item5 = new Todoitem("Birthday","Happy", LocalDate.of(2019, Month.JANUARY,5));

    }

}
