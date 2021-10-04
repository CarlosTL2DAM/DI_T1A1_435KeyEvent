/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a1_435keyevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class KeyEvent extends Application {
    //Atributos
    Pane root;
    Text tTexto;
    
    @Override
    public void start(Stage primaryStage) {
        
        //Creamos el nodo root
        root = new Pane();
        
        //Creamos tTexto, creamos el evento y lo añadimos al root
        tTexto = new Text(20,20,"A");
        
        root.getChildren().add(tTexto);
        
        //Creamos la escena
        Scene scene = new Scene(root, 300, 250);
        
        //Creamos el evento relacionado con la escena
        scene.setOnKeyPressed(e -> {
                        
            if(e.getCode().equals(KeyCode.UP))
            {
                tTexto.setY(tTexto.getY() - 10);
            }
            else if(e.getCode().equals(KeyCode.DOWN))
            {
                tTexto.setY(tTexto.getY() + 10);
            }
            else if(e.getCode().equals(KeyCode.RIGHT))
            {
                tTexto.setX(tTexto.getX() + 10);
            }
            else if(e.getCode().equals(KeyCode.LEFT))
            {
                tTexto.setX(tTexto.getX() - 10);
            }
            else if(e.getCode().isDigitKey() || e.getCode().isLetterKey())
            {
                tTexto.setText(e.getText().toUpperCase());
                
                //tTexto.setText(tTexto.getText() + e.getText().toUpperCase());
            }
        });
        
        //Titulo PrimaryStage
        primaryStage.setTitle("Ejercicio 4.3.5 KeyEvent");
        //Seleccionamos la escena del primaryStage
        primaryStage.setScene(scene);
        //Mostramos la primaryStage
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
