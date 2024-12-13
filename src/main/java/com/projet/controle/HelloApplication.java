package com.projet.controle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/projet/controle/ajoutMembre.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.setScene(scene);
            primaryStage.setTitle("Controle");
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }}
