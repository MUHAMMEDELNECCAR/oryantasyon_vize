import java.util.Scanner;
// klavyeden girilen sayi 1 olana kadar girilen sayi çift ise 2 ye böl tek ise 3 ile çarp 1 ekle 2 ye böl 

public class Main {
	public static void main(String[] args) {
		System.out.println("Input the value of n: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;				
			}
			else {
				n = (3 * n + 1) / 2;				
			}
		}
		System.out.println("\nValue of n = "+n);
		in.close();
	}
}
