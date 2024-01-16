/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package MainAndController;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author owd1
 */
public class Frame3Controller {

    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
    }

    @FXML
    private Label totLabel;

    @FXML
    private Label time;

    @FXML
    private Label TabelNumLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Label LabelBoolean1;

    @FXML
    private Label LabelBoolean2;

    @FXML
    private Label LabelBoolean3;

    @FXML
    private Label LabelBoolean4;

    @FXML
    private Label LabelBoolean5;

    @FXML
    private Label LabelBoolean6;

    @FXML
    private Label LabelBoolean7;

    @FXML
    private Label LabelBoolean8;

    @FXML
    private Label LabelBoolean9;

    @FXML
    private Label qLabel1;

    @FXML
    private Label qLabel2;

    @FXML
    private Label qLabel3;

    @FXML
    private Label qLabel4;

    @FXML
    private Label qLabel5;

    @FXML
    private Label qLabel6;

    @FXML
    private Label qLabel7;

    @FXML
    private Label qLabel8;

    @FXML
    private Label qLabel9;

    @FXML
    private Label pLabel1;

    @FXML
    private Label pLabel2;

    @FXML
    private Label pLabel3;

    @FXML
    private Label pLabel4;

    @FXML
    private Label pLabel5;

    @FXML
    private Label pLabel6;

    @FXML
    private Label pLabel7;

    @FXML
    private Label pLabel8;
    @FXML
    private Label pLabel9;

    double totforF = 0;

    public void dis(String username) {
        nameLabel.setText("" + username);

    }

    public void dis2(String num) {

        TabelNumLabel.setText("" + num);
    }

    public void dis3(double total) throws IOException {

        totLabel.setText(total + "$");
        totforF = total;

        FileWriter Fwriter = new FileWriter("Customers", true);
        PrintWriter outputFile = new PrintWriter(Fwriter);

        outputFile.println("Total: " + totforF + "$");
        outputFile.println(",");
        outputFile.close();
    }

    public void dis4(int t) {

        time.setText(t + " min");
    }

    public void F1(String meal, double q1, double p1) throws IOException //one  
    {

        //☒ ;
        qLabel1.setText("" + q1);
        pLabel1.setText(p1 + "$");
        LabelBoolean1.setText("☑");
        FileWriter Fwriter = new FileWriter("Customers", true);
        PrintWriter outputFile = new PrintWriter(Fwriter);

        outputFile.println("Meal: " + meal);
        outputFile.println("Quantity: " + q1);
        outputFile.println("Price: " + p1 + "$");
        outputFile.close();
    }

    public void F2(String meal, double q1, double p1) throws IOException //one  
    {

        qLabel2.setText("" + q1);
        LabelBoolean2.setText("☑");
        pLabel2.setText(p1 + "$");

        FileWriter Fwriter = new FileWriter("Customers", true);
        PrintWriter outputFile = new PrintWriter(Fwriter);

        outputFile.println("Meal: " + meal);
        outputFile.println("Quantity: " + q1);
        outputFile.println("Price: " + p1 + "$");
        outputFile.close();
    }

    public void F3(String meal, double q1, double p1) throws IOException //one  
    {

        qLabel3.setText("" + q1);
        LabelBoolean3.setText("☑");
        pLabel3.setText(p1 + "$");

        FileWriter Fwriter = new FileWriter("Customers", true);
        PrintWriter outputFile = new PrintWriter(Fwriter);

        outputFile.println("Meal: " + meal);
        outputFile.println("Quantity: " + q1);
        outputFile.println("Price: " + p1 + "$");
        outputFile.close();
    }

    public void F4(String meal, double q1, double p1) throws IOException //one  
    {

        qLabel4.setText("" + q1);
        LabelBoolean4.setText("☑");
        pLabel4.setText(p1 + "$");

        FileWriter Fwriter = new FileWriter("Customers", true);
        PrintWriter outputFile = new PrintWriter(Fwriter);

        outputFile.println("Meal: " + meal);
        outputFile.println("Quantity: " + q1);
        outputFile.println("Price: " + p1 + "$");
        outputFile.close();
    }

    public void F5(String meal, double q1, double p1) throws IOException //one  
    {

        qLabel5.setText("" + q1);
        LabelBoolean5.setText("☑");
        pLabel5.setText(p1 + "$");

        FileWriter Fwriter = new FileWriter("Customers", true);
        PrintWriter outputFile = new PrintWriter(Fwriter);

        outputFile.println("Meal: " + meal);
        outputFile.println("Quantity: " + q1);
        outputFile.println("Price: " + p1 + "$");
        outputFile.close();
    }

    public void F6(String meal, double q1, double p1) throws IOException //one  
    {

        qLabel6.setText("" + q1);
        LabelBoolean6.setText("☑");
        pLabel6.setText(p1 + "$");

        FileWriter Fwriter = new FileWriter("Customers", true);
        PrintWriter outputFile = new PrintWriter(Fwriter);

        outputFile.println("Meal: " + meal);
        outputFile.println("Quantity: " + q1);
        outputFile.println("Price: " + p1 + "$");
        outputFile.close();
    }

    public void F7(String meal, double q1, double p1) throws IOException //one  
    {

        qLabel7.setText("" + q1);
        LabelBoolean7.setText("☑");
        pLabel7.setText(p1 + "$");

        FileWriter Fwriter = new FileWriter("Customers", true);
        PrintWriter outputFile = new PrintWriter(Fwriter);

        outputFile.println("Meal: " + meal);
        outputFile.println("Quantity: " + q1);
        outputFile.println("Price: " + p1 + "$");
        outputFile.close();
    }

    public void F8(String meal, double q1, double p1) throws IOException //one  
    {

        qLabel8.setText("" + q1);
        LabelBoolean8.setText("☑");
        pLabel8.setText(p1 + "$");

        FileWriter Fwriter = new FileWriter("Customers", true);
        PrintWriter outputFile = new PrintWriter(Fwriter);

        outputFile.println("Meal: " + meal);
        outputFile.println("Quantity: " + q1);
        outputFile.println("Price: " + p1 + "$");
        outputFile.close();
    }

    public void F9(String meal, double q1, double p1) throws IOException //one  
    {

        qLabel9.setText("" + q1);
        LabelBoolean9.setText("☑");
        pLabel9.setText(p1 + "$");

        FileWriter Fwriter = new FileWriter("Customers", true);
        PrintWriter outputFile = new PrintWriter(Fwriter);

        outputFile.println("Meal: " + meal);
        outputFile.println("Quantity: " + q1);
        outputFile.println("Price: " + p1 + "$");
        outputFile.close();
    }

}
