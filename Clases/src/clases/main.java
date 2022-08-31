
package clases;


public class main {
    
    public static visitante visitante =new visitante();
    public static EquipoTecnologico equipo =new EquipoTecnologico();
        


public static void main(String[] args) {


    System.out.println("invocar metodo void");
    metodotipovoid();
    System.out.println("se ejecuto metodo void existosamente\n\n");
    String capturadato = metodoretornastring();
    System.out.println(capturadato);
    System.out.println("aqui finaliza la ejecucion del programa\n\n\n");
    
    suma(5, 7);
    division(3, 2);
 
    visitante=new visitante();
    System.out.println(visitante.toString());
    visitante=new visitante( "23456789", ," alejandro", "carodriexamplocom"," 20220830", "facultad de sistemas", "decano", "capturadato", "20:45","23.56");
    
}
public static void metodotipovoid (){
    System.out.println("soy un metodo tipo void");
    System.out.println("FINALIZO EJECUCION METODO VOID \n ");
   
}

public static String metodoretornastring(){
    String messagge="este es el mensaje retornado de la ejecucion del metodo\n\n" ;
    return messagge;
    
}

public static void suma(int a, int b){
    int c = a + b;
    System.out.println("el resultado de la suma es:"+c);
}
public static void division(int a, int b){
    double c = a / b;
    System.out.println("el resultado de la divison es:"+c);
}
public static void multipicacion(int a, int b){
    int d = a * b;
    System.out.println(d);
}

}