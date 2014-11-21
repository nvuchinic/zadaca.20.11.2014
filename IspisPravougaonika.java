import java.util.Scanner;


public class IspisPravougaonika {
public static void main(String[] args) {
	int d,s;
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesite duzinu i sirinu pravougla:");
	d=unos.nextInt();
	s=unos.nextInt();
	unos.close();
	for(int i=1;i<=s;i++) {
		if((i==1)||(i==s)) {
			for(int j=1;j<=d;j++) {
				System.out.print("*"); }
			}
		else {
			System.out.print("*");
			for(int k=1;k<=d-2;k++)
			System.out.print(" ");
			System.out.print("*");
		}
		System.out.println();
		}
}
}