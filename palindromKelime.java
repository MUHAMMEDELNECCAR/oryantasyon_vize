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
        System.out.println("Adini gir: ");
        String isim=giris.nextLine();
        String tersi="";
        int i=isim.length()-1;
        
        while(i>=0){
        tersi+=isim.charAt(i);
        i--;
        }
        System.out.println("isminiz: " + isim);
        System.out.println("Tersi: "+ tersi);
        if(isim.equals(tersi)){
            System.out.println("isim ile tersi aynı");
        }
      giris.close();
    }
    
}
