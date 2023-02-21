/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleragregacion;

/**
 *
 * @author salacomputo
 */
public class Clientes extends Personas {

    public Clientes(String tipoDeDocumento, int NumDocumento, String nombre, int edad, String sexo, int telefono) {
        super(tipoDeDocumento, NumDocumento, nombre, edad, sexo, telefono);
    }

    @Override
    public String toString() {
        return "Clientes{" + '}';
    }
    
    
}//cierra clase
