/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleragregacion;

/**
 *
 * @author salacomputo
 */
public class Consecionario {
    private String nombreconsecinario;
    private String sucursal;
    private String direccion;
    private String correo;
    private int telefono;
    
    private Clientes[] cliente = new Clientes[0];
    
    private Trabajadores[] trabajadores;
    private Carros[] carros;
    
    public Consecionario() {
    }

    public Consecionario(String nombreconsecinario, String sucursal, String direccion, String correo, int telefono) {
        this.nombreconsecinario = nombreconsecinario;
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Consecionario{" + "nombreconsecinario=" + nombreconsecinario + ", sucursal=" + sucursal + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + ", cliente=" + cliente + ", trabajadores=" + trabajadores + ", carros=" + carros + '}';
    }
    
}
