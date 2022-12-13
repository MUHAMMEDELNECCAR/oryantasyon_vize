/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// Faktöriyel Çözümü
package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        //sayi girişi 
        System.out.print("lutfen bir sayi girin: ");
        int sayi=input.nextInt();
        int sayac=1;
        // sayiya kadar döngü
        for(int i=1;i<=sayi;i++){
        sayac=sayac*i;
                
        }
        System.out.println(sayac);
    }
    
}
