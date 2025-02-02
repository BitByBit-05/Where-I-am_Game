import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;

/**
   This program is a 2d grid based game that
   tells you where you are based on how big your
   2d grid is, this grid is set by you and also based on
   instructions given by ypu to the game determine where are you.
   @author Ayush Ahir 3789357
*/
public class Where_I_am extends Application{
   
   private TextField instructionsField;
   private TextField rowField;
   private TextField colField;
   private Text resultText;

   public void start(Stage primaryStage){
      primaryStage.setTitle("Pathway Checker");
      
      instructionsField = new TextField();
      rowField = new TextField();
      colField = new TextField();
      resultText = new Text("Type data above to validate path");

      Text instructionsText = new Text("Input instructions:");
      Text rowText = new Text("Number of Rows:");
      Text colText = new Text("Number of Columns:");
      
      
      instructionsField.setPrefWidth(160);
      rowField.setPrefWidth(60);
      colField.setPrefWidth(60);
      

      Button validateButton = new Button("Traverse the Path!");
      validateButton.setOnAction(this::validate);


      FlowPane pane = new FlowPane(instructionsText, instructionsField, rowText, rowField,
      				   colText, colField, validateButton, resultText);


      pane.setAlignment(Pos.CENTER);
      pane.setHgap(25);
      pane.setVgap(20);
      Scene scene = new Scene(pane, 250, 300);
      
      
      primaryStage.setScene(scene);
      primaryStage.show();
   }


   public void validate(ActionEvent e){
    String command = instructionsField.getText().toUpperCase();
    String row = rowField.getText();
    String col = colField.getText();
    
    boolean hasInstructions = true;
    boolean hasRows = true;
    boolean hasCols = true;

    for (int i = 0; i < row.length(); i++) {
       if(row.charAt(i) < '0' || row.charAt(i) > '9'){
          hasRows = false;
       }
    }
    for(int i = 0; i < col.length(); i++){
       if(col.charAt(i) < '0' || col.charAt(i) > '9'){
          hasRows = false;
       }
    }
    
    
    if(!hasRows || !hasRows){
       resultText.setText("Invalid row or column input!");
    }
    else if(command.length() < 2 || command.length() % 2 != 0){
       resultText.setText("Invalid instruction set!");
    }
    else{
       for(int i = 0; i < command.length(); i += 2){
          char c = command.charAt(i);
          if((c != 'U' && c != 'D' && c != 'L' && c != 'R') ||
             (command.charAt(i + 1) < '0' || command.charAt(i + 1) > '9')){
             hasInstructions = false;
          }
       }
       
       if(!hasInstructions){
          resultText.setText("Invalid instruction set!");
       }
       else{
          int numRows = Integer.parseInt(row);
          int numCols = Integer.parseInt(col);
          int countRow = 0;
          int countCol = 0;

          for(int i = 0; i < command.length(); i += 2){
             char letter = command.charAt(i);
             int direction = command.charAt(i + 1) - '0';

             if(letter == 'U'){
                countRow -= direction;
             }
             else if(letter == 'D'){
                countRow += direction;
             }
             else if(letter == 'L'){
                countCol -= direction;
             }
             else if(letter == 'R') {
                countCol += direction;
             }
          }

          if(countRow < 0 || countRow >= numRows || countCol < 0 || countCol >= numCols){
             resultText.setText("The player is out of bounds!");
          }
          else{
             resultText.setText("The player is at position " + countRow + ", " + countCol + "!");
          }
       }
    }  
 }
}
