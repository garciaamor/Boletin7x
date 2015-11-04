package boletin.pkg7_5;
//Javier
import javax.swing.JOptionPane;

public class Clase7_5 {
    float num;

    public static float pedirNumFloat(){
        String res=JOptionPane.showInputDialog("numero");
        float num=Float.parseFloat(res);
        return num;
                  
   }        
   public static void CompararNums(float num1, float num2, float num3){
        if(num1>num2&&num1>num3)
            System.out.println("El mayor es " + num1);
        else if (num2>num1&&num2>num3)
            System.out.println("El mayor es " + num2);
            else 
                    System.out.println("El mayor es " + num3);
}
}
