package javafx;
import javafx.scene.shape.Polygon;
public class star extends Polygon {
public star(double radius) {
	double v = 360 / 5.0;
	for (int i = 0; i < 5; i++) {
		double x = Math.sin(Math.toRadians(v*2*i+108)) * radius+radius;
		double y = Math.cos(Math.toRadians(v*2*i+108)) * radius+radius;
		getPoints().add(x);
		getPoints().add(y);
		

	}
	
}

}
