/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciamartinez
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long tI,tF;
        T tiempo = new T();
        tI=tiempo.keepT();
        String fras;
        fras = JOptionPane.showInputDialog("ESCRIBE A SEGUINTE FRASE : A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática .");
        JOptionPane.showMessageDialog(null," PREME ENTER PARA REMATAR ");
        T t2 = new T();
        tF=t2.keepT();
        tiempo.CalcT(tI, tF);

    }
    
}
