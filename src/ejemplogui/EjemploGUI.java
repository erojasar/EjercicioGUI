/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

import javafx.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author erojasar
 */
public class EjemploGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        VBox vbox = new VBox();
        FileInputStream input
                = new FileInputStream("camera.png");
        Image image = new Image(input);

        Button btOK = new Button("OK");
        Button button1 = new Button("numero 1");
        Button button2 = new Button("numero 2");
        Button button3 = new Button("numero 3");
        Button button4 = new Button("acepted", new ImageView(image));

        Label label2 = new Label("search");
        Label label3 = new Label("search", new ImageView(image));

        TableView table = new TableView();
        table.setEditable(true);
        TableColumn firstNameCol = new TableColumn("columna 1");
        TableColumn lastNameCol = new TableColumn("columnna 2");
        TableColumn emailCol = new TableColumn("columna extra");
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(new Label("First name"), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("MI:"), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Last Name:"), 0, 2);
        pane.add(new TextField(), 1, 2);
        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);

        GridPane gridpane = new GridPane();
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(20);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(30);
        gridpane.getColumnConstraints().addAll(col1, col2, col2, col1
        );
        Label text = new Label("Enter Address");
        gridpane.add(text, 0, 0, 4, 1); // (Columna 0, Fila 0)and colspan 4
        GridPane.setHalignment(text, HPos.CENTER);

        Label direccion = new Label("Direccion");
        gridpane.add(direccion, 0, 1, 1, 1); // (Columna 0, Fila 1) and colspan 1
        GridPane.setHalignment(direccion, HPos.RIGHT);
        TextField txtDireccion = new TextField();
        gridpane.add(txtDireccion, 1, 1, 1, 1); // (Columna 0, Fila 1) and colspan 1
        Label direccion2 = new Label("Direccion");
        GridPane.setHalignment(direccion2, HPos.RIGHT);
        TextField txtDireccion2 = new TextField();
        gridpane.add(direccion2, 0, 2, 1, 2); // (Columna 0, Fila 1) and colspan 1
        gridpane.add(txtDireccion2, 1, 2, 1, 2); // (Columna 0, Fila 1) and colspan 1

        HBox hbox = new HBox(button1);
        hbox.getChildren().add(button2);
        hbox.getChildren().add(button3);
        hbox.getChildren().add(button4);
        hbox.getChildren().add(label2);
        hbox.getChildren().add(label3);

        vbox.getChildren().add(hbox);
        vbox.getChildren().add(button4);
        vbox.getChildren().add(table);
        vbox.getChildren().add(pane);
        vbox.getChildren().add(gridpane);

        Scene scene = new Scene(vbox, 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }

}
