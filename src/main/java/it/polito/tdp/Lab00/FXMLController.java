
package it.polito.tdp.Lab00;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {
	
	 

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtNomeUtente"
    private TextField txtNomeUtente; // Value injected by FXMLLoader

    @FXML // fx:id="txtPassword"
    private TextField txtPassword; // Value injected by FXMLLoader

    @FXML // fx:id="btnPremuto"
    private Button btnPremuto; // Value injected by FXMLLoader

    @FXML // fx:id="txtStatoAccesso"
    private Label txtStatoAccesso; // Value injected by FXMLLoader

    //private boolean formatoCorretto= txtPassword.getText().matches("((?=.*[0-9])(?=.*[A-Z])(?=.*[!?@#]).{7,20})");
    //private int tentativiFatti;
    
    
    @FXML
    void doAccesso(ActionEvent event) {
    	if (txtNomeUtente.getText().equals("")&& txtPassword.getText().equals("")) {
    		txtStatoAccesso.setText("ERRORE: Compila tutti e due i campi");
    		return;
    	}
    	if (txtNomeUtente.getText().length()!=0 && txtPassword.getText().equals("")) {
    		txtStatoAccesso.setText("INSERIRE LA PASSWORD!");
    		return;
    	}
    	if (txtNomeUtente.getText().equals("") && txtPassword.getText().length()!=0) {
    		txtStatoAccesso.setText("INSERIRE NOME UTENTE!");
    		return;
    	}
    	if (txtNomeUtente.getText().length()!=0 && txtPassword.getText().length()!=0) {
    		if (txtPassword.getText().matches(("((?=.*[0-9])(?=.*[A-Z])(?=.*[!?@#]).{7,20})"))) {
    			txtStatoAccesso.setText("ACCESSO AVVENUTO CON SUCCESSO!");
    			
    		}
    		else {
    			txtStatoAccesso.setText("Password ERRATA, rispetta le condizioni.");
    			
    		}
    			
    	}
    	return;
        
    }

    
    @FXML
    void handleControlla(ActionEvent event) { //Controllo nome utente
    	/*if (txtNomeUtente.getText().equals("")&& txtPassword.getText().equals("")) {
    		txtStatoAccesso.setText("ERRORE: Compila tutti e due i campi");
    		return;
    	}
    	if (txtNomeUtente.getText().length()!=0 && txtPassword.getText().equals("")) {
    		txtStatoAccesso.setText("INSERIRE LA PASSWORD!");
    		return;
    	}*/
        
    }

   

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtNomeUtente != null : "fx:id=\"txtNomeUtente\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnPremuto != null : "fx:id=\"btnPremuto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtStatoAccesso != null : "fx:id=\"txtStatoAccesso\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}

