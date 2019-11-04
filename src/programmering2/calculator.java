package programmering2;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class calculator extends Application implements EventHandler<ActionEvent> {
	Stage mainstage;
	Scene mainscene;
	HBox mainlayout;
	HBox displaylayout;
	GridPane numpadlayout;
	TextField inputfield;

	ArrayList<Button> numpad;
	Button calculate;
	Button clear;

	public static void main(String[] args) {
		launch();

	}

	private void displaynumpadbuttons() {
		int buttonindex = 0;
		for (int rowindex = 0; rowindex < 4; rowindex++) {
			for (int columnindex = 0; columnindex < 4; columnindex++) {
				numpadlayout.add(numpad.get(buttonindex), columnindex, rowindex);
				buttonindex++;
				if (buttonindex == numpad.size()) {
					break;
				}
			}

		}
	}

	public void siffror() {
		char[] siffrorkeys = { '1','2','3','+','4','5','6','-','7','8','9','*','/','0','.','%' };
		for (char key : siffrorkeys) {
			String keytext = key + "";
			Button tempbutton = new Button(keytext);
			tempbutton.setId(keytext);
			tempbutton.setOnAction(event -> {
				inputfield.textProperty().set(inputfield.textProperty().get() + keytext);
			});

			numpad.add(tempbutton);

		}
	}
public void clear(ActionEvent arg0) {
	if (arg0.getSource() == clear) {
		inputfield.setTextFormatter(null);
	}
}



	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == calculate)
		{

			String equation = inputfield.textProperty().get();
			equation.toCharArray();
			int index = 0;
			for (char c : equation.toCharArray()) {
				if (c == '+') {
					String tal1 = equation.substring(0,index);
					String tal2 = equation.substring(index+1,equation.length());
					Double tal = Double.parseDouble(tal1);
					Double talen = Double.parseDouble(tal2);
					Double result = tal+talen;
					inputfield.textProperty().set(inputfield.textProperty().get() + "=" +result);
				}
				else if (c == '*') {
					String tal1 = equation.substring(0,index);
					String tal2 = equation.substring(index+1,equation.length());
					Double tal = Double.parseDouble(tal1);
					Double talen = Double.parseDouble(tal2);
					Double result = tal*talen;
					inputfield.textProperty().set(inputfield.textProperty().get() + "=" +result);
				}
				else if (c == '-') {
					String tal1 = equation.substring(0,index);
					String tal2 = equation.substring(index+1,equation.length());
					Double tal = Double.parseDouble(tal1);
					Double talen = Double.parseDouble(tal2);
					Double result = tal-talen;
					inputfield.textProperty().set(inputfield.textProperty().get() + "=" +result);
				}
				else if (c == '/') {
					String tal1 = equation.substring(0,index);
					String tal2 = equation.substring(index+1,equation.length());
					Double tal = Double.parseDouble(tal1);
					Double talen = Double.parseDouble(tal2);
					Double result = tal/talen;
					inputfield.textProperty().set(inputfield.textProperty().get() + "=" +result);
				}
				else if (c == '%') {
					String tal1 = equation.substring(0,index);
					String tal2 = equation.substring(index+1,equation.length());
					Double tal = Double.parseDouble(tal1);
					Double talen = Double.parseDouble(tal2);
					Double result = tal%talen;
					inputfield.textProperty().set(inputfield.textProperty().get() + "=" +result);
				}


				index++;
			}


		}

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane();
		numpadlayout = new GridPane();

		inputfield = new TextField();
		calculate = new Button("=");
		clear = new Button("C");
		clear.setOnAction(this);
		calculate.setOnAction(this);
		inputfield.setEditable(false);
		numpad = new ArrayList<Button>();

		siffror();
		displaynumpadbuttons();
		root.setTop(inputfield);
		root.setCenter(numpadlayout);
		HBox box = new HBox(calculate);
		HBox box2 = new HBox(clear);

		root.setBottom(box);
		root.setRight(box2);
		mainscene = new Scene(root);

		primaryStage.setScene(mainscene);
		primaryStage.show();
	}
}
