package com.hustbookstore.hustbookstore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
     @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, World!");
        Scene scene = new Scene(label, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);  // Khởi chạy ứng dụng JavaFX
    }

}
