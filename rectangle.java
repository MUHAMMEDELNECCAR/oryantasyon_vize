/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
            
    int length, width , area;
    System.out.println("Enter rectangle length");
    length = input.nextInt();
   
    System.out.println ("Enter rectangle width");
      width = input.nextInt();
      area = length * width ; 
      System.out.println (area); 
      System.out.printf("The Rectangle area is %d",area);
    }
    
}
