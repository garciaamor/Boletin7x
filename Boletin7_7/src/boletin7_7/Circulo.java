
package boletin7_7;

import javax.swing.JOptionPane;


public class Circulo {
    static final float PI=3.14159f;
    float rad;
    
    public static float PonerRadio(){
        String res= JOptionPane.showInputDialog("Teclee radio del circulo : ");
        float rad= Float.parseFloat(res);
        return rad;    
    }
    public static void CalcularArea(float rad){
       
       float area=(float) Math.pow(rad, 2);
       JOptionPane.showMessageDialog(null, "El area del triangulo es " + PI * area);
}
}
