package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    Button button1;

    @FXML
    Label label1;

    @FXML
    Button button2;

    @FXML
    ListView<String> list;

    ObservableList<String> dataModel = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        button1.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                label1.setText("" + System.currentTimeMillis());
                dataModel.add("Hallo von Button 1!");
            }
        });

        list.setItems(dataModel);
        button2.setOnAction(s -> dataModel.add("" + System.currentTimeMillis()));
    }
}
