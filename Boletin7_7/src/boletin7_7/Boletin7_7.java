//Javier
package boletin7_7;

import javax.swing.JOptionPane;

public class Boletin7_7 {

    
    public static void main(String[] args) {
     
    String res=JOptionPane.showInputDialog("Elige la forma geometrica de la que quieras saber el area \n 1. Cuadrado \n 2.Circulo \n 3.Triangulo");
    int dia= Integer.parseInt(res);
        switch (dia){
            case 1:
                float num=Cuadrado.PonerLado();
                Cuadrado.CalcularArea(num);
                break;
            case 2:
                float rad=Circulo.PonerRadio();
                Circulo.CalcularArea(rad);
                break;
            case 3:
                float base=Triangulo.PonerBase();
                float altura=Triangulo.PonerAltura();
                Triangulo.CalcularArea(base, altura);
                break;
                default:JOptionPane.showMessageDialog(null, "Teclea opcion entre 1 y 3 ");
    }
    }
}
