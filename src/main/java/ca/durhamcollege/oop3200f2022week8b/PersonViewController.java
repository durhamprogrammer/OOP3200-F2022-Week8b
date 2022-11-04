package ca.durhamcollege.oop3200f2022week8b;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PersonViewController implements Initializable
{

    @FXML
    private Label AgeLabel;

    @FXML
    private TextField AgeTextField;

    @FXML
    private Button GetPersonButton;

    @FXML
    private Label NameLabel;

    @FXML
    private TextField NameTextField;

    @FXML
    void GetPersonButton_Clicked(ActionEvent event)
    {
        var person = new Person("Tom", 35);

        NameTextField.setText(person.getName());
        AgeTextField.setText(String.valueOf(person.getAge()));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }
}
