package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        Controller controller = new Controller();
        stage.setTitle("Excel Handling Example");
        stage.setScene(new Scene (controller));
        stage.setWidth(700);
        stage.setHeight(500);
        stage.show();

    }

    //Main
    public static void main(String[] args) {
        launch(args);
    }
}
