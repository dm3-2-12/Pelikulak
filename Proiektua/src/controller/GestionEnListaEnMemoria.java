/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Pelikula;

/**
 *
 * @author DM3-2-12
 */
public class GestionEnListaEnMemoria {
    
   public static ObservableList<Pelikula> datuak(){
        
        return FXCollections.observableArrayList(
            new Pelikula("Advengers: Infinity War", "Anthony Russo & Joe Russo", "2h 40m",12,2018),
            new Pelikula("Black Panther","Ryan Coogler", "2h 15m",12,2018),
            new Pelikula("Los Increíbles 2", "Brad Bird", "2h 5m",3,2018),
            new Pelikula("Cartelera de Jurassic World: El reino caído", "Juan Antonio Bayona", "2h 10m",16,2018)
        );
   }
}
