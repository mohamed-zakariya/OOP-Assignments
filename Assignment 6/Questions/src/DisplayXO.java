import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DisplayXO extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        int randomNum, j = 0;

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5,0,5,20));



        for(int i = 0; i < 9; i++){
            randomNum = (int)(Math.random()*(3));
            if(randomNum == 1)
                gridpane.add(new ImageView(new Image("images/x.gif")), j,i%3);
            if(randomNum == 2 )
                gridpane.add(new ImageView(new Image("images/o.gif")), j,i%3);
            if(i%3 == 2)
                j++;
        }


        Scene scene = new Scene(gridpane);
        primaryStage.setTitle("DisplayXO");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
