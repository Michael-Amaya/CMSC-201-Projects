/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: Create sin and cos wave in JavaFX
 * Due: 04/26/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Project11 extends Application {
	
	// Global variables for the width, height, and the scale factor
	/** Width of the window */
	private final int WIDTH = 500;
	
	/** Height of the window **/
	private final int HEIGHT = 300;
	
	/** Scale factor of the graph **/
	private final double SCALE_FACTOR = 50;
	
	/**
	 * 
	 * @param primaryStage The window where everything will show
	 * @throws Exception Any errors in the program is going to be thrown to console
	 * 
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane mainPane = new Pane();			// The layout to use for the application
		Polyline axisX = new Polyline();		// The X axis line
		Polyline axisY = new Polyline();		// The Y axis line
		Polyline sinWave = new Polyline();		// The sin wave curve
		Polyline cosWave = new Polyline();		// The cos wave curve
		ObservableList<Double> sinList = sinWave.getPoints();	// The points of the sin wave
		ObservableList<Double> cosList = cosWave.getPoints(); 	// The points of the cos wave
		ObservableList<Double> axisXList = axisX.getPoints();	// The points of the X axis
		ObservableList<Double> axisYList = axisY.getPoints(); 	// The points of the Y axis
		Line arrowX1;	// Decoration arrow pt1 for the right side
		Line arrowX2;	// Decoration arrow pt2 for the right side
		Line arrowX3;	// Decoration arrow pt1 for the left side 
		Line arrowX4;	// Decoration arrow pt2 for the left side
		Line arrowY1;	// Decoration arrow pt1 for the top side
		Line arrowY2;	// Decoration arrow pt2 for the top side
		Line arrowY3;	// Decoration arrow pt1 for the bottom side
		Line arrowY4;	// Decoration arrow pt2 for the bottom side
		Text nOne;		// Decoration showing where -1 is for the wave
		Text one;		// Decoration showing where 1 is for the waves
		int currPi = 0;				// Current position to get the pi array
		Text piValues = new Text();	// The text to show the x axis values
		String[] piStrings = {		// The array to hold the axis placeholders
				"-2\u03c0",
				"-\u03c0", 
				"0", 
				"\u03c0", 
				"2\u03c0"};
		Text legend;	// Legend sign
		Text cosLegend;	// Show what color cos is
		Text sinLegend;	// Show what color sin is
		Text options;		// Options sign
		CheckBox showCos;	// Option show to cos
		CheckBox showSin;	// Option to show sin
		
		// Plot The X axis points
		for(int i = 0; i < WIDTH + 1; i++) {
			axisXList.add((double) i);
			axisXList.add((double) HEIGHT/2);
		}
		
		// Plot the Y axis points
		for (int i = 0; i < HEIGHT + 1; i++) {
			axisYList.add((double) WIDTH/2);
			axisYList.add((double) i);
		}
		
		// Arrows for the X axis
		arrowX1 = new Line(WIDTH, HEIGHT/2, WIDTH - 10, HEIGHT/2 - 10);
		arrowX2 = new Line(WIDTH, HEIGHT/2, WIDTH - 10, HEIGHT/2 + 10);
		arrowX3 = new Line(0, HEIGHT/2, 10, HEIGHT/2 + 10);
		arrowX4 = new Line(0, HEIGHT/2, 10, HEIGHT/2 - 10);
		
		// Arrows for the Y Axis
		arrowY1 = new Line(WIDTH/2, 0, WIDTH/2 - 10, 10);
		arrowY2 = new Line(WIDTH/2, 0, WIDTH/2 + 10, 10);
		arrowY3 = new Line(WIDTH/2, HEIGHT, WIDTH/2 - 10, HEIGHT - 10);
		arrowY4 = new Line(WIDTH/2, HEIGHT, WIDTH/2 + 10, HEIGHT - 10);
		
		
		// Change the color of the waves
		sinWave.setStroke(Color.RED);
		cosWave.setStroke(Color.BLUE);
		
		// Loop through the length of the entire window, where 0 is the center
		for (int x = -WIDTH/2 + 20; x < WIDTH/2 - 20; x++) {
			
			// Add the X value to the sin wave point
			sinList.add((double) x + WIDTH/2);
			
			// Calculate the Y value taking into account the window size and scale factor
			double sinY = HEIGHT/2 - SCALE_FACTOR * Math.sin((x / 100.0) * 2 * Math.PI);
			
			// Add the Y calculated to make a complete point
			sinList.add(sinY);
			
			// Add the X value of the cos wave point
			cosList.add((double) x + WIDTH/2);
			
			// Calculate the Y value taking into account of the window size and scale factor
			double cosY = HEIGHT/2 - SCALE_FACTOR * Math.cos((x / 100.0) * 2 * Math.PI);
			
			// Add the Y calculated value to make a complete point
			cosList.add(cosY);
			
			// Add the x values to show where pi is
			if (sinY >= HEIGHT/2-.0001 && sinY <= HEIGHT/2 + .0001 && x <= 100 && x >= -100) {
				// Add the correct x value in the correct place
				piValues = new Text(x + WIDTH/2 + (x == 0 ? 3:0), HEIGHT/2 + 13, piStrings[currPi]);
				
				// Add 1 to currPi in order to get  the next PI value
				currPi++;
				
				// Add the text to the graph
				mainPane.getChildren().addAll(piValues);
			}
		}
		
		// Calculate Y numbers, 1 and -1
		nOne = new Text(WIDTH/2 + 3, HEIGHT/2 + SCALE_FACTOR, "-1");
		one = new Text(WIDTH/2 + 3, HEIGHT/2 - SCALE_FACTOR, "1");
		
		// Create a legend and set the colors
		legend = new Text(WIDTH - 100, HEIGHT/ 2 + 86, "Legend");
		sinLegend = new Text(WIDTH - 100, HEIGHT/2 + 100, "y = sin(x)");
		cosLegend = new Text(WIDTH - 100, HEIGHT/2 + 114, "y = cos(x)");
		sinLegend.setFill(Color.RED);
		cosLegend.setFill(Color.BLUE);
		
		// Create Options and set points
		options = new Text(WIDTH - 100, 15, "Options");
		showSin = new CheckBox("Show sin(x)");
		showCos = new CheckBox("Show cos(x)");
		showSin.setSelected(true);
		showCos.setSelected(true);
		showSin.setLayoutX(WIDTH - 100);
		showSin.setLayoutY(20);
		showCos.setLayoutX(WIDTH - 100);
		showCos.setLayoutY(40);
		
		// Event Handler for showCos 
		showCos.setOnAction((e) -> {
			if (showCos.isSelected()) {
				cosWave.setStyle("-fx-opacity: 100%");
			} else {
				cosWave.setStyle("-fx-opacity: 0%");
			}
		});
		
		// Event Handler for showSin
		showSin.setOnAction((e) -> {
			if (showSin.isSelected()) {
				sinWave.setStyle("-fx-opacity: 100%");
			} else {
				sinWave.setStyle("-fx-opacity: 0%");
			}
		});
		
		// Add Options
		mainPane.getChildren().addAll(options, showSin, showCos);
		
		// Add Legend
		mainPane.getChildren().addAll(legend, sinLegend, cosLegend);
		
		// Add Y Values to Y Axis
		mainPane.getChildren().addAll(nOne, one);
		// Add Axis to the graph
		mainPane.getChildren().addAll(axisX, axisY);
		
		// Add arrows to graph
		mainPane.getChildren().addAll(arrowX1, arrowX2, arrowX3, arrowX4, arrowY1, arrowY2, arrowY3, arrowY4);
		
		// Add Sin and Cos wave
		mainPane.getChildren().addAll(sinWave, cosWave);
		
		// Add Name and Project Info
		Text myName = new Text(3, HEIGHT - 5, "By Michael Amaya");
		Text projectInfo = new Text(3, HEIGHT - 17, "Project 11: Graph Sin and Cos in JavaFX");
		mainPane.getChildren().addAll(myName, projectInfo);
		
		// Set title, size and start!
		primaryStage.setTitle("Project 11 -- By Michael Amaya");
		primaryStage.setScene(new Scene(mainPane, WIDTH, HEIGHT));
		primaryStage.show();
	}

	/** Start the Project11 GUI
	 * 
	 * @param args Arguments passed from the terminal
	 */
	public static void main(String[] args) { launch(args); }
}
