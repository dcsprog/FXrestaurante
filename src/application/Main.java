package application;
	
import controller.GestaoMesas;
import javafx.application.Application;
import javafx.stage.Stage;
import view.Fmesas;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	GestaoMesas gmMesas;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			gmMesas=new GestaoMesas();
			Fmesas janela_M = new Fmesas(320,240, gmMesas);
			
			primaryStage.setScene(janela_M);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
