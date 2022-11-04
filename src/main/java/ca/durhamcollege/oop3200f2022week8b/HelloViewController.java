package ca.durhamcollege.oop3200f2022week8b;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloViewController implements Initializable
{
    @FXML
    private Label welcomeText;

    @FXML
    private Button helloButton;

    @FXML
    protected void onHelloButtonClick()
    {

        welcomeText.setText(((welcomeText.getText() == "") || (welcomeText.getText() == "Goodbye, World!"))
                ? "Hello, World!" : "Goodbye, World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        welcomeText.setText("");
        helloButton.setText("Click Me");
    }
}