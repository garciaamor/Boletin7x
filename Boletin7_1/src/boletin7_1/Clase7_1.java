package boletin7_1;

import javax.swing.JOptionPane;
//Javier
public class Clase7_1 {
   public static int pedirNumEnt(){
        int num1;
        String res=JOptionPane.showInputDialog("numero");
        num1=Integer.parseInt(res);
        return num1;
   }
   public static void comparar(int num1){
        if(num1>0)
            System.out.println(num1 + " e positivo");
        else 
            System.out.println(num1 + " e negativo");
            
           
    }
}
