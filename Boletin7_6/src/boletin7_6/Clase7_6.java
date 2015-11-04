//Javier

package boletin7_6;

import javax.swing.JOptionPane;


public class Clase7_6 {
    public String PonerArticulo(){
        String art=null;
        String res= JOptionPane.showInputDialog("Escriba nombre del articulo : ");
        return res;    
    }  
    public static float PonerVentas(){
        String res= JOptionPane.showInputDialog("Teclee ventas anuales : ");
        float num= Float.parseFloat(res);
        return num;    
    }
    public static void CompararVentas(float num, String art){
        if(num<=100)
            System.out.println(art + " Es un articulo de consumo bajo ");
        else if (num>100&&num<=500)
            System.out.println(art + " Es un articulo de consumo medio");
        else if (num>500&&num<=1000)
            System.out.println(art + " Es un articulo de consumo alto");
            else 
                    System.out.println(art + " Es un articulo de primera necesidad");
}
}
