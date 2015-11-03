package boletin7_4;

public class Boletin7_4 {

    
    public static void main(String[] args) {
        Clase7_4 obx=new Clase7_4();
        String nome1, nome2;
        float peso1, peso2;
        
       nome1=obx.pedirNome();
       peso1=obx.pedirPeso();
       nome2=obx.pedirNome();
       peso2=obx.pedirPeso();
       
       Clase7_4.comparar(nome1, nome2, peso1, peso2);
    }
    
}
