/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import javax.swing.JOptionPane;
/**
 *
 * @author Discente
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double flamengo,resultado;
        String flamingo;
        flamingo = JOptionPane.showInputDialog("Digite um resultado");
        flamengo = Double.parseDouble(flamingo);
        resultado = flamengo * flamengo * flamengo;
        JOptionPane.showMessageDialog(null,"o valor é"+ resultado);
        
    }
    
}
