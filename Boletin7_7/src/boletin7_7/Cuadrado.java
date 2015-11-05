//javier

package boletin7_7;

import javax.swing.JOptionPane;


public class Cuadrado {
    public static float PonerLado(){
        String res= JOptionPane.showInputDialog("Teclee lado cuadrado : ");
        float num= Float.parseFloat(res);
        return num;    
    }
    public static void CalcularArea(float num){
       float area=num*num;
       JOptionPane.showMessageDialog(null, "El area del cuadrado es " + area);
}
}
