import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Einstein extends Application
{

    public void start(Stage primaryStage)
    {
        Line line = new Line(35, 60, 150, 170);
        Line line2 = new Line(35, 65, 150, 65);

        Circle circle = new Circle(100, 65, 20);
        circle.setFill(Color.RED);
        
        Rectangle rect = new Rectangle(60, 70, 250, 60);
        rect.setStroke(Color.RED);
        rect.setStrokeWidth(2);
        rect.setFill(null);        
        
        Ellipse ellipse = new Ellipse(200, 100, 110, 80);
        ellipse.setFill(Color.PALEGREEN);
        
        Text quote = new Text(120, 100, "Out of clutter, find " +
                "simplicity.\n-- WIlliam Chan");
        
        Group root = new Group(ellipse, rect, circle, line, line2, quote);
        Scene scene = new Scene(root, 400, 200);
        
        primaryStage.setTitle("Einstein");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}

