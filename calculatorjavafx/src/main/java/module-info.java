module kg.app.calculatorjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens kg.app.calculatorjavafx to javafx.fxml;
    exports kg.app.calculatorjavafx;
}