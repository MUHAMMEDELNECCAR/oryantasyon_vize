
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
//kg/boy*boy
public class Bki {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("boyunuzu girin: ");
        double boy=input.nextDouble();
        System.out.print("kilonuzu girin: ");
        double kilo=input.nextDouble();
        double sonuc=kilo/(boy*boy);
        if(sonuc>25){
            System.out.println("kilolu");}
        else{
            System.out.println("kilolu değil");}
        
        
        input.close();
    }
    
}
