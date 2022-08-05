
package parcial.pkg1;
import java.util.Scanner;

public class Parcial1 {


    public static void main(String[] args) {
        int matriz [][]= new int[5][4];
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escriba la matriz");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Matriz["+i+"]["+j+"]:");
                
                matriz [i][j]= entrada.nextInt();
                
    
            }
        }
         System.out.println("tabla");
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 4; j++) {
                 System.out.print(matriz[i][j]);
               
             }
             System.out.println(" ");
        }   
         
         int f1c1 = matriz[0][0],f1c2 = matriz[0][1],f1c3 = matriz[0][2],f1c4 = matriz[0][3];
         int total = f1c1+f1c2+f1c3+f1c4;
         int porcentaje = (int) (total*0.20) ;
         int totalC = total + porcentaje;
         int porcentajeL = (int) (totalC*0.05) ;
         int totaL = (totalC - porcentajeL);
         System.out.println(" ");

        System.out.println("Resultados del primer empleado");
        System.out.println("El total de ventas: " +total);
        System.out.println("El total de ventas y comicion: "+totalC);
        System.out.println("El liquido a recibir es:"+totaL);
        System.out.println(" ");
       
         int f2c1 = matriz[1][0],f2c2 = matriz[1][1],f2c3 = matriz[1][2],f2c4 = matriz[1][3];
         int total2 = f2c1+f2c2+f2c3+f2c4;
         int porcentaje2 = (int) (total2*0.20) ;
         int totalC2 = total2 + porcentaje2;
         int porcentajeL2 = (int) (totalC2*0.05) ;
         int totaL2 = (totalC2 - porcentajeL2);
         System.out.println(" ");
         
        System.out.println("Resultados del segundo empleado");
        System.out.println("El total de ventas: " +total2);
        System.out.println("El total de ventas y comicion: "+totalC2);
        System.out.println("El liquido a recibir es:"+totaL2);
        System.out.println(" ");

         int f3c1 = matriz[2][0],f3c2 = matriz[2][1],f3c3 = matriz[2][2],f3c4 = matriz[2][3];
         int total3 = f3c1+f3c2+f3c3+f3c4;
         int porcentaje3 = (int) (total3*0.20) ;
         int totalC3 = total3 + porcentaje3;
         int porcentajeL3 = (int) (totalC3*0.05) ;
         int totaL3 = (totalC3 - porcentajeL3);
         System.out.println(" ");
         
        System.out.println("Resultados del tercer empleado empleado");
        System.out.println("El total de ventas: " +total3);
        System.out.println("El total de ventas y comicion: "+totalC3);
        System.out.println("El liquido a recibir es:"+totaL3);
        System.out.println(" ");
        
         int f4c1 = matriz[3][0],f4c2 = matriz[3][1],f4c3 = matriz[3][2],f4c4 = matriz[3][3];
         int total4 = f4c1+f4c2+f4c3+f4c4;
         int porcentaje4 = (int) (total4*0.20) ;
         int totalC4 = total4 + porcentaje4;
         int porcentajeL4 = (int) (totalC4*0.05) ;
         int totaL4 = (totalC4 - porcentajeL4);
         System.out.println(" ");
         
        System.out.println("Resultados del cuarto empleado");
        System.out.println("El total de ventas: " +total4);
        System.out.println("El total de ventas y comicion: "+totalC4);
        System.out.println("El liquido a recibir es:"+totaL4);
        System.out.println(" ");
}         

}
    

