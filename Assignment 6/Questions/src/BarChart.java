import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import java.awt.*;

public class BarChart extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        pane.setPadding(new Insets(20,20,20,20));
        Group group = new Group();

        // Rectangles
        Rectangle rectangle1 = new Rectangle(20,65,35,60);
        Rectangle rectangle2 = new Rectangle(120, 60, 20,60);
        Rectangle rectangle3 = new Rectangle(220, 52, 45,60);
        Rectangle rectangle4 = new Rectangle(320, 52, 65,60);
        rectangle1.setFill(Color.RED);
        rectangle1.setRotate(90);
        rectangle2.setFill(Color.BLUE);
        rectangle2.setRotate(90);
        rectangle3.setFill(Color.GREEN);
        rectangle3.setRotate(90);
        rectangle4.setFill(Color.ORANGE);
        rectangle4.setRotate(90);

        // Add rectangles to pane
        group.getChildren().addAll(new Text(0, 67, "Project--20%"),rectangle1,
                new Text(100, 70, "Quiz--10%"),rectangle2,
                new Text(200, 50, "Midterm--30%"),rectangle3,
                new Text(320, 40, "Final--40%"),rectangle4);

        Scene scene = new Scene(new Pane(group), 400, 100);
        primaryStage.setTitle("barChart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
