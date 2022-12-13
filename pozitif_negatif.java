/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
      Scanner input = new Scanner(System.in);
      //this program to calculate rectangle area 
      
      int sayı_1 = input.nextInt();
      
      if(sayı_1<0){
          System.out.println("negatif");
          
      }
      else if (sayı_1>0){
          System.out.println("pozitif");
      }
      else {
          System.out.println("0");
      }
             
      
    }
}
