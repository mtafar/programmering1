package javafx;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class car extends Group {

	public car() {
		Rectangle top = new Rectangle();
		top.setWidth(50);
		top.setHeight(25);
		top.setTranslateX(25);
		Rectangle body = new Rectangle();
		body.setWidth(100);
		body.setHeight(25);
		body.setTranslateY(25);
		
		Circle tireleft = new Circle();
		tireleft.setRadius(12.5);
		tireleft.setTranslateX(20);
		tireleft.setTranslateY(50);
		
		Circle tireright = new Circle();
		tireright.setRadius(12.5);
		tireright.setTranslateX(80);
		tireright.setTranslateY(50);
		
		this.getChildren().addAll(top, body, tireleft, tireright);

	}
	
}
