import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.text.Element;

import java.awt.*;

public class DisplayImages extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(5,5,5,5));

        // Declerations of images
        ImageView imageView1 = new ImageView(new Image("images/uk.gif"));
        ImageView imageView2 = new ImageView(new Image("images/ca.gif"));
        ImageView imageView3 = new ImageView(new Image("images/china.gif"));
        ImageView imageView4 = new ImageView(new Image("images/us.gif"));


        // Add images to pane
        gridPane.add(imageView1,0,0);
        gridPane.add(imageView2, 1, 0);
        gridPane.add(imageView3, 0, 1);
        gridPane.add(imageView4, 1, 1);


        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Display Images");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
