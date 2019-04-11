//************************************************************************
// GUIDriver.java Author: Alex Hapgood
//
// ****************FILL IN WHAT THIS DOES******************
//************************************************************************

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text; 

public class GUIDriver extends Application
{	
	private Text sumText;
	private PigDice p = new PigDice();
	private ImageView die1View; 
	private ImageView die2View;
	
	//--------------------------------------------------------------------
	// handles
	//--------------------------------------------------------------------
	public void start(Stage primaryStage) {
		
		sumText = new Text("Die1: Die2: PigSum: ");
		die1View = new ImageView(p.getDie1Image());
		die2View = new ImageView(p.getDie2Image());
		FlowPane pane = new FlowPane();
		Scene scene = new Scene(pane, 800, 400);
		Button roll = new Button("Roll");
		
		pane.setHgap(50);
		pane.setVgap(50);
		pane.setPrefWrapLength(400);
		
		pane.getChildren().add(sumText);
		pane.getChildren().add(die1View);
		pane.getChildren().add(die2View);
		pane.getChildren().add(roll);
		
		roll.setOnAction(this::processButtonPress);
		
		primaryStage.setTitle("Pigger Project");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void processButtonPress(ActionEvent event)
    {
		p.roll();
		die1View.setImage(p.getDie1Image());
		die2View.setImage(p.getDie2Image());
		sumText.setText("Die1: " + p.getDie1() + " Die2: " + p.getDie2() + " PigSum: " + p.toString());
         
    }
	
	//--------------------------------------------------------------------
	// Launches the JavaFX application. This method is not required
	// in IDEs that launch JavaFX applications automatically.
	//--------------------------------------------------------------------
	public static void main(String[] args) {
		launch(args);
	}
}