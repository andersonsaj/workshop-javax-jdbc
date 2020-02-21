package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemVendedor;
	@FXML
	private MenuItem menuItemDepartamento;
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemVendedorAction() {
		System.out.println("v");
	}
	@FXML
	public void onMenuItemDepartamentoAction() {
		System.out.println("D");
	}
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("A");
	}
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

}
