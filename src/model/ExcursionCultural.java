package model;


public class ExcursionCultural extends ServicioTuristico {
    
    private String tipoEvento;

    public ExcursionCultural() {
    }

    public ExcursionCultural(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public ExcursionCultural(String nombre, int precio, String tipoEvento) {
        super(nombre, precio);
        this.tipoEvento = tipoEvento;
    }
    
    @Override
    public void mostrarInformacion(){
       super.mostrarInformacion();
        System.out.println("Tipo: Cultural | Evento: " + tipoEvento);
   
   }

 
}
