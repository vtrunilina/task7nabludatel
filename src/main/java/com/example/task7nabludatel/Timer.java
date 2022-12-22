package com.example.task7nabludatel;


import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Timer implements IObserver{
    int setTime;
    Text txt = new Text();
    public Timer(){

    }
    public int counter = 0;
    boolean flag = true;

    Circle circle = new Circle();
    @Override
    public void update() {
        if (flag == true){
            counter++;
        }

    }
}
