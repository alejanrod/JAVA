/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleragregacion;

/**
 *
 * @author salacomputo
 */
public class Trabajadores extends Personas{
    private String cargo;
    private int salario;
    private String horarioDeTrabajo;

    public Trabajadores() {
    }

    public Trabajadores(String cargo, int salario, String horarioDeTrabajo, String tipoDeDocumento, int NumDocumento, String nombre, int edad, String sexo, int telefono) {
        super(tipoDeDocumento, NumDocumento, nombre, edad, sexo, telefono);
        this.cargo = cargo;
        this.salario = salario;
        this.horarioDeTrabajo = horarioDeTrabajo;
    }

    @Override
    public String toString() {
        return "Trabajadores:\n cargo:" + cargo + "\n salario:" + salario + "\n horarioDeTrabajo:" + horarioDeTrabajo;
    }
    
    
}
