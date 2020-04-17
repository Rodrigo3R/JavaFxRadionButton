package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class ViewController {

	@FXML
	private Button btTest;
	
	@FXML
	private Label lbTest;
	
	@FXML
    private RadioButton rbComidas;

    @FXML
    private RadioButton rbBebidas;

	@FXML
	public void onBtTestActon() {
		System.out.println(rbComidas.selectedProperty().getValue());
		System.out.println(rbBebidas.selectedProperty().getValue());
	}
	// mesmos comandos do checkBox.
}
