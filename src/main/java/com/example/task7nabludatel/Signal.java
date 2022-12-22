package com.example.task7nabludatel;

import javafx.scene.control.Label;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;

public class Signal  implements IObserver {
    Text txt = new Text();

    private int counter = 0;
    public Signal(){
    }
    @Override
    public void update() {
        counter++;

        txt.setText(""+ counter);

    }
}