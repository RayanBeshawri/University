/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package MainAndController;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Frame1Controller {

    @FXML
    private Label l4;

    @FXML
    private TextField t1;

    @FXML
    private TextField t2;

    public void signup(ActionEvent event) throws IOException {

        try {

            String T2 = t2.getText();
            double T2num = Double.parseDouble(T2);

            if (t1.getText().equals("") || t2.getText().equals("")) {

                l4.setText("Please full all inf");

            } else if (T2num <= 0 || T2num > 50) {

                l4.setText("Please Input Tabel Number In Range [1 to 50] only");

            } else {

                FileWriter Fwriter = new FileWriter("Customers", true);
                PrintWriter outputFile = new PrintWriter(Fwriter);

                outputFile.println("____________________________");
                outputFile.println("Name: " + t1.getText());
                outputFile.println("Tabel Number: " + t2.getText());
                outputFile.println(",");

                outputFile.close();

                String username = t1.getText();
                String tabelnumber = t2.getText();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sources/Frame2.fxml"));
                Parent parent = loader.load();

                Frame2Controller f = loader.getController();
                f.dis2(username);
                f.dis(tabelnumber);

                Stage stage = new Stage();
                stage.setTitle("Menu");
                Scene scene = new Scene(parent);
                stage.setScene(scene);
                stage.show();

                ((Node) (event.getSource())).getScene().getWindow().hide();
            }
        } catch (NumberFormatException e) {

            l4.setText("Please Input Numbers Only In field Tabel Number, And Full All Info");
        }
    }

}
