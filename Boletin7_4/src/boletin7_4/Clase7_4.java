package boletin7_4;
//Javier
import javax.swing.JOptionPane;
public class Clase7_4 {
    
    public String pedirNome(){
    String nome = null;
        String res=JOptionPane.showInputDialog("nome persoa ");
        return res;
           
    }
    public float pedirPeso(){
    float peso;
        String aux=JOptionPane.showInputDialog("peso persoa ");
        peso=Float.parseFloat(aux);
        return peso;
    }
    public static void comparar(String nome1, String nome2, float peso1, float peso2){
        if(peso1>peso2)
            System.out.println(nome1 +" pesa " + peso1 + " kg, "+(peso1-peso2)+ " kilos mas que "+ nome2);
        else if(peso2>peso1)
                System.out.println(nome2 +" pesa "+ peso2 + " kg, "+(peso2-peso1)+ " kilos mas que "+ nome1);
            else
                System.out.println(nome1 + " y "+ nome2 + " pesan lo mismo, "+ peso2);
}
}