package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
	public static void display(String message) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Alert");
		window.setWidth(250);
		window.setHeight(150);
		
		Label label = new Label();
		label.setText(message);
		label.setFont(new Font(20));
		Button close = new Button("Close");
		close.setOnAction(e -> {
			window.close();
		});
		
		VBox box = new VBox();
		box.getChildren().addAll(label, close);
		box.setSpacing(10);
		box.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(box);
		window.setScene(scene);
		window.showAndWait();
	}
}
