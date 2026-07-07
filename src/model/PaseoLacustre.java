package model;


public class PaseoLacustre extends ServicioTuristico {
    
    private String nombreLugar;
    private int duracionHoras;
    private String embarcacion;

    public PaseoLacustre() {
    }

    public PaseoLacustre(String nombreLugar, int duracionHoras, String embarcacion) {
        this.nombreLugar = nombreLugar;
        this.duracionHoras = duracionHoras;
        this.embarcacion = embarcacion;
    }

    public PaseoLacustre(String nombre, int precio,String nombreLugar, int duracionHoras, String embarcacion) {
        super(nombre, precio);
        this.nombreLugar = nombreLugar;
        this.duracionHoras = duracionHoras;
        this.embarcacion = embarcacion;
    }

 
    
    
    @Override
    public void mostrarInformacion(){
       super.mostrarInformacion();
       System.out.println("Tipo: Naturaleza | Lugar: " + nombreLugar + " | Duracion: " + duracionHoras + "hrs. | Embarcación: " + embarcacion);
   
   }
   
}
