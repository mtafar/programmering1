package javafx;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class intro extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, 500, 500, Color.SKYBLUE);
		primaryStage.setTitle("javaFX playground");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Rectangle ground = new Rectangle(500, 50);
		ground.getchildren().add(ground);
		
		root.getChildren().add(ground);
	}
public static void main(String[] args) {
	launch();

	
	
	
}

}