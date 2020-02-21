package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Scene scene;
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			//Parent parent = loader.load();
			ScrollPane scrollPane = loader.load();
			
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);
			
			scene = new Scene(scrollPane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("JavaFX application");
			primaryStage.show();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static Scene getMainScene() {
		return scene;
	}
	public static void main(String[] args) {
		launch(args);
	}
}
