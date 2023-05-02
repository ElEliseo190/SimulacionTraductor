package EliseoSH_JulioCesar;

import javax.swing.*;
import java.util.Scanner;

public class SimuladorTraductor {
    public static void main(String[] args) {
        String[] Lang_es_ES = {"Hola","Dia","Rojo","Morado","Azul","Verde","Amarillo","Gris","Numero","Ventana","Puerta","Pollo","Vaca","Leche","Me Gusta"};
        String[] Lang_en_EN = {"Hello","Day","Red","Pourple","Blue","Green","Yellow","Gray","Nummer","Windows","Dor","Chicken","Cow","Mik","I Like"};

        Scanner en = new Scanner(System.in);

        String TraductorP = JOptionPane.showInputDialog("Ingresa texto en (es_ES)","TRADUCION DE ESPAÑOL");

        for(int i = 0; i<15; i++){
            if (TraductorP.equalsIgnoreCase(Lang_es_ES[i])){
                JOptionPane.showMessageDialog(null,Lang_en_EN[i],"TRADUCCION A EPAÑOL", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
