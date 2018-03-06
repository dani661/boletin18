package boletin_18;

import java.util.ArrayList;
import boletin_18.Correo;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Buzon {

    static ArrayList<Correo> bandejaentrada = new ArrayList<>();

    public static String numeroCorreos() {
        int n = bandejaentrada.size();
        return "O numero de correos total é de: " + n;
    }

    public static String amosa(int i) {
        i=i-1;
        System.out.println("\nO correo " + (i+1) + " conten o seguinte texto: \n");
        System.out.println(bandejaentrada.get(i));

        if (bandejaentrada.get(i).getEstado() == false) {
            bandejaentrada.get(i).setEstado(true);
        } else if (bandejaentrada.get(i).getEstado() == true) {
            System.out.println("\nEste correo ya ha sido leido previamente");
        } else {
           
        }
return "";
    }

    public static void engade(Correo c) {

        bandejaentrada.add(c);
    }

    public static String porLer() {
        int conta = 0, n = 0;
        //Iterator it= bandejaentrada.iterator();
        while (n < bandejaentrada.size()) {
            if (bandejaentrada.get(n).getEstado() == false) {
                n++;
                conta++;
            } else {
                n++;
            }
        }
        return "O numero de correos por ler é de: " + conta;
    }
    public static String borrar(int i){
        i=i-1;
        bandejaentrada.remove(i);
        return "O correo borrouse";
    }

    public static void primerNoLido() {
        int i = 0;
        
        for(i=0;i<bandejaentrada.size();i++){
            
            if (bandejaentrada.get(i).getEstado() == false) {
                System.out.println(bandejaentrada.get(i).getContido());
                break;
            }
            else{
                
            }
        }
        
    }

}
