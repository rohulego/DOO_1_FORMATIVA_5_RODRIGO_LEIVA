package ui;

import data.GestorServicios;
import model.ServicioTuristico; //por el chorreo

public class Main {
    
    public static void main(String[] args){
        GestorServicios gestor = new GestorServicios();
        gestor.cargarServicios();
        
        System.out.println("--- CATALOO POLIMORFICO LLANGUIHUE TOUR ---");
        
        //s almacena lo que hay en la lista, luego s con el metodo mostrarInformacion
        for (ServicioTuristico s : gestor.getLista()){
            s.mostrarInformacion(); //polimorfismo + magia!
        }
    
    }
    
}
