package boletin7_3;

import javax.swing.JOptionPane;

public class Clase7_3 {
    public static float pedirNumFloat(){
        float num1;
        String res=JOptionPane.showInputDialog("numero");
        num1=Float.parseFloat(res);
        return num1;
   }
   public static void comparar(float num1){
        if(num1>0)
            System.out.println("Positivo");
        else if (num1==0)
            System.out.println(" 0 ");
            else 
                    System.out.println("Negativo");
           
    }
}
