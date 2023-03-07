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

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public int getNumDocumento() {
        return NumDocumento;
    }

    public void setNumDocumento(int NumDocumento) {
        this.NumDocumento = NumDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    
    @Override
    public String toString() {
        return "Personas{" + "tipoDeDocumento=" + tipoDeDocumento + ", NumDocumento=" + NumDocumento + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", telefono=" + telefono + '}';
    }
    
    
}
