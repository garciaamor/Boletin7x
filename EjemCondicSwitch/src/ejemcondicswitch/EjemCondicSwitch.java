package ejemcondicswitch;

import javax.swing.JOptionPane;

public class EjemCondicSwitch {

    public static void main(String[] args) {
        String res=JOptionPane.showInputDialog("Dia en numero ");
        int dia= Integer.parseInt(res);
        switch (dia){
            case 1:JOptionPane.showMessageDialog(null, "Lunes");
                break;
            case 2:JOptionPane.showMessageDialog(null, "Martes");   
                break;
            case 3:JOptionPane.showMessageDialog(null, "Miercoles");
                break;
            case 4:JOptionPane.showMessageDialog(null, "Jueves");  
                break;
            case 5:JOptionPane.showMessageDialog(null, "Viernes");  
                break;
            case 6:JOptionPane.showMessageDialog(null, "Sabado");    
                break;
            case 7:JOptionPane.showMessageDialog(null, "Domingo");   
                break;
                default:JOptionPane.showMessageDialog(null, "Teclea opcion entre 1 y 7 ");
        }
        JOptionPane.showMessageDialog(null, "Hola a todos, amigos de youtube ");
       
    }
    
}
