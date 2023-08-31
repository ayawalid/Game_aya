package views;

import java.awt.Point;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import model.characters.*;
import model.characters.Character;
import model.collectibles.*;
import engine.Game;
import model.world.*;

public class Main extends Application {
	Button playbutton;
    Button choosecharacter;
	Button endbutton;
	Hero h;
	int currentRow = 0;
    int currentCol = 0;
    GridPane grid;
    Button button;
    Button activehero;
	private Scene currentScene;
	Label label;

	public void start(Stage primaryStage) {
		/*roll dice and sum
		
		  int i=0;
		    int j;
		    int k;
		
		 public void start(Stage primaryStage) {
		    	BorderPane root = new BorderPane();
				Scene scene = new Scene(root,500,500);
			    Button dice1 = new Button("Roll dice 1");
			    dice1.setPrefHeight(400);
			    dice1.setPrefWidth(400);
			    Button dice2 = new Button("Roll dice 2");
			    dice2.setPrefHeight(400);
			    dice2.setPrefWidth(400);
			    Button res1 = new Button(" ");
			    res1.setPrefHeight(400);
			    res1.setPrefWidth(400);
			    Button res2 = new Button(" ");
			    res2.setPrefHeight(400);
			    res2.setPrefWidth(400);
			    Button res = new Button("The zombie health is 7, roll");
			    res.setPrefHeight(50);
			    res.setPrefWidth(500);
			    root.setTop(res);
			    root.setRight(res1);
			    root.setLeft(res2);
			    root.setBottom(dice1);
			    root.setBottom(dice2);
			    
			    Random random = new Random();
			  
			    dice1.setOnAction(event -> {
			    	 if(i<1){
			    		
				        j = random.nextInt(7);
				        res1.setText(j+"");
				        if(i==1){
				        	i=j+k;
				        	res.setText(i+"");
				        }
				        	
				        i++;
				       
			    	 }
		          
		        });  
			    dice2.setOnAction(event -> {
			    	 if(i<1){
					        k = random.nextInt(7);
					        res2.setText(k+"");
					        if(i==1){
					        	i=j+k;
					        	res.setText(i+"");
					        }
					        	
					        i++;
					       
				    	 }
		        	
		            
		          
		        });  
		        

		    
		        primaryStage.setScene(scene);
		        primaryStage.setTitle("The Last of Us");
		        primaryStage.show();
		    }
		    public static void alertSystem(String title, String message) {
		Stage alertWindow = new Stage();

		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setTitle(title);

		Label label = new Label();
		label.setText(message);
		label.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD, 20));
		Button closeButton = new Button("Close this window");
		closeButton.setOnAction(e -> alertWindow.close());

		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, closeButton);
		layout.setAlignment(Pos.CENTER);


		Scene scene = new Scene(layout, 500, 300);
		alertWindow.setScene(scene);
		alertWindow.showAndWait(); 
	}
		    */
		
		
		
		
		
		
		
		
		/* rotating
	   
	    public void start(Stage primaryStage) {
	    	BorderPane root = new BorderPane();
			Scene scene = new Scene(root,500,500);
		    Button button1 = new Button("Joel");
		    button1.setPrefHeight(50);
		    button1.setPrefWidth(500);
		    Button button2 = new Button("Tommy");
		    button2.setPrefHeight(400);
		    button2.setPrefWidth(50);
		    Button button3 = new Button("Ellie");
		    button3.setPrefHeight(50);
		    button3.setPrefWidth(500);
		    Button button4 = new Button("Tess");
		    button4.setPrefHeight(400);
		    button4.setPrefWidth(50);
		    Button pressbutton = new Button("Rotate");
		    pressbutton.setPrefHeight(400);
		    pressbutton.setPrefWidth(400);
		    root.setCenter(pressbutton);
		    root.setTop(button1);
		    root.setRight(button2);
		    root.setBottom(button3);
		    root.setLeft(button4);
		    
		
	        
		    pressbutton.setOnAction(event -> {
	        	String t1=button1.getText();
	            String t2=button2.getText()	;	
	            String t3=button3.getText();
	            String t4=button4.getText()	;	
	            button1.setText(t2);
	            button2.setText(t3);
	            button3.setText(t4);
	            button4.setText(t1);
	            
	          
	        });  
	        

	    
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("The Last of Us");
	        primaryStage.show();
	    }   */
		    
            Label h1type = new Label("Type: FIGHTER");
            Label h1maxhp = new Label("MaxHP = 140");
            Label h1maxactions = new Label("MaxActions = 5");
            Label h1attackdmg = new Label("AttackDmg = 30");
            
            h1type.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h1type.setTextFill(Color.WHITE);
            h1type.setPrefWidth(150);
            h1type.setPrefHeight(50);
		    
            h1maxhp.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h1maxhp.setTextFill(Color.WHITE);
            h1maxhp.setPrefWidth(150);
		    h1maxhp.setPrefHeight(50);
		    
		    h1maxactions.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
		    h1maxactions.setTextFill(Color.WHITE);
		    h1maxactions.setPrefWidth(150);
		    h1maxactions.setPrefHeight(50);
	        
		    h1attackdmg.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
		    h1attackdmg.setTextFill(Color.WHITE);
		    h1attackdmg.setPrefWidth(150);
		    h1attackdmg.setPrefHeight(50);
		    
            Label h2type = new Label("Type: MEDIC");
            Label h2maxhp = new Label("MaxHP = 110");
            Label h2maxactions = new Label("MaxActions = 6");
            Label h2attackdmg = new Label("AttackDmg = 15"); 
            
            h2type.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h2type.setTextFill(Color.WHITE);
            h2type.setPrefWidth(150);
            h2type.setPrefHeight(50);
		    
            h2maxhp.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h2maxhp.setTextFill(Color.WHITE);
            h2maxhp.setPrefWidth(150);
            h2maxhp.setPrefHeight(50);
		   
            h2maxactions.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h2maxactions.setTextFill(Color.WHITE);
            h2maxactions.setPrefWidth(150);
            h2maxactions.setPrefHeight(50);
		    
            h2attackdmg.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h2attackdmg.setTextFill(Color.WHITE);
            h2attackdmg.setPrefWidth(150);
            h2attackdmg.setPrefHeight(50);
		    
            Label h3type = new Label("Type: EXPLORER");
            Label h3maxhp = new Label("MaxHP = 80");
            Label h3maxactions = new Label("MaxActions = 6");
            Label h3attackdmg = new Label("AttackDmg = 20");
            
            h3type.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h3type.setTextFill(Color.WHITE);
            h3type.setPrefWidth(150);
            h3type.setPrefHeight(50);
		    
            h3maxhp.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h3maxhp.setTextFill(Color.WHITE);
            h3maxhp.setPrefWidth(150);
            h3maxhp.setPrefHeight(50);
		   
            h3maxactions.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h3maxactions.setTextFill(Color.WHITE);
            h3maxactions.setPrefWidth(150);
            h3maxactions.setPrefHeight(50);
		    
            h3attackdmg.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h3attackdmg.setTextFill(Color.WHITE);
            h3attackdmg.setPrefWidth(150);
            h3attackdmg.setPrefHeight(50);
		    
            Label h4type = new Label("Type: EXPLORER");
            Label h4maxhp = new Label("MaxHP = 90");
            Label h4maxactions = new Label("MaxActions = 5");
            Label h4attackdmg = new Label("AttackDmg = 25");
            
            h4type.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h4type.setTextFill(Color.WHITE);
            h4type.setPrefWidth(150);
            h4type.setPrefHeight(50);
		    
            h4maxhp.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h4maxhp.setTextFill(Color.WHITE);
            h4maxhp.setPrefWidth(150);
            h4maxhp.setPrefHeight(50);
		   
            h4maxactions.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h4maxactions.setTextFill(Color.WHITE);
            h4maxactions.setPrefWidth(150);
            h4maxactions.setPrefHeight(50);
		    
            h4attackdmg.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h4attackdmg.setTextFill(Color.WHITE);
            h4attackdmg.setPrefWidth(150);
            h4attackdmg.setPrefHeight(50);
		    
            Label h5type = new Label("Type: EXPLORER");
            Label h5maxhp = new Label("MaxHP = 95");
            Label h5maxactions = new Label("MaxActions = 5");
            Label h5attackdmg = new Label("AttackDmg = 25");
            
            h5type.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h5type.setTextFill(Color.WHITE);
            h5type.setPrefWidth(150);
            h5type.setPrefHeight(50);
		    
            h5maxhp.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h5maxhp.setTextFill(Color.WHITE);
            h5maxhp.setPrefWidth(150);
            h5maxhp.setPrefHeight(50);
		   
            h5maxactions.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h5maxactions.setTextFill(Color.WHITE);
            h5maxactions.setPrefWidth(150);
            h5maxactions.setPrefHeight(50);
		    
            h5attackdmg.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h5attackdmg.setTextFill(Color.WHITE);
            h5attackdmg.setPrefWidth(150);
            h5attackdmg.setPrefHeight(50);
		    
            Label h6type = new Label("Type: MEDIC");
            Label h6maxhp = new Label("MaxHP = 100");
            Label h6maxactions = new Label("MaxActions = 7");
            Label h6attackdmg = new Label("AttackDmg = 10");
            
            h6type.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h6type.setTextFill(Color.WHITE);
            h6type.setPrefWidth(150);
            h6type.setPrefHeight(50);
		    
            h6maxhp.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h6maxhp.setTextFill(Color.WHITE);
            h6maxhp.setPrefWidth(150);
            h6maxhp.setPrefHeight(50);
		   
            h6maxactions.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h6maxactions.setTextFill(Color.WHITE);
            h6maxactions.setPrefWidth(150);
            h6maxactions.setPrefHeight(50);
		    
            h6attackdmg.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h6attackdmg.setTextFill(Color.WHITE);
            h6attackdmg.setPrefWidth(150);
            h6attackdmg.setPrefHeight(50);
		    
            Label h7type = new Label("Type: FIGHTER");
            Label h7maxhp = new Label("MaxHP = 150");
            Label h7maxactions = new Label("MaxActions = 4");
            Label h7attackdmg = new Label("AttackDmg = 35");
            
            h7type.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h7type.setTextFill(Color.WHITE);
            h7type.setPrefWidth(150);
            h7type.setPrefHeight(50);
		    
            h7maxhp.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h7maxhp.setTextFill(Color.WHITE);
            h7maxhp.setPrefWidth(150);
            h7maxhp.setPrefHeight(50);
		   
            h7maxactions.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h7maxactions.setTextFill(Color.WHITE);
            h7maxactions.setPrefWidth(150);
            h7maxactions.setPrefHeight(50);
		    
            h7attackdmg.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h7attackdmg.setTextFill(Color.WHITE);
            h7attackdmg.setPrefWidth(150);
            h7attackdmg.setPrefHeight(50);
		    
            Label h8type = new Label("Type: MEDIC");
            Label h8maxhp = new Label("MaxHP = 105");
            Label h8maxactions = new Label("MaxActions = 6");
            Label h8attackdmg = new Label("AttackDmg = 15");
            
            h8type.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h8type.setTextFill(Color.WHITE);
            h8type.setPrefWidth(150);
            h8type.setPrefHeight(50);;
		    
		    
            h8maxhp.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
            h8maxhp.setTextFill(Color.WHITE);
            h8maxhp.setPrefWidth(150);
            h8maxhp.setPrefHeight(50);
		    
		    
		    h8maxactions.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
		    h8maxactions.setTextFill(Color.WHITE);
		    h8maxactions.setPrefWidth(150);
		    h8maxactions.setPrefHeight(50);
		    
	        h8attackdmg.setFont(Font.font("Garamond", FontWeight.BOLD, 16));
		    h8attackdmg.setTextFill(Color.WHITE);
		    h8attackdmg.setPrefWidth(150);
		    h8attackdmg.setPrefHeight(50);
		    Image backgroundImage2 = new Image("file:C:/Users/user/Desktop/wallpaper2.jpg");
		    ImageView backgroundImageView2 = new ImageView(backgroundImage2);
		    Image backgroundImage1 = new Image("file:C:/Users/user/Desktop/start.jpg");
		    ImageView backgroundImageView1 = new ImageView(backgroundImage1);
		    Image backgroundImage3 = new Image("file:C:/Users/user/Desktop/wallpaper3.jpg");
		    ImageView backgroundImageView3 = new ImageView(backgroundImage3);
		    Image backgroundImage4 = new Image("file:C:/Users/user/Desktop/wallpaper4.jpg");
		    ImageView backgroundImageView4 = new ImageView(backgroundImage4);
		    
		    Image joel = new Image("file:C:/Users/user/Desktop/joell.jpeg");
		    ImageView joelView = new ImageView(joel);
		    Image ellie = new Image("file:C:/Users/user/Desktop/ellie.jpeg");
		    ImageView ellieView = new ImageView(ellie);
		   Image tess = new Image("file:C:/Users/user/Desktop/tess.jpeg");
		    ImageView tessView = new ImageView(tess);
		    Image henry = new Image("file:C:/Users/user/Desktop/henry.jpeg");
		    ImageView henryView = new ImageView(henry);
		    Image bill = new Image("file:C:/Users/user/Desktop/bill.jpeg");
		    ImageView billView = new ImageView(bill);
		    Image david = new Image("file:C:/Users/user/Desktop/david.jpeg");
		    ImageView davidView = new ImageView(david);
		    Image riley = new Image("file:C:/Users/user/Desktop/riley.jpeg");
		    ImageView rileyView = new ImageView(riley);
		    Image tommy = new Image("file:C:/Users/user/Desktop/tommy.jpeg");
		    ImageView tommyView = new ImageView(tommy);
		    

		     joelView.setFitWidth(150); // Width of the image
		     joelView.setFitHeight(150); // Height of the image
		    joelView.setPreserveRatio(true);
		    ellieView.setFitWidth(150); // Width of the image
		    ellieView.setFitHeight(150); // Height of the image
		   ellieView.setPreserveRatio(true);
		    tessView.setFitWidth(150); // Width of the image
		    tessView.setFitHeight(150); // Height of the image
		    tessView.setPreserveRatio(true);
		    henryView.setFitWidth(150); // Width of the image
		    henryView.setFitHeight(150); // Height of the image
		   henryView.setPreserveRatio(true);
		    billView.setFitWidth(150); // Width of the image
		    billView.setFitHeight(150); // Height of the image
		    billView.setPreserveRatio(true);
		    davidView.setFitWidth(150); // Width of the image
		    davidView.setFitHeight(150); // Height of the image
		    davidView.setPreserveRatio(true);
		    rileyView.setFitWidth(150); // Width of the image
		     rileyView.setFitHeight(150); // Height of the image
		    rileyView.setPreserveRatio(true);
		    tommyView.setFitWidth(150); // Width of the image
		    tommyView.setFitHeight(150); // Height of the image
		    tommyView.setPreserveRatio(true);
            VBox vbox1 = new VBox();
            vbox1.getChildren().addAll(h1type,h1maxhp,h1maxactions,h1attackdmg);
            
            VBox vbox2 = new VBox();
            vbox2.getChildren().addAll(h2type,h2maxhp,h2maxactions,h2attackdmg);
            
            VBox vbox3 = new VBox();
            vbox3.getChildren().addAll(h3type,h3maxhp,h3maxactions,h3attackdmg);
            
            VBox vbox4 = new VBox();
            vbox4.getChildren().addAll(h4type,h4maxhp,h4maxactions,h4attackdmg);
            
            VBox vbox5 = new VBox();
            vbox5.getChildren().addAll(h5type,h5maxhp,h5maxactions,h5attackdmg);
            
            VBox vbox6 = new VBox();
            vbox6.getChildren().addAll(h6type,h6maxhp,h6maxactions,h6attackdmg);
            
            VBox vbox7 = new VBox();
            vbox7.getChildren().addAll(h7type,h7maxhp,h7maxactions,h7attackdmg);
            
            VBox vbox8 = new VBox();
            vbox8.getChildren().addAll(h8type,h8maxhp,h8maxactions,h8attackdmg);
            
		    label=new Label("THE LAST OF US");
		    label.setFont(Font.font("Garamond", FontWeight.BOLD, 60));
		    label.setTextFill(Color.BLACK);
		    label.setAlignment(Pos.TOP_CENTER);
		 
	        
            StackPane root1 = new StackPane();
	        Scene scene1 = new Scene(root1, 1280, 720);
	        currentScene = scene1;
	        
	        playbutton = new Button("PLAY");
	        playbutton.setStyle("-fx-text-fill: #000000; -fx-background-color: #37474F;-fx-border-color: #000000; -fx-border-width: 2px;-fx-font-size: 30px;");
	        playbutton.setPrefWidth(150);
	        playbutton.setPrefHeight(100);
	        
	        choosecharacter= new Button("START GAME");
	        choosecharacter.setStyle("-fx-text-fill: #000000; -fx-background-color: #4E5B31;-fx-border-color: #000000; -fx-border-width: 2px;-fx-font-size: 30px;");
	        choosecharacter.setPrefWidth(300);
	        choosecharacter.setPrefHeight(100);
	        ToggleGroup toggleGroup = new ToggleGroup();
	       
	        RadioButton H1= new RadioButton("Joel Miller");
	        RadioButton H2= new RadioButton("Ellie Williams");
			RadioButton H3= new RadioButton("Tess");
			RadioButton H4= new RadioButton("Riley Abel");
			RadioButton H5= new RadioButton("Tommy Miller");
		    RadioButton H6= new RadioButton("Bill");
			RadioButton H7= new RadioButton("David");
			RadioButton H8= new RadioButton("Henry Burell");
			
			    H1.setPrefWidth(140);
		        H1.setPrefHeight(50);
		        H1.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-font-size: 18px;");
		        H2.setPrefWidth(140);
		        H2.setPrefHeight(50);
		        H2.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-font-size: 18px;");
		        H3.setPrefWidth(140);
		        H3.setPrefHeight(50);
		        H3.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-font-size: 18px;");
		        H4.setPrefWidth(140);
		        H4.setPrefHeight(50);
		        H4.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-font-size: 18px;");
		        H5.setPrefWidth(150);
		        H5.setPrefHeight(50);
		        H5.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-font-size: 18px;");
		        H6.setPrefWidth(140);
		        H6.setPrefHeight(50);
		        H6.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-font-size: 18px;");
		        H7.setPrefWidth(140);
		        H7.setPrefHeight(50);
		        H7.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-font-size: 18px;");
		        H8.setPrefWidth(140);
		        H8.setPrefHeight(50);
		        H8.setStyle("-fx-background-color: black; -fx-text-fill: white;-fx-font-size: 18px;");
				H1.setToggleGroup(toggleGroup);
			    H2.setToggleGroup(toggleGroup);
			    H3.setToggleGroup(toggleGroup);
			    H4.setToggleGroup(toggleGroup);
			    H5.setToggleGroup(toggleGroup);
			    H6.setToggleGroup(toggleGroup);
			    H7.setToggleGroup(toggleGroup);
			    H8.setToggleGroup(toggleGroup);
			   toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
		           if (newValue == H1) {
		             h = Game.availableHeroes.get(0);
		            } else if (newValue == H2) {
		            	 h = Game.availableHeroes.get(1);
		            } else if (newValue == H3) {
		            h = Game.availableHeroes.get(2);
		            
			        } else if (newValue == H4) {
			        	 h = Game.availableHeroes.get(3);;
	                
	                } else if (newValue == H5) {
	                	 h = Game.availableHeroes.get(4);
	
                   } else if (newValue == H6) {
    	                h = Game.availableHeroes.get(5);

                   } else if (newValue == H7) {
    
                	   h = Game.heroes.get(6);
                   } else if (newValue == H8) {
                	  h = Game.availableHeroes.get(7);
                   }else{
                    	System.out.print("no hero is selected");
                 }
		           });
			    //Point p =new Point (0,0);
			   //((Character)h).setLocation(p);
			 Label choose=new Label("             CHOOSE YOUR CHARACTER");
			choose.setFont(Font.font("Garamond", FontWeight.BOLD, 60));
		    choose.setTextFill(Color.WHITE);
			
		    choose.setAlignment(Pos.TOP_CENTER);
	        
	        StackPane root2 = new StackPane();
	        Scene scene2 = new Scene(root2, 1280, 720);
	        
	        StackPane root3=new StackPane();
	        grid = new GridPane();
	        
	        grid.setPadding(new Insets(10));
	        grid.setAlignment(Pos.BASELINE_CENTER);
	        for (int row = 0; row < 15; row++) {
	            for (int col = 0; col < 15; col++) {
	                Button button = new Button();
	                button.setStyle("-fx-background-color:black;-fx-border-color: #000000; -fx-border-width: 2px;");
	                button.setPrefSize(40, 40); 
	               // if(Game.map[row][col].isVisible()==true){
	                	//if(Game.map[row][col].getClass()==CollectibleCell.class){
	                		//button.setStyle("-fx-background-color:yellow;");
	                	//	button.setPrefSize(40, 40);}
	                	//else if(Game.map[row][col].getClass()==CharacterCell.class  ){
	                		//button.setStyle("-fx-background-color:grey;");
	                		//button.setPrefSize(40, 40);
	                	//}
	                
	               // }
	                //else{
	                	//button.setStyle("-fx-background-color:black;");
	                	//button.setPrefSize(40, 40);}
	                grid.add(button, row,col);}
	                
	            } 
	        
	        
	        activehero=new Button();
	        activehero.setStyle("-fx-background-color:orange;-fx-border-color: #000000; -fx-border-width: 2px;");
	        activehero.setPrefSize(40, 40);
	        grid.add(activehero, 0, 14);
	        Button endturn = new Button("End Turn");
	        endturn.setStyle("-fx-text-fill: #000000; -fx-background-color: #4E5B31;-fx-border-color: #000000; -fx-border-width: 2px;-fx-font-size: 16px;");
	        endturn.setPrefWidth(150);
	        endturn.setPrefHeight(100);
	        endturn.setAlignment(Pos.BOTTOM_CENTER);
	        StackPane.setMargin(endturn, new Insets(1250,24, 700, 0));
            
	      
	      
	      
	        
	        StackPane.setMargin(playbutton, new Insets(900, 360, 360, 380));
	        StackPane.setMargin(choosecharacter, new Insets(900, 360, 360, 380));
             
	        
	        HBox hbox = new HBox();
	        HBox hbox2 = new HBox();
	        HBox hbox3 = new HBox();
	        hbox.setSpacing(5); 
	        hbox.setPadding(new Insets(10)); 
	        hbox.getChildren().addAll(joelView, ellieView, tessView,rileyView, tommyView,billView,davidView , henryView);
	        hbox2.setSpacing(4); 
	        hbox2.setPadding(new Insets(7)); 
	        hbox2.getChildren().addAll(vbox1,vbox2,vbox3,vbox4,vbox5,vbox6,vbox7,vbox8);
	        
	        hbox3.setSpacing(4); 
	        hbox3.setPadding(new Insets(10)); 
	        hbox3.getChildren().addAll(H1,H2,H3,H4,H5,H6,H7,H8);
	        VBox vboxbig=new VBox();
	        vboxbig.getChildren().addAll(choose,hbox,hbox2,hbox3);
	        vboxbig.setSpacing(5);
	        root1.getChildren().addAll(backgroundImageView1,label,playbutton);
	        root2.getChildren().addAll(backgroundImageView2,vboxbig,choosecharacter);
	       
	        primaryStage.setScene(scene1);
	       
	        FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(1), root1);
	        fadeTransition1.setFromValue(1.0);
	        fadeTransition1.setToValue(0.0);
	        fadeTransition1.setOnFinished(event -> {
	            primaryStage.setScene(scene2);
	        });
	        
	        playbutton.setOnAction(event -> {
	            fadeTransition1.play();
	            currentScene = scene2;
	        });
	        root3.getChildren().addAll(backgroundImageView3,grid,endturn);
	        Scene scene3 = new Scene(root3,1280, 720);
	      FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(1), root2);
	      fadeTransition2.setFromValue(1.0);
	      fadeTransition2.setToValue(0.0);
	      fadeTransition2.setOnFinished(event -> {
	          primaryStage.setScene(scene3);
	          
	       });
	        choosecharacter.setOnAction(event -> {
	        	fadeTransition2.play();
	           currentScene = scene3;
	           Game.startGame(h);
	           //changeAdjacentCellsColor(0,0);
	           grid.setOnKeyPressed(new EventHandler<KeyEvent>() {
	                
	                public void handle(KeyEvent event) {
	                    KeyCode keyCode = event.getCode();
	                    moveCell(keyCode);
	                }
	            });
	           });
	            StackPane root4 = new StackPane();
	           
	            ProgressBar progressBar = new ProgressBar();
	            progressBar.setProgress(1);
	            Label gamewon= new Label ("You Won");
	            Label gamelost= new Label ("You Lost");
	            gamewon.setFont(Font.font("Garamond", FontWeight.BOLD, 60));
			    gamewon.setTextFill(Color.BLACK);
			    gamelost.setFont(Font.font("Garamond", FontWeight.BOLD, 60));
			    gamelost.setTextFill(Color.BLACK);
			    StackPane.setAlignment(gamelost, Pos.TOP_CENTER);
			    StackPane.setAlignment(gamewon, Pos.TOP_CENTER);
			    
				Button ExitGame=new Button("Exit") ;
				ExitGame.setOnAction(new EventHandler<ActionEvent>() {
		           
		            public void handle(ActionEvent event) {
		                Stage stage = (Stage) ExitGame.getScene().getWindow();
		                stage.close();
		            }
		        });
				VBox end = new VBox();
				Game.checkGameOver();
				if(Game.checkGameOver()==true){
					if(Game.checkWin()==true){
					root4.getChildren().addAll(backgroundImageView4,gamewon,ExitGame);
					
				}
				    else{
					root4.getChildren().addAll(backgroundImageView4,gamelost,ExitGame);}
				}
				
		      
		      Scene scene4 = new Scene(root4, 1024, 576);
		      FadeTransition fadeTransition3 = new FadeTransition(Duration.seconds(1), root2);
	  	      fadeTransition3.setFromValue(1.0);
	  	      fadeTransition3.setToValue(0.0);
	  	      fadeTransition3.setOnFinished(event -> {
	  	          primaryStage.setScene(scene4);
	  	          
	  	       });
	  	    
		      endturn.setOnAction(event -> {try {
		    	  fadeTransition3.play();
		        	 primaryStage.setScene(scene4);
					Game.endTurn();
					Game.checkGameOver();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}});
	            grid.setOnKeyPressed(new EventHandler<KeyEvent>() {
	                
	                public void handle(KeyEvent event) {
	                    KeyCode keyCode = event.getCode();
	                    moveCell(keyCode);
	                    Game.adjustVisibility(h);
	                }
	            });
	           
	        
		    primaryStage.setTitle("The Last of Us: Legacy");
		    primaryStage.show();
		     } 
	 public void moveCell(KeyCode keyCode) {
		 activehero.setStyle("-fx-background-color: green;");
		int currentRow = GridPane.getRowIndex(activehero);
	    int currentCol = GridPane.getColumnIndex(activehero);
         switch (keyCode) {
             case UP:
                 if (currentRow > 0) {
                     currentRow--;
                 }
                 break;
             case DOWN:
                 if (currentRow < 15) {
                     currentRow++;
                 }
                 break;
             case LEFT:
                 if (currentCol > 0) {
                     currentCol--;
                 }
                 break;
             case RIGHT:
                 if (currentCol < 15) {
                     currentCol++;
                 }
                 break;
         }

        
         Button newButton = (Button)getNodeByRowColumnIndex(currentRow, currentCol, grid);
         if (newButton != null) {
             
             activehero = newButton;
             activehero.setStyle("-fx-background-color: yellow;");
         }
             }
	 private Node getNodeByRowColumnIndex(final int row, final int column, GridPane gridPane) {
	        for (Node node : gridPane.getChildren()) {
	            if (GridPane.getRowIndex(node) == row && GridPane.getColumnIndex(node) == column) {
	                return node;
	            }
	        }
	        return null;
	    }
	public String herodetails(Hero h){
		return null;
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
