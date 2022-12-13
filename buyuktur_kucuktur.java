/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner G = new Scanner (System.in);
        int a  = G.nextInt();
        int f = G.nextInt();
        if (a>f){
            System.out.println(a+"buyuktur");
            
        }
        else if (f>a) {
            System.out.println(f+"buyuktur");
            
            
        }
        else { 
            System.out.println("eşitir");
        }
    }
    
}
