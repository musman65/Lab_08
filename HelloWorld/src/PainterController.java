import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class PainterController {

    @FXML
    private Button Clear;

    @FXML
    private Button Undo;

    @FXML
    private RadioButton blackRadio;

    @FXML
    private RadioButton blueRadio;

    @FXML
    private ToggleGroup colorToggleGroup;

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private RadioButton greenRadio;

    @FXML
    private RadioButton largeRadio;

    @FXML
    private RadioButton mediumRadio;

    @FXML
    private RadioButton redRadio;

    @FXML
    private ToggleGroup sizeToggleGroup;

    @FXML
    private RadioButton smallRadio;

    @FXML
    void clearButtonPressed(ActionEvent event) {

    }

    @FXML
    void colorRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {

    }

    @FXML
    void sizeRadioButtonSelected(ActionEvent event) {

    }

    @FXML
    void undoButtonPressed(ActionEvent event) {

    }
    
    private enum PenSize {
        SMALL(2),
        MEDIUM(4),
        LARGE(6);
        
        private final int radius;

        private PenSize(int radius) {
            this.radius = radius;
        }
        
        public int getRadius() {return radius;}
    }
}