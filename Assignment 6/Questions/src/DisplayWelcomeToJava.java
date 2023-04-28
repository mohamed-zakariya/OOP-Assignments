import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayWelcomeToJava extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        String word = "Welcome To Java";

        Pane pane = new Pane();
        pane.setPrefSize(400, 400);


        pane.setPadding(new Insets(5,5,5,5));



        double offset = pane.getPrefWidth() / 2;
        double radius = 100;
        for(int i = 0, rotation = 0; i < word.length(); i++, rotation += 22.5){
            double x = offset + Math.cos(Math.toRadians(rotation)) * radius;
            double y = offset + Math.sin(Math.toRadians(rotation)) * radius;

            Text text = new Text(x,y,word.charAt(i)+"");
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            text.setRotate(rotation);
            pane.getChildren().add(text);

        }

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("DisplayWelcomeToJava");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
