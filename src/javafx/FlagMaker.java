package javafx;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
public class FlagMaker {
	public static Flag Sweden() {
		Flag flag = new Flag();
		/* denna kod skapar en blå linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.BLUE);
		/* denna kod skapar en gul linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.YELLOW);
		/* denna kod skapar en gul linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(80);
		vStripe.setFill(Color.YELLOW);

		flag.getChildren().addAll(bg, vStripe, hStripe);
		return flag;
	}

	public static Flag denmark() {
		Flag flag = new Flag();
		/* denna kod skapar en röd linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.RED);
		/* denna kod skapar en vit linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.WHITE);
		/* denna kod skapar en vit linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(80);
		vStripe.setFill(Color.WHITE);

		flag.getChildren().addAll(bg, vStripe, hStripe);
		return flag;
	}

	public static Flag england() {
		Flag flag = new Flag();
		/* denna kod skapar en vit linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.WHITE);
		/* denna kod skapar en röd linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.RED);
		/* denna kod skapar en röd linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(80);
		vStripe.setFill(Color.RED);

		flag.getChildren().addAll(bg, vStripe, hStripe);
		return flag;
	}

	public static Flag Skane() {
		Flag flag = new Flag();
		/* denna kod skapar en röd linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.RED);
		/* denna kod skapar en gul linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.YELLOW);
		/* denna kod skapar en gul linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(80);
		vStripe.setFill(Color.YELLOW);

		flag.getChildren().addAll(bg, vStripe, hStripe);
		
		return flag;
	}

	public static Flag finland() {
		Flag flag = new Flag();
		/* denna kod skapar en vit linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.WHITE);
		/* denna kod skapar en blå linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.BLUE);
		/* denna kod skapar en blå linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(80);
		vStripe.setFill(Color.BLUE);

		flag.getChildren().addAll(bg, vStripe, hStripe);
		
		return flag;
	}

	public static Flag norden() {
		Flag flag = new Flag();
		/* denna kod skapar en gul linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.YELLOW);
		/* denna kod skapar en röd linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.RED);
		/* denna kod skapar en röd linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(80);
		vStripe.setFill(Color.RED);

		flag.getChildren().addAll(bg, vStripe, hStripe);
		
		return flag;
	}

	public static Flag ostergotlands() {
		Flag flag = new Flag();
		/* denna kod skapar en gul linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.YELLOW);
		/* denna kod skapar en blå linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.BLUE);
		/* denna kod skapar en blå linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(80);
		vStripe.setFill(Color.BLUE);

		flag.getChildren().addAll(bg, vStripe, hStripe);
		return flag;
	}

	public Flag bornholms() {
		Flag flag = new Flag();
		/* denna kod skapar en röd linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.RED);
		/* denna kod skapar en grön linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.GREEN);
		/* denna kod skapar en grön linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(80);
		vStripe.setFill(Color.GREEN);

		flag.getChildren().addAll(bg, vStripe, hStripe);
		return flag;
	}

	public static Flag france() {
		Flag flag = new Flag();
		/* denna kod skapar en blå linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(100);
		bg.setHeight(200);
		bg.setFill(Color.BLUE);
		/* denna kod skapar en vit linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(100);
		hStripe.setHeight(200);
		hStripe.setTranslateX(100);
		hStripe.setFill(Color.WHITE);
		/* denna kod skapar en röd linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(100);
		vStripe.setHeight(200);
		vStripe.setTranslateX(200);
		vStripe.setFill(Color.RED);

		flag.getChildren().addAll(bg, vStripe, hStripe);

		return flag;
	}
	public static Flag belgium() {
		Flag flag = new Flag();
		/* denna kod skapar en svart linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(100);
		bg.setHeight(200);
		bg.setFill(Color.BLACK);
		/* denna kod skapar en gul linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(100);
		hStripe.setHeight(200);
		hStripe.setTranslateX(100);
		hStripe.setFill(Color.YELLOW);
		/* denna kod skapar en röd linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(100);
		vStripe.setHeight(200);
		vStripe.setTranslateX(200);
		vStripe.setFill(Color.RED);

		flag.getChildren().addAll(bg, vStripe, hStripe);

		return flag;
	}
	public static Flag nigeria() {
		Flag flag = new Flag();
		/* denna kod skapar en grön linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(100);
		bg.setHeight(200);
		bg.setFill(Color.GREEN);
		/* denna kod skapar en vit linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(100);
		hStripe.setHeight(200);
		hStripe.setTranslateX(100);
		hStripe.setFill(Color.WHITE);
		/* denna kod skapar en grön linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(100);
		vStripe.setHeight(200);
		vStripe.setTranslateX(200);
		vStripe.setFill(Color.GREEN);

		flag.getChildren().addAll(bg, vStripe, hStripe);

		return flag;
	}
	public static Flag italia() {
		Flag flag = new Flag();
		/* denna kod skapar en grön linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(100);
		bg.setHeight(200);
		bg.setFill(Color.GREEN);
		/* denna kod skapar en vit linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(100);
		hStripe.setHeight(200);
		hStripe.setTranslateX(100);
		hStripe.setFill(Color.WHITE);
		/* denna kod skapar en röd linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(100);
		vStripe.setHeight(200);
		vStripe.setTranslateX(200);
		vStripe.setFill(Color.RED);

		flag.getChildren().addAll(bg, vStripe, hStripe);

		return flag;
	}
	public static Flag gremany() {
		Flag flag = new Flag();
		/* denna kod skapar en svart linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(400);
		bg.setHeight(100);
		bg.setFill(Color.BLACK);
		/* denna kod skapar en röd linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(400);
		hStripe.setHeight(100);
		hStripe.setTranslateY(100);
		hStripe.setFill(Color.RED);
		/* denna kod skapar en gul linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(400);
		vStripe.setHeight(100);
		vStripe.setTranslateY(200);
		vStripe.setFill(Color.YELLOW);

		flag.getChildren().addAll(bg, vStripe, hStripe);

		return flag;
	}
	public static Flag laos() {
		Flag flag = new Flag();
		/* denna kod skapar en röd linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(400);
		bg.setHeight(50);
		bg.setFill(Color.RED);
		/* denna kod skapar en blå linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(400);
		hStripe.setHeight(150);
		hStripe.setTranslateY(50);
		hStripe.setFill(Color.BLUE);
		/* denna kod skapar en vit cirkel
		 * 				
		 */
		Circle tireleft = new Circle();
		tireleft.setRadius(50);
		tireleft.setTranslateX(200);
		tireleft.setTranslateY(125);
		tireleft.setFill(Color.WHITE);
		/* denna kod skapar en röd linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(400);
		vStripe.setHeight(50);
		vStripe.setTranslateY(200);
		vStripe.setFill(Color.RED);

		flag.getChildren().addAll(bg, vStripe, hStripe,tireleft);

		return flag;
	}
	public static Flag togo() {
		Flag flag = new Flag();
		/* denna kod skapar en grön linje
		 * 				
		 */
		Rectangle fStripe = new Rectangle();
		fStripe.setWidth(600);
		fStripe.setHeight(50);
		fStripe.setTranslateY(250);
		fStripe.setFill(Color.GREEN);
		/* denna kod skapar en gul linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(600);
		hStripe.setHeight(50);
		hStripe.setTranslateY(200);
		hStripe.setFill(Color.YELLOW);
		/* denna kod skapar en grön linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(400);
		vStripe.setHeight(66);
		vStripe.setTranslateY(132);
		vStripe.setTranslateX(200);
		vStripe.setFill(Color.GREEN);
		/* denna kod skapar en gul linje
		 * 				
		 */
		Rectangle aStripe = new Rectangle();
		aStripe.setWidth(400);
		aStripe.setHeight(66);
		aStripe.setTranslateX(200);
		aStripe.setTranslateY(66);
		aStripe.setFill(Color.YELLOW);
		/* denna kod skapar en grön linje
		 * 				
		 */
		Rectangle bStripe = new Rectangle();
		bStripe.setWidth(400);
		bStripe.setHeight(66);
		bStripe.setTranslateX(200);
		bStripe.setFill(Color.GREEN);
		/* denna kod skapar en röd kvadrat
		 * 				
		 */
		Rectangle cStripe = new Rectangle();
		cStripe.setWidth(200);
		cStripe.setHeight(200);
		cStripe.setFill(Color.RED);
		/* denna kod skapar en vit sjärna
		 * 				
		 */
		star star = new star(40);
		star.setTranslateX(60);
		star.setTranslateY(60);
		star.setFill(Color.WHITE);

		flag.getChildren().addAll(
				vStripe, hStripe,aStripe,bStripe,cStripe,fStripe,star);

		return flag;
	}
	public static Flag greenland() {
		Flag flag = new Flag();
		/* denna kod skapar en rektangel som är vit
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(600);
		bg.setHeight(200);
		bg.setFill(Color.WHITE);
		/* denna kod skapar en rektangel som är röd
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(600);
		hStripe.setHeight(200);
		hStripe.setTranslateY(200);
		hStripe.setFill(Color.RED);
		
		/* denna kod skapar en halvcirkel som är röd
		 * 				
		 */
		Arc arc = new Arc();
		arc.setTranslateX(250);
		arc.setTranslateY(200);
		arc.setRadiusX(100);
		arc.setRadiusY(100);
		arc.setStartAngle(0);
		arc.setLength(180.0);
		arc.setFill(Color.RED);
		arc.setType(ArcType.ROUND);
		/* denna kod skapar en halvcirkel som är vit
		 * 				
		 */
		Arc a = new Arc();
		a.setTranslateX(250);
		a.setTranslateY(200);
		a.setRadiusX(100);
		a.setRadiusY(100);
		a.setStartAngle(180.0);
		a.setLength(180.0);
		a.setFill(Color.WHITE);
		a.setType(ArcType.ROUND);
		flag.getChildren().addAll(bg,hStripe,arc,a);

		return flag;
	}
	public static Flag kwuait() {
		Flag flag = new Flag();
		/* denna kod skapar en grön linje
		 * 				
		 */
		Rectangle bg = new Rectangle();
		bg.setWidth(400);
		bg.setHeight(100);
		bg.setFill(Color.GREEN);
		/* denna kod skapar en vit linje
		 * 				
		 */
		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(400);
		hStripe.setHeight(100);
		hStripe.setTranslateY(100);
		hStripe.setFill(Color.WHITE);
		/* denna kod skapar en röd linje
		 * 				
		 */
		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(400);
		vStripe.setHeight(100);
		vStripe.setTranslateY(200);
		vStripe.setFill(Color.RED);
/* denna kod skapar en svart polygon
 * 				
 */
		Polygon polygon = new Polygon();
		polygon.getPoints().add(0.0);
		polygon.getPoints().add(0.0);
		
		polygon.getPoints().add(100.0);
		polygon.getPoints().add(100.0);
		
		polygon.getPoints().add(100.0);
		polygon.getPoints().add(200.0);
		
		polygon.getPoints().add(0.0);
		polygon.getPoints().add(300.0);
		
		flag.getChildren().addAll(bg, vStripe, hStripe,polygon);

		return flag;
	}
}
