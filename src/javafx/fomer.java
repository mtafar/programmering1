package javafx;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class fomer extends Application{
	
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Scene scene =new Scene(root,500,500,Color.SKYBLUE);
		primaryStage.setScene(scene);
		primaryStage.show();
		// ------- cirkel
		Circle circle = new Circle();
		circle.setRadius(50);
		circle.setTranslateX(250);
		circle.setTranslateY(250);
		circle.setFill(Color.RED);
		circle.setRotationAxis(Rotate.X_AXIS);
		//root.getChildren().add(circle);
		// ----- Rectangle
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(100);
		rectangle.setHeight(300);
		rectangle.setFill(Color.HOTPINK);
		
		//root.getChildren().add(rectangle);
		// ---- polygon
		Polygon polygon = new Polygon();
		polygon.getPoints().add(0.0);
		polygon.getPoints().add(0.0);
		
		polygon.getPoints().add(0.0);
		polygon.getPoints().add(100.0);
		
		polygon.getPoints().add(100.0);
		polygon.getPoints().add(100.0);
		
		//root.getChildren().add(polygon);
		star star = new star(50);
		star.setTranslateX(250);
		star.setTranslateX(250);
		//root.getChildren().add(star);
		root.getChildren().add(FlagMaker.kwuait());
		
	}
	// ---- Arc
	Arc arc = new Arc();

}
	
	

