package com.example.csc311_gui_basicslab;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label myNameLabel;

    @FXML
    private Label countLabel;

    private int clickCount = 0;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Nice to meet you! ");
        myNameLabel.setText("it's really");
    }

    @FXML
    protected void onRockButtonClick() {
        clickCount++;
        countLabel.setText("you rock " + clickCount + " times");
    }
}