package com.grill.javafx.less.test.widget;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class TestWidget extends Pane
{
   public TestWidget( )
   {
      try
      {
         final FXMLLoader fxmlLoader = new FXMLLoader( getClass().getResource( "TestWidget.fxml" ) );
         fxmlLoader.setRoot( this );
         fxmlLoader.setController( this );
         fxmlLoader.load();
      }
      catch ( final IOException e )
      {
         e.printStackTrace();
      }
   }
}
