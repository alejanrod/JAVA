
package clases;


public class visitante {
 
    public String numerodeidentificacion;
    public String nombre;
    public String apellidos;
    public String email;
    public int edad;
    public String fechavisita;
    public String dependenciadevisita;
    public String responsabledevisita;
    public String horadeingreso;
    public String horadesalida;

   public visitante(){
       
   }
   
 
   public visitante(String numerodeidentificacion, String nombre, String apellido, String email, int edad, String fechavisita, String dependenciadevisita, String responsabledevisita, String horadeingreso, String horadesalida){
       this.numerodeidentificacion=numerodeidentificacion;
       this.nombre=nombre;
       this.apellidos=apellido;
       this.edad=edad;
       this.email=email;
       this.fechavisita=fechavisita;
       this.dependenciadevisita=dependenciadevisita;
       this.responsabledevisita=responsabledevisita;
       this.horadeingreso=horadeingreso;
       this.horadesalida=horadesalida; 
   }
   
   public String toString(){
       return"identificacion:\n"+this.numerodeidentificacion+"edad:\n"+this.edad+"nombre:\n"+this.nombre+"apellidos:\n"+this.apellidos+"email:\n"+this.email+"fechavisita:\n"+this.fechavisita+"dependencia de visita:\n"+this.dependenciadevisita+"encargado de la visita:\n"+this.responsabledevisita+"hora de entrada:\n"+this.horadeingreso+"hora de salida:\n"+this.horadesalida;
   }
   public String getNumerodeidentificacion(){
       return this.numerodeidentificacion;
   }
   public void setNumerodeidentificacion(String numerodeidentificacion){
       this.numerodeidentificacion= numerodeidentificacion; 
   }
   public int getEdad(){
       return this.edad;    
   }
   public void setEdad(){
       this.edad = edad;
   }
   
   
   
   public void registraringreso(){
    
}
   public void registrarsalida(){
    
}
   public void registrarvisitante(){
   
}
    
    
   
    
}
