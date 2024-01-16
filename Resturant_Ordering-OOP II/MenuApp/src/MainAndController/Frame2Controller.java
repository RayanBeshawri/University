/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package MainAndController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author owd1
 */
public class Frame2Controller {

    @FXML
    private Label NameL;

    @FXML
    private Label errorLabel;

    @FXML
    private Label Labelwindow;

    @FXML
    private Label Labelwindow2;
    @FXML
    private TextField text;
    @FXML
    private TextField text1;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;
    @FXML
    private TextField text4;
    @FXML
    private TextField text5;
    @FXML
    private TextField text6;
    @FXML
    private TextField text7;
    @FXML
    private TextField text8;

    String s = "";
    String nameuser, tnum;

    double total = 0;
    int time = 0;

    double m1 = 0, m2 = 0, m3 = 0, m4 = 0, m5 = 0, m6 = 0, m7 = 0, m8 = 0, m9 = 0;

    double result1 = 0, result2 = 0, result3 = 0, result4 = 0, result5 = 0, result6 = 0, result7 = 0,
            result8 = 0, result9 = 0;

    public void AddB() {

        try {

            String Test = text.getText();
            double numtest = Double.parseDouble(Test);

            if (text.getText().equals("")) {

                errorLabel.setText("Please Input Numbers Only");

            } else if (text.getText().equals("0") || numtest < 0) {

                errorLabel.setText("Please Input Numbers Greatar than 0");

            } else {
                try {

                    double x = 10.00;
                    String Cheese_Burger = "Cheese Burger";

                    String t1 = text.getText();
                    m1 = Double.parseDouble(t1);
                    result1 = Double.parseDouble(t1) * x;
                    Method(result1, Cheese_Burger);
                    errorLabel.setText("");

                } catch (NumberFormatException e) {

                    errorLabel.setText("Please Input Numbers Only");

                }
            }
        } catch (Exception e) {
            errorLabel.setText("Please Input Numbers Only");
        }
    }

    public void AddB1() {

        try {

            String Test = text1.getText();
            double numtest = Double.parseDouble(Test);

            if (text1.getText().equals("")) {

                errorLabel.setText("Please Input Numbers Only");

            } else if (text1.getText().equals("0") || numtest < 0) {

                errorLabel.setText("Please Input Numbers Greatar than 0");

            } else {
                try {

                    double x = 12.00;
                    String D_Cheese_Burger = "Double Cheese Burger";
                    String t1 = text1.getText();
                    m2 = Double.parseDouble(t1);

                    result2 = Double.parseDouble(t1) * x;
                    Method(result2, D_Cheese_Burger);
                    errorLabel.setText("");
                } catch (NumberFormatException e) {

                    errorLabel.setText("Please Input Numbers Only");

                }
            }
        } catch (Exception e) {
            errorLabel.setText("Please Input Numbers Only");
        }

    }

    public void AddB2() {

        try {

            String Test = text2.getText();
            double numtest = Double.parseDouble(Test);

            if (text2.getText().equals("")) {

                errorLabel.setText("Please Input Numbers Only");

            } else if (text2.getText().equals("0") || numtest < 0) {

                errorLabel.setText("Please Input Numbers Greatar than 0");

            } else {
                try {

                    double x = 9.00;
                    String Chicken_Burger = "Chicken Burger";
                    String t1 = text2.getText();
                    m3 = Double.parseDouble(t1);
                    result3 = Double.parseDouble(t1) * x;
                    Method(result3, Chicken_Burger);
                    errorLabel.setText("");

                } catch (NumberFormatException e) {

                    errorLabel.setText("Please Input Numbers Only");

                }
            }
        } catch (Exception e) {
            errorLabel.setText("Please Input Numbers Only");
        }
    }

    public void AddB3() {

        try {

            String Test = text3.getText();
            double numtest = Double.parseDouble(Test);

            if (text3.getText().equals("")) {

                errorLabel.setText("Please Input Numbers Only");

            } else if (text3.getText().equals("0") || numtest < 0) {

                errorLabel.setText("Please Input Numbers Greatar than 0");

            } else {
                try {

                    double x = 6.00;
                    String vegetarian_Burger = "vegetarian Burger";
                    String t1 = text3.getText();
                    m4 = Double.parseDouble(t1);
                    result4 = Double.parseDouble(t1) * x;
                    Method(result4, vegetarian_Burger);
                    errorLabel.setText("");

                } catch (NumberFormatException e) {

                    errorLabel.setText("Please Input Numbers Only");

                }
            }
        } catch (Exception e) {
            errorLabel.setText("Please Input Numbers Only");
        }
    }

    public void AddB4() {

        try {

            String Test = text4.getText();
            double numtest = Double.parseDouble(Test);

            if (text4.getText().equals("")) {

                errorLabel.setText("Please Input Numbers Only");

            } else if (text4.getText().equals("0") || numtest < 0) {

                errorLabel.setText("Please Input Numbers Greatar than 0");

            } else {
                try {

                    double x = 10.00;
                    String Crispy_chicken_Burger = "Crispy Chicken Burger";
                    String t1 = text4.getText();
                    m5 = Double.parseDouble(t1);
                    result5 = Double.parseDouble(t1) * x;
                    Method(result5, Crispy_chicken_Burger);
                    errorLabel.setText("");

                } catch (NumberFormatException e) {

                    errorLabel.setText("Please Input Numbers Only");

                }
            }
        } catch (Exception e) {
            errorLabel.setText("Please Input Numbers Only");
        }
    }

    public void AddB5() {

        try {

            String Test = text5.getText();
            double numtest = Double.parseDouble(Test);

            if (text5.getText().equals("")) {

                errorLabel.setText("Please Input Numbers Only");

            } else if (text5.getText().equals("0") || numtest < 0) {

                errorLabel.setText("Please Input Numbers Greatar than 0");

            } else {
                try {

                    double x = 2.00;
                    String Soft_Drink = "Soft Drink ";
                    String t1 = text5.getText();
                    m6 = Double.parseDouble(t1);
                    result6 = Double.parseDouble(t1) * x;
                    Method(result6, Soft_Drink);
                    errorLabel.setText("");

                } catch (NumberFormatException e) {

                    errorLabel.setText("Please Input Numbers Only");

                }
            }
        } catch (Exception e) {
            errorLabel.setText("Please Input Numbers Only");
        }
    }

    public void AddB6() {

        try {

            String Test = text6.getText();
            double numtest = Double.parseDouble(Test);

            if (text6.getText().equals("")) {

                errorLabel.setText("Please Input Numbers Only");

            } else if (text6.getText().equals("0") || numtest < 0) {

                errorLabel.setText("Please Input Numbers Greatar than 0");

            } else {
                try {

                    double x = 3.00;
                    String Juices = "Juices";
                    String t1 = text6.getText();
                    m7 = Double.parseDouble(t1);
                    result7 = Double.parseDouble(t1) * x;
                    Method(result7, Juices);
                    errorLabel.setText("");

                } catch (NumberFormatException e) {

                    errorLabel.setText("Please Input Numbers Only");

                }
            }
        } catch (Exception e) {
            errorLabel.setText("Please Input Numbers Only");
        }
    }

    public void AddB7() {

        try {

            String Test = text7.getText();
            double numtest = Double.parseDouble(Test);

            if (text7.getText().equals("")) {

                errorLabel.setText("Please Input Numbers Only");

            } else if (text7.getText().equals("0") || numtest < 0) {

                errorLabel.setText("Please Input Numbers Greatar than 0");

            } else {
                try {

                    double x = 3.00;
                    String Ice_Tea = "Ice Tea";
                    String t1 = text7.getText();
                    m8 = Double.parseDouble(t1);
                    result8 = Double.parseDouble(t1) * x;
                    Method(result8, Ice_Tea);
                    errorLabel.setText("");

                } catch (NumberFormatException e) {

                    errorLabel.setText("Please Input Numbers Only");

                }
            }
        } catch (Exception e) {
            errorLabel.setText("Please Input Numbers Only");
        }
    }

    public void AddB8() {

        try {

            String Test = text8.getText();
            double numtest = Double.parseDouble(Test);

            if (text8.getText().equals("")) {

                errorLabel.setText("Please Input Numbers Only");

            } else if (text8.getText().equals("0") || numtest < 0) {

                errorLabel.setText("Please Input Numbers Greatar than 0");

            } else {
                try {

                    double x = 1.00;
                    String Watter = "Watter";
                    String t1 = text8.getText();
                    m9 = Double.parseDouble(t1);
                    result9 = Double.parseDouble(t1) * x;
                    Method(result9, Watter);
                    errorLabel.setText("");

                } catch (NumberFormatException e) {

                    errorLabel.setText("Please Input Numbers Only");

                }
            }
        } catch (Exception e) {
            errorLabel.setText("Please Input Numbers Only");
        }
    }

    public void dis(String num) {

        tnum = num;

    }

    public void dis2(String username) {
        NameL.setText("Hello " + username);
        nameuser = username;

    }

    public void Method(double result, String s) {

        total += result;
        Labelwindow.setText(s + " " + result + "$ Added.");
        Labelwindow2.setText(total + "$");

    }

    public void clear() {
        if (total == 0) {
            Labelwindow2.setText("You didn't Chose any Items");
        } else {

            total = 0;
            m1 = 0;
            m2 = 0;
            m3 = 0;
            m4 = 0;
            m5 = 0;
            m6 = 0;
            m7 = 0;
            m8 = 0;
            m9 = 0;

            Labelwindow2.setText("Clear done, You Can Order again Now");
            Labelwindow.setText("");
        }
    }

    public void Frame3open(ActionEvent event) throws IOException {
        if (total == 0) {
            errorLabel.setText("You Have To Order One Item At Least");
        } else {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sources/Frame3.fxml"));
            Parent parent = loader.load();
            Frame3Controller open = loader.getController();

            if (total > 100) {
                time = 20;
            } else if (total > 50 && total < 100) {
                time = 15;
            } else {
                time = 10;
            }

            open.dis(nameuser);
            open.dis2(tnum);
            open.dis3(total);
            open.dis4(time);

            if (m1 > 0) {
                open.F1("Cheese Burger", m1, result1);
            }
            if (m2 > 0) {
                open.F2("Cheese Burger", m2, result2);
            }
            if (m3 > 0) {
                open.F3("Chicken Burger", m3, result3);
            }
            if (m4 > 0) {
                open.F4("Vegetarian Burger", m4, result4);
            }
            if (m5 > 0) {
                open.F5("Crispy Chicken Burger", m5, result5);
            }
            if (m6 > 0) {
                open.F6("Soft Drink", m6, result6);
            }
            if (m7 > 0) {
                open.F7("Juices", m7, result7);
            }
            if (m8 > 0) {
                open.F8("Ice Tea", m8, result8);

            }
            if (m9 > 0) {
                open.F9("Watter", m9, result9);
            }

            Stage stage = new Stage();
            stage.setTitle("Recipt");
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();

            ((Node) (event.getSource())).getScene().getWindow().hide();
        }
    }

    public void back(ActionEvent event) throws IOException {

        Parent parent = FXMLLoader.load(getClass().getResource("/Sources/Frame1.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Sign up");
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

        ((Node) (event.getSource())).getScene().getWindow().hide();

    }

}
