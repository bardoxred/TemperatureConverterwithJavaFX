package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {

    public void resetButton1(ActionEvent event) {

        kelvinTextField1.setText("");
        celsiusTextField1.setText("");
        fahrenheitTextField1.setText("");
        kelvinTextField1.setDisable(true);
        fahrenheitTextField1.setDisable(true);
        celsiusTextField1.setDisable(false);

    }
    public void resetButton2(ActionEvent event) {

        kelvinTextField2.setText("");
        celsiusTextField2.setText("");
        fahrenheitTextField2.setText("");
        celsiusTextField2.setDisable(true);
        kelvinTextField2.setDisable(true);
        fahrenheitTextField2.setDisable(false);

    }
    public void resetButton3(ActionEvent event) {

        kelvinTextField3.setText("");
        celsiusTextField3.setText("");
        fahrenheitTextField3.setText("");
        celsiusTextField3.setDisable(true);
        fahrenheitTextField3.setDisable(true);
        kelvinTextField3.setDisable(false);

    }

    public void kelvinConvert(ActionEvent event) { // THIRD BLOCK

        try{
            if(!kelvinTextField3.getText().matches(" ")){
                double kelvin = Double.parseDouble(kelvinTextField3.getText());
                double celsius = kelvin - 273.15;
                double fahrenheit = (kelvin*1.8) - 459.67;
                celsiusTextField3.setText(" "+celsius+"C");
                fahrenheitTextField3.setText(" "+fahrenheit+"F");
                celsiusTextField3.setDisable(false);
                fahrenheitTextField3.setDisable(false);
                kelvinTextField3.setDisable(true);
            }
        }
        catch (NumberFormatException e){
            kelvinTextField3.setText("Wrong format");
        }
    }

    public void fahrenheitConvert(ActionEvent event) { // SECOND BLOCK
        try{
            if(!fahrenheitTextField2.getText().matches(" ")){
                double fahrenheit = Double.parseDouble(fahrenheitTextField2.getText());
                double kelvin = ((fahrenheit+459.67)*5)/9;
                double celsius = (fahrenheit-32)/1.8;
                celsiusTextField2.setText(" "+celsius+"C");
                kelvinTextField2.setText(" "+kelvin+"K");
                celsiusTextField2.setDisable(false);
                kelvinTextField2.setDisable(false);
                fahrenheitTextField2.setDisable(true);
            }
        }
        catch (NumberFormatException e){
            fahrenheitTextField2.setText("Wrong format");
        }
    }

    public void celsiusConvert(ActionEvent event) {

        try{
            if(!celsiusTextField1.getText().matches("")){
                double celsius = Double.parseDouble(celsiusTextField1.getText());
                double kelvin = celsius+273.15;
                double fahrenheit = (celsius*1.8)+32;
                kelvinTextField1.setText(" "+kelvin+"K");
                fahrenheitTextField1.setText(" "+fahrenheit+"F");
                kelvinTextField1.setDisable(false);
                fahrenheitTextField1.setDisable(false);
                celsiusTextField1.setDisable(true);
            }
        }
        catch (NumberFormatException e){
            celsiusTextField1.setText("Wrong format");
        }
    }

    @FXML
    private TextField celsiusTextField1;
    @FXML
    private TextField fahrenheitTextField1;
    @FXML
    private TextField kelvinTextField1;
    @FXML
    private TextField celsiusTextField2;
    @FXML
    private TextField fahrenheitTextField2;
    @FXML
    private TextField kelvinTextField2;
    @FXML
    private TextField celsiusTextField3;
    @FXML
    private TextField fahrenheitTextField3;
    @FXML
    private TextField kelvinTextField3;

}
