package programmering2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WindowLiveDemo extends Application implements EventHandler<ActionEvent> {

	Button knapp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		knapp = new Button("klicka på knappen");
		knapp.setMinHeight(55);
		knapp.setMinWidth(57);
		knapp.setOnAction(this);
		
		Group root = new Group();
		
		root.setTranslateX(150);
		
		root.getChildren().add(knapp);
		
		Scene scene = new Scene(root, 400, 400);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
		if (event.getSource() == knapp)
		{
			System.out.println("hej kära användare");
		}
		
	}

}
