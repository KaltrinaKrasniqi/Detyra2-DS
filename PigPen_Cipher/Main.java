
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import static javafx.scene.text.Font.loadFont;

public class Main extends Application {
    public void start(Stage stage) throws FileNotFoundException {

// Load the font file
        Text text1 = new Text(235,50,"Pig Pen Cipher");


        text1.setFont(new Font(40));


        Text input = new Text(270, 110,"Plain Text");
        input.setFont(Font.font(15));
        TextField inputField = new TextField();
        inputField.setPrefSize(300,40);
        inputField.setTranslateX(200);
        inputField.setTranslateY(120);


        Image mainImg = new Image(new FileInputStream("Symbol Images/MainImg.png"));
        ImageView view = new ImageView(mainImg);
        view.setFitHeight(230);
        view.setFitWidth(400);
        view.setTranslateX(150);
        view.setTranslateY(160);

        Text keyText = new Text(330, 410,"Key  ");
        keyText.setFont(Font.font(15));
        TextField key1 = new TextField();
        key1.setPrefSize(300,40);
        key1.setTranslateX(200);
        key1.setTranslateY(420);





        Button encryptButton = new Button("Encrypt");
        encryptButton.setTranslateX(280);
        encryptButton.setTranslateY(470);
        encryptButton.setPrefSize(140,40);




        Text rezultati = new Text(330, 550,"Result ");
        rezultati.setFont(Font.font(15));



       // Text copyRight = new Text(10, 690,"Work of: Jon Kuçi");
       //copyRight.setFont(Font.font(0));



        // Set an action for the button to display the entered text.
        FlowPane pane2 = new FlowPane();
        pane2.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));



        encryptButton.setOnAction(event -> {
           pane2.getChildren().clear();
           String[] arrayOfImages = PigPen.encrypt(inputField.getText(), key1.getText());
          try {
             for (int i = 0; i < arrayOfImages.length; i++) {
                 Image image = new Image(new FileInputStream(arrayOfImages[i]));
                 ImageView imageView = new ImageView(image);
                   imageView.setFitHeight(49);
                   imageView.setFitWidth(49);
                 pane2.getChildren().add(imageView);
               }
          }catch(Exception e){
              System.out.println("Error gajte gjetjes se file");
           }
        });





        Pane pane = new Pane();
        pane2.setTranslateY(560);
        pane2.setTranslateX(170);


        pane.setMaxHeight(500);
        pane.setMaxWidth(500);

        pane.getChildren().addAll(text1,inputField, encryptButton, input,keyText,key1,rezultati,pane2,view);

        Scene scene = new Scene(pane,700,750);
        scene.setFill(Color.WHITE);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        stage.setTitle("PigPen Cipher");

    }

  }
