package com.sid.popuptest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.stage.Stage;

public class PopupTest extends Application {

    @Override
    public void start(Stage stage) {

        // UI Controls
        Button menuButton = new Button("Open ContextMenu");
        Button tooltipButton = new Button("Hover for Tooltip");
        CheckBox shadowToggle = new CheckBox("Enable popup shadows");

        // ContextMenu
        ContextMenu menu = new ContextMenu(
            new MenuItem("Users"),
            new MenuItem("Settings"),
            new SeparatorMenuItem(),
            new MenuItem("Log out")
        );

        // Tooltip
        Tooltip tooltip = new Tooltip("This is a rounded tooltip!");
        tooltipButton.setTooltip(tooltip);

        // Show ContextMenu
        menuButton.setOnAction(e -> {
            menu.show(menuButton, Side.BOTTOM, 0, 5);
        });

        // Toggle popup shadows
        shadowToggle.setOnAction(e -> {

            if (shadowToggle.isSelected()) {

                menu.setStyle("""
                    -fx-effect: dropshadow(
                        gaussian,
                        rgba(0, 0, 0, 0.3),
                        18,
                        0,
                        0,
                        4
                    );
                """);

                tooltip.setStyle("""
                    -fx-effect: dropshadow(
                        gaussian,
                        rgba(0, 0, 0, 0.3),
                        18,
                        0,
                        0,
                        4
                    );
                """);

            } else {

                menu.setStyle("-fx-effect: null;");
                tooltip.setStyle("-fx-effect: null;");

            }
        });

        // Main layout
        VBox root = new VBox(
            20,
            menuButton,
            tooltipButton,
            shadowToggle
        );

        root.setPadding(new Insets(50));

        root.setStyle("""
            -fx-background-color: #292929;
        """);

        // Scene
        Scene scene = new Scene(root, 500, 350);

        // Load CSS
        scene.getStylesheets().add(
            getClass()
                .getResource("/popup.css")
                .toExternalForm()
        );

        // Stage
        stage.setScene(scene);
        stage.setTitle("JavaFX Popup Rendering Test");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}