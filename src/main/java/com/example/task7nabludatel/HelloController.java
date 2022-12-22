package com.example.task7nabludatel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {



    public TextField timeCount;
    public HBox forTime;

    public HBox forTimer;


    @FXML
    private Label welcomeText;
    Signal signal = new Signal();

    Timer timer = new Timer();
    TimeServer timeServer = new TimeServer();

    @FXML
    public void onHelloButtonClickStart(ActionEvent actionEvent) {
        timeServer.attach(timer);
        timer.setTime = Integer.parseInt(String.valueOf(timeCount.getText()));
        timeServer.attach(signal);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        forTime.getChildren().add(signal.txt);
       // forTimer.getChildren().add(timer.txt);
       // forTimer.getChildren().add(timer.circle);
    }

    public void startTime(ActionEvent actionEvent) {
        timeServer.attach(signal);
    }

    public void stopTime(ActionEvent actionEvent) {
        timeServer.detach(signal);
    }


}