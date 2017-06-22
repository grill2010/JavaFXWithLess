package com.grill.javafx.less.test;

import java.io.IOException;

import com.grill.javafx.less.test.widget.TestWidget;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class App extends Application
{
   private StackPane appRootElement;


   @Override
   public void start( final Stage primaryStage ) throws Exception
   {
      this.initRootElement();
      this.initStage( primaryStage );
      this.initTestWidget();
   }


   private void initRootElement() throws IOException
   {
      this.appRootElement = FXMLLoader.load( getClass().getResource( "Main.fxml" ) );
   }


   private void initStage( final Stage primaryStage )
   {
      final Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
      primaryStage.setTitle( "JavaFX-Less" );
      primaryStage.setScene( new Scene( this.appRootElement ) );
      primaryStage.setMaximized( true );
      primaryStage.setWidth( primaryScreenBounds.getWidth() );
      primaryStage.setHeight( primaryScreenBounds.getHeight() );
      primaryStage.show();
   }


   private void initTestWidget()
   {
      final TestWidget testWidget = new TestWidget();
      this.appRootElement.getChildren().add( testWidget );
   }
}
