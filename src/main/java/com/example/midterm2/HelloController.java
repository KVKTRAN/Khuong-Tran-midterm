package com.example.midterm2;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;
import java.util.Random;

public class HelloController {
    @FXML
    private Label welcomeText;
    private Scene scene;
    private Stage stage;
    private FXMLLoader loader;
    private Group group;
    private Canvas canvas;

    public void onAnimationButtonClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Animation.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(loader.load(), 640, 480);
        stage.setScene(newScene);
        stage.show();
    }

    public void onGraphicsButtonClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("2DGraphics.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(loader.load(), 640, 480);
        stage.setScene(newScene);
        stage.show();
    }

    public void onAboutButtonClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("About.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(loader.load(), 640, 480);
        stage.setScene(newScene);
        stage.show();
    }

    public void onBackToMainButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Main.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(loader.load(), 640, 480);
        stage.setScene(newScene);
        stage.show();
    }




    private void draw(Group group) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.BLUE);
        gc.fillRect(50, 50, 100, 75);
        gc.setFill(Color.BLUE);
        gc.fillRect(250, 50, 100, 75);
    }

}