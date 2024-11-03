package com.example.catimagedownloader;

//import com.fasterxml
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class CatGalleryApp extends Application {

    private static final String CAT_API_URL = "https://api.thecatapi.com/v1/images/search";
    private static final HttpClient client = HttpClient.newHttpClient();
    //    private static final ObjectMapper
    private static final ObjectMapper objectMapper = new ObjectMapper();


    private List<Image> catImages = new ArrayList<>();
    private TilePane galleryPane;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Cat Gallery App");

        galleryPane = new TilePane();
        galleryPane.setPadding(new Insets(10));
        galleryPane.setHgap(10);
        galleryPane.setVgap(10);

        Button downloadButton = new Button("Fetch Cat Image");
        downloadButton.setOnAction(e -> fetchAndDisplayCatImage());

        javafx.scene.layout.VBox root = new javafx.scene.layout.VBox(10, downloadButton, galleryPane);
        root.setPadding(new Insets(15));

        // Show the stage
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void fetchAndDisplayCatImage() {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(CAT_API_URL))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Parse JSON response
            JsonNode jsonNode = objectMapper.readTree(response.body());
            String imageUrl = jsonNode.get(0).get("url").asText();
            Image catImage = new Image(imageUrl, true);
            catImages.add(catImage);
            addToGallery(catImage);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addToGallery(Image image) {
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(150);
        imageView.setFitHeight(150);
        imageView.setPreserveRatio(true);
        galleryPane.getChildren().add(imageView);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
