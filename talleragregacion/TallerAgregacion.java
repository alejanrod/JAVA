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
     
        Consecionario consecionario = new Consecionario( "san autos", "suba", "cll 157 # 113 c - 15", "alguien@gmail.com", 2022222,
                                                             new Clientes("cedula de ciudadania", 234424423, "cristian", 30, "masculino", 324123),
                                                                  new Trabajadores("encargado de ventas", 2500000, "8 am - 3 pm", "cedula de ciudadania", 10023933, "alejandro", 34, "masculino", 321926414), 
                                                                      new Carros("toyota", "cruiser", 2022, "blanco", 6, 0));
        //System.out.println(consecionario.toString());  
        // System.out.println(clientes2);
        
        //sobrecarga de metodo, creamos un objeto carro condiferentes parametros
                Carros carro = new Carros();
            
        carro.addcarro("mercedes", 2023, "negro");
        carro.addcarro("toyota", "cruiser", 2020, "amarillo", 4, 23456);

        System.out.println(carro);
    }
        
        
    }
    
}
