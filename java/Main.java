import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Hello JavaFX!");

        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 500, 400);

        stage.setTitle("JavaFX Label and ImageView");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
