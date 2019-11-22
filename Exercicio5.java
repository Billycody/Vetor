import java.util.Scanner;
public class v5 {
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	
	int a[] = new int [10];
	int i, n;
	
	for(i=0; i<10; i++) {
		System.out.println("Informe o numero");
		a[i] = leia.nextInt();
		
		for(n=1; n<=a[i]; n++) {
			if(a[i]%n == 0) {
				System.out.println(n);
			}
		}	
	}
		


	}

}
