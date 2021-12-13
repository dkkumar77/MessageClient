package Codebase;


import animatefx.animation.FadeOut;
import animatefx.animation.Wobble;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {

    @FXML
    private JFXTextField textBox;

    @FXML
    private JFXButton roomOne;

    @FXML
    private JFXButton roomTwo;

    @FXML
    private JFXButton roomThree;

    @FXML
    private JFXButton roomFour;

    @FXML
    private JFXTextArea textarea;

    @FXML
    private JFXButton submit;

    @FXML
    void handleRoomOneSwitch(ActionEvent event) {

        if(event.getSource().equals(roomOne)){

            /**
             * Button Clicked - > Retrieves from Database
             */

            new Wobble(roomOne).play();

        }
    }

    @FXML
    void handleRoomTwoSwitch(ActionEvent event) {

        if(event.getSource().equals(roomTwo)){

            new Wobble(roomTwo).play();


        }

    }

    @FXML
    void handleRoomThreeSwitch(ActionEvent event) {

        if(event.getSource().equals(roomThree)){

            new Wobble(roomThree).play();


        }

    }

    @FXML
    void handleRoomFourSwitch(ActionEvent event) {

        if(event.getSource().equals(roomFour)){
            new Wobble(roomFour).play();

        }

    }

    @FXML
    void handleSubmit(ActionEvent event) {
        if(event.getSource().equals(submit)){

        }
    }

}
