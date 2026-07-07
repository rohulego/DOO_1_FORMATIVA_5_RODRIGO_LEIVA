
package data;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class GestorServicios {
    
    //declarar coleccion polimorfica
    private List<ServicioTuristico> lista = new ArrayList<>();
    
    //metodo para cargarservicios
    public void cargarServicios(){
    //Carga manual
    lista.add(new RutaGastronomica("Sabores de Casa",20000,"Cazuela"));
    lista.add(new RutaGastronomica("Sabores de Ciudad",10000, "Completos"));
    lista.add(new RutaGastronomica("Ruta de la Cerveza",25000, "Tabla de cervezas artesanales"));
    lista.add(new ServicioTuristico("Ruta Generica",15000)); //instancia base
    lista.add(new PaseoLacustre("Tour a los rios", 30000,"Rio X",3,"Lancha a motor"));
    lista.add(new PaseoLacustre("Tour a los rios", 30000,"Rio Y",3,"Lancha a motor"));
    lista.add(new PaseoLacustre("Tour a los lagos", 50000,"Lago Z",5,"Catamaran"));
    lista.add(new ExcursionCultural("Casco Historico", 25000,"Concierto Orquesta Sinfónica"));
    lista.add(new ExcursionCultural("Barrio Bohemio", 20000,"Club de Jazz"));
    lista.add(new ExcursionCultural("Arte vivo", 15000,"Museo de Arte Contemporaneo"));
    }
    //esto levanta la informacion
    public List<ServicioTuristico> getLista(){
        return lista;
    }
    
}
