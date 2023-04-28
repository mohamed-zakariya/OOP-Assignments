import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class Display5Texts extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        pane.setPadding(new Insets(30,30,10,30));




        for(int l = 0; l <= 120; l += 30){
            Text text = new Text(5+l,40,"Java");
            text.setRotate(90);
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            text.setFill(Color.color(Math.random(),Math.random(),Math.random()));
            text.setOpacity(Math.random());
            pane.getChildren().add(text);
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Display 5 Texts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
