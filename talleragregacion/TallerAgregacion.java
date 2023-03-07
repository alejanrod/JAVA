/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package talleragregacion;

/**
 *
 * @author salacomputo
 */
public class TallerAgregacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consecionario consecionario = new Consecionario("San Autos", "suba", "cll 34 #113-f 80", "correo@gmail.com", 35215);
        Trabajadores trabajadores = new Trabajadores("encargado de ventas", 2500000, "8 am - 3 pm", "cedula de ciudadania", 10023933, "alejandro", 34, "masculino", 321926414);
        Carros carros = new Carros("toyota", "cruiser", 2022, "blanco", 6, 0);
        Clientes clientes = new Clientes("cedula de ciudadania", 234424423, "cristian", 30, "masculino", 324123 );
        System.out.println(consecionario);
        System.out.println(carros);
        System.out.println(trabajadores);
        System.out.println(clientes);
        
        
        
        
        public static void main(String[] args) {
        
        
        Trabajadores trabajadores = new Trabajadores("encargado de ventas", 2500000, "8 am - 3 pm", "cedula de ciudadania", 10023933, "alejandro", 34, "masculino", 321926414);
        Carros carros = new Carros("toyota", "cruiser", 2022, "blanco", 6, 0);
        Clientes clientes = new Clientes("cedula de ciudadania", 234424423, "cristian", 30, "masculino", 324123);
        Consecionario consecionario = new Consecionario( "san autos", "suba", "cll 157 # 113 c - 15", "alguien@gmail.com", 2022222,
                                                             new Clientes("cedula de ciudadania", 234424423, "cristian", 30, "masculino", 324123),
                                                                  new Trabajadores("encargado de ventas", 2500000, "8 am - 3 pm", "cedula de ciudadania", 10023933, "alejandro", 34, "masculino", 321926414), 
                                                                      new Carros("toyota", "cruiser", 2022, "blanco", 6, 0));
        System.out.println(consecionario.toString());  
      
        
        System.out.println(clientes);
    }
        
        
    }
    
}
