import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FirstApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Creat centeralized circle
        double width = 400;
        double height = 400;

        Pane pane1 = new Pane();
        Circle circle = new Circle();

        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.CYAN);

        circle.centerXProperty().bind(pane1.widthProperty().divide(2));
        circle.centerYProperty().bind((pane1.heightProperty().divide(2)));

        pane1.getChildren().add(circle);
        Scene scene = new Scene(pane1,width,height);
        primaryStage.setTitle("centerlizedCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
