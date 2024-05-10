package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class QuickSortController {
    @javafx.fxml.FXML
    private TextField recursiveCallsTextField;
    @javafx.fxml.FXML
    private TextField pivotTextField;
    @javafx.fxml.FXML
    private TableView tableViewNoSorted;
    @javafx.fxml.FXML
    private TableView tableViewSorted;
    @javafx.fxml.FXML
    private TextField lowTextField;
    @javafx.fxml.FXML
    private TextField highTextField;

    @javafx.fxml.FXML
    public void startOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void randomizeOnAction(ActionEvent actionEvent) {
    }
}
