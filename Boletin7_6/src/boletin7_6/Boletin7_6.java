//Javier

package boletin7_6;


public class Boletin7_6 {
        
    
    public static void main(String[] args) {
        Clase7_6 obx=new Clase7_6();
        String art; 
        art=obx.PonerArticulo();
        float num= Clase7_6.PonerVentas();
        Clase7_6.CompararVentas(num, art); 
    
    } 
}
