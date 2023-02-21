/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleragregacion;

/**
 *
 * @author salacomputo
 */
public class Personas {
    private String tipoDeDocumento;
    private int NumDocumento;
    private String nombre;
    private int edad;
    private String sexo;
    private int telefono;

    public Personas() {
    }

    public Personas(String tipoDeDocumento, int NumDocumento, String nombre, int edad, String sexo, int telefono) {
        this.tipoDeDocumento = tipoDeDocumento;
        this.NumDocumento = NumDocumento;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Personas{" + "tipoDeDocumento=" + tipoDeDocumento + ", NumDocumento=" + NumDocumento + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", telefono=" + telefono + '}';
    }
    
    
}
