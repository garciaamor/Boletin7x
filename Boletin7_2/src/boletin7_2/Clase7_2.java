package boletin7_2;
//Javier
import javax.swing.JOptionPane;

public class Clase7_2 {
    
    public static short pedirNumShort(){
    short num;
        String res=JOptionPane.showInputDialog("numero");
        num=Short.parseShort(res);
        return num;
}
    public static void comparar(short num1, short num2){
        if(num1>=num2)
            System.out.println(" la resta de los numeros es " + (num1-num2));
        else 
            System.out.println("la suma de los numeros es " + (num1 + num2));
            
    }
}

