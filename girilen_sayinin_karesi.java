/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class JavaApplication1 {
    // 1 ile 100 arasindaki tek sayiları bulma

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner giris=new Scanner(System.in);
        System.out.println("Sayi gir: ");
        int sayi1=giris.nextInt();
        System.out.println("Karesi: " + sayi1*sayi1);
      giris.close();
    }
    
}
