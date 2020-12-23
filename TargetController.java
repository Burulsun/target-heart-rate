package Target;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TargetController{

    @FXML
    private TextField inputTextField;

    @FXML
    private Label maximumLabel;

    @FXML
    private Label targetLabel;
    @FXML
    private Button button;



    @FXML
    void calculateRate(ActionEvent event) {
        String ageStr = inputTextField.getText();
        int ageInt = Integer.parseInt(ageStr);
        double maximumRate = 220-ageInt;
        double targetRate1 = 0.5*maximumRate;
        double targetRate2 = 0.85*maximumRate;
        maximumLabel.setText(String.format("Maximum rate for your age: %.01f beats per minute",maximumRate));
        //maximumLabel.setText(String.valueOf(maximumRate));
        targetLabel.setText(String.format("Target heart rate for your age: %.1f - %.2f beats per minute",targetRate1, targetRate2));



    }


}
