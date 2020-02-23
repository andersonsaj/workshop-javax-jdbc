package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import model.services.DepartmentService;
import model.services.SellerService;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemVendedor;
	@FXML
	private MenuItem menuItemDepartamento;
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemVendedorAction() {
		loadView("/gui/SellerList.fxml",(SellerListController controller) ->{
			controller.setSellerService(new SellerService());
			controller.updateTableView();
		});
	}
	@FXML
	public void onMenuItemDepartamentoAction() {
		loadView("/gui/DepartamentoList.fxml",(DepartmentListController controller) ->{
			controller.setDepartmentService(new DepartmentService());
			controller.updateTableView();
		});
	}
	@FXML
	public void onMenuItemAboutAction() {
		loadView("/gui/About.fxml", x-> {});
	}
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	
	private synchronized <T> void loadView(String absoluteName, Consumer<T> initializingAction) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox vBox = loader.load();
			
			Scene scene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) scene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(vBox.getChildren());
			
			T controller = loader.getController();
			initializingAction.accept(controller);
		}
		catch(IOException e) {
			Alerts.showAlert("IOException", "Error loading view", e.getMessage(),AlertType.ERROR);
			
		}
	}
}
