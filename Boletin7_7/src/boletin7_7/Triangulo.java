

package boletin7_7;

import javax.swing.JOptionPane;


public class Triangulo {
    float base;
    float altura;
    
    public static float PonerBase(){
        String res= JOptionPane.showInputDialog("Escribe la base del triangulo : ");
        float base= Float.parseFloat(res);
        return base;
    }
    
    public static float PonerAltura(){
        String res= JOptionPane.showInputDialog("Escribe la altura del triangulo : ");
        float altura= Float.parseFloat(res);
        return altura;
    }
    
    public static void CalcularArea(float base, float altura){        
        JOptionPane.showMessageDialog(null,": "+(base*altura/2));
    }
}
