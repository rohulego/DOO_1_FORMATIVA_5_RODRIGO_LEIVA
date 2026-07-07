package model;


public class RutaGastronomica extends ServicioTuristico {
    
    private String especialidad;

    public RutaGastronomica() {
    }

    public RutaGastronomica(String especialidad) {
        this.especialidad = especialidad;
    }

    public RutaGastronomica(String nombre, int precio, String especialidad) {
        super(nombre, precio);
        this.especialidad = especialidad;
    }

//    public String getEspecialidad() {
//        return especialidad;
//    }
//
//    public void setEspecialidad(String especialidad) {
//        this.especialidad = especialidad;
//    }

   
    @Override
    public void mostrarInformacion(){
       super.mostrarInformacion();
        System.out.println("Tipo: Gastronomico | Especialidad: " + especialidad);
   
   }


    
    

}