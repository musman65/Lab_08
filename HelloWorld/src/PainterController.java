import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class PainterController {
    //GUI components
    @FXML private Button Clear;
    @FXML private Button Undo;
    @FXML private RadioButton blackRadio;
    @FXML private RadioButton blueRadio;
    @FXML private ToggleGroup colorToggleGroup;
    @FXML private Pane drawingAreaPane;
    @FXML private RadioButton greenRadio;
    @FXML private RadioButton largeRadio;
    @FXML private RadioButton mediumRadio;
    @FXML private RadioButton redRadio;
    @FXML private ToggleGroup sizeToggleGroup;
    @FXML private RadioButton smallRadio;
    
    //Painter state variables
    private PenSize radius = PenSize.MEDIUM;
    private Paint brushColor = Color.BLACK;
    
    public void initialize() {
        blackRadio.setUserData(Color.BLACK);
        redRadio.setUserData(Color.RED);
        greenRadio.setUserData(Color.GREEN);
        blueRadio.setUserData(Color.BLUE);
        smallRadio.setUserData(PenSize.SMALL);
        mediumRadio.setUserData(PenSize.MEDIUM);
        largeRadio.setUserData(PenSize.LARGE);
    }
    
    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle circle = new Circle();
        if (event.getX() < 0 || event.getY() < 0) {
            return;
        }
        circle.setRadius(radius.getRadius());
        circle.setFill(brushColor);
        circle.setLayoutX(event.getX());
        circle.setLayoutY(event.getY());
        drawingAreaPane.getChildren().addAll(circle);
    }
    
    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void colorRadioButtonSelected(ActionEvent event) {
        brushColor = (Paint) colorToggleGroup.getSelectedToggle().getUserData();
    }


    @FXML
    void sizeRadioButtonSelected(ActionEvent event) {
        radius = (PenSize) sizeToggleGroup.getSelectedToggle().getUserData();
    }

    @FXML
    void undoButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().remove(drawingAreaPane.getChildren().get(drawingAreaPane.getChildren().size() - 1));
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

