module com.example.lab3ishanpreetsingh {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.lab3ishanpreetsingh to javafx.fxml;
    exports com.example.lab3ishanpreetsingh;
}