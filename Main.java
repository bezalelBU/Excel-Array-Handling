package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import static arrayManip.parseArray.*;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root, 300, 275));
        //primaryStage.show();
        //System.out.println("Hello Java");
        //getArray(10,10, "something");
        //new ExcelHandling().makeExcel("ExcelTesting");
        //new ExcelHandling().readExcel("C:\\Users\\katly\\OneDrive\\Documents\\ExcelTesting");
        getArray();
    }


    public static void getArray(){

        //new ArraySetup().parseData(i,j,"Hello World");
        //call readExcel to return an array
        String[][] nArray = new ExcelHandling().readExcel("C:\\Users\\katly\\OneDrive\\Documents\\ExcelTesting");
        //call makeExcel with nArray to save to a new file
        new ExcelHandling().makeExcel("ExcelTesting2", nArray);

    }
    public static void main(String[] args) {
        launch(args);
    }
}
