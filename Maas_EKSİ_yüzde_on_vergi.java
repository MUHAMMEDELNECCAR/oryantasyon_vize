/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        // TODO code application logic here
       String fname=""; 
       float salary; 
       float net_salary;
        System.out.println("Enter your first name");
        fname = input.next(); 
        
        System.out.println("Enter your salary");
        salary = input.nextFloat();
        net_salary = salary - (salary * 0.10f);
        
        System.out.print (net_salary);
       
        
    }
    
}
