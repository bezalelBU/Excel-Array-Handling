package sample;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class Controller extends GridPane{

    private ArraySetup arraySetup = new ArraySetup();
    private String[][] sArray = arraySetup.getArray();
    //@FXML private TextField textField;

    public Controller() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    /*public String getText() {
        return textProperty().get();
    }

    public void setText(String value) {
        textProperty().set(value);
    }

    public StringProperty textProperty() {
        return textField.textProperty();
    }*/

    @FXML
    private Label label;

    @FXML
    private TextArea textArea;

    @FXML
    private Button saveButton;

    @FXML
    protected void saveExcel(ActionEvent event) {
        //label.setText("Excel file name:");
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File("src"));
        File selectedDirectory = fileChooser.showSaveDialog(((Node)event.getTarget()).getScene().getWindow());
        System.out.println(selectedDirectory.getAbsolutePath());
        //ArraySetup arraySetup = new ArraySetup();
        String[][] sArray = arraySetup.getArray();
        System.out.println(Arrays.deepToString(sArray));
        arraySetup.sendArray(selectedDirectory.getAbsolutePath(), arraySetup.getArray());
        //String[][] sArray = nameField.getText();
    }

    //When button is pressed, opens file directory to find excel file, and reads in into an array
    @FXML
    protected void openFileDirectory(ActionEvent event){
        //fileChooser.setInitialDirectory(new File("src"));
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose Excel File: ");
        File selectedFile = fileChooser.showOpenDialog(((Node)event.getTarget()).getScene().getWindow());
        System.out.println(selectedFile.getAbsolutePath());
        //ArraySetup arraySetup = new ArraySetup();
        arraySetup.setArray(selectedFile.getAbsolutePath());
        textArea.setWrapText(true);
        textArea.setText(Arrays.deepToString(arraySetup.setArray(selectedFile.getAbsolutePath())));

    }

    @FXML
    private Button submitButton;

    //Submit button is empty
    @FXML
    protected void handleSubmitButtonAction(ActionEvent event){
        //submit array for manipulation
        Window owner = submitButton.getScene().getWindow();
    }

}
