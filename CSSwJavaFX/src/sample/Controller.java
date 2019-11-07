package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

public class Controller {
    @FXML
    private Label label1;
    @FXML
    private Button button4;
    @FXML
    private GridPane mainGridPane;

    public void initialize() {
//        label1.setScaleX(2.0);
//        label1.setScaleY(2.0);
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleMouseOver() {
        label1.setScaleX(2.0);
        label1.setScaleY(2.0);
    }

    @FXML
    public void handleMouseExit() {
        label1.setScaleX(1.0);
        label1.setScaleY(1.0);
    }

    @FXML
    public void handleSaveClick() {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text", "*.txt"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
                new FileChooser.ExtensionFilter("Image", "*.png","*.jpg","*.gif"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
        File file = chooser.showSaveDialog(mainGridPane.getScene().getWindow());
        if (file != null) {
            System.out.println(file.getPath());
        } else {
            System.out.println("No file choosen");
        }
    }

    @FXML
    public void handleOpenClick() {
        FileChooser chooser = new FileChooser();
        //        DirectoryChooser chooser = new DirectoryChooser();

        chooser.setTitle("Open Application File");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Zip", "*.zip"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf")
        );

//        File file = chooser.showOpenDialog(mainGridPane.getScene().getWindow());
        List<File> file = chooser.showOpenMultipleDialog(mainGridPane.getScene().getWindow());

        if (file != null) {
            //            System.out.println(file.getPath());
            for(int i=0; i<file.size(); i++){
                System.out.println(file.get(i));
            }
        } else {
            System.out.println("No file choosen");
        }

    }
}
