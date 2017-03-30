package View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Tobin M. Crone
 * @version 1.0
 * Purpose:	This class is meant to receive any and all strings and objects that will be displayed to the user.
 * 			Just a test for now to show kind of how it'd be set up. Simple and not too complex now.
 * 
 */

public class UserInterface extends Application
{
	Label consoleview;

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		/*
		 * TODO: 	X FX components
		 * 			getters/setters
		 * 			Test
		 * 			
		 */
		
		//root
		//BorderPane root = new BorderPane();
		
		//consolelayout
		FlowPane consolelayout = new FlowPane();
		consolelayout.setPadding(new Insets(0,0,0,0));
		consolelayout.setHgap(5);
		consolelayout.setVgap(5);
		
		//buttonlayout
		FlowPane buttonlayout = new FlowPane();
		buttonlayout.setPadding(new Insets(50,50,50,50));
		buttonlayout.setHgap(20);
		buttonlayout.setVgap(10);
		
		
		//consoleview		
		consoleview = new Label("Hello World!");
		consoleview.setAlignment(Pos.CENTER);
		consoleview.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
		
		Button button_1 = new Button("Touch me");
		
		button_1.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				consoleview.setText("This is basically how "
						+ "things would change were we to use this approach");
				
			}
			
		});
		
		//Add to buttonlayout
		buttonlayout.setAlignment(Pos.BOTTOM_CENTER);
		buttonlayout.getChildren().addAll(button_1);
		
		//Add to consolelayout
		consolelayout.setAlignment(Pos.CENTER);
		consolelayout.getChildren().addAll(consoleview,buttonlayout);
		
		
		//Add to root
		//root.getChildren().add(consolelayout);
		//BorderPane.setAlignment(consolelayout, Pos.CENTER);

		//Create a scene and place it in the stage
		Scene rootscene = new Scene(consolelayout,600,400);
		primaryStage.setTitle("Bowsers Trek Through Waluigi's Mansion - Version 1.0");
		primaryStage.setScene(rootscene);
		primaryStage.show();		
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("StartingGUI");
		launch(args);
	}
	
	
	
	

}
