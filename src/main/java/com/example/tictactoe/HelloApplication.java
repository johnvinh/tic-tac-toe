package com.example.tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/
        Button btn1 = new Button("Say, Hello World");
        StackPane root = new StackPane();
        root.getChildren().add(btn1);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("First JavaFX Application");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}