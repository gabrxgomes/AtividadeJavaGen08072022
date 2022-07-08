package Exercicio01;
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int number1, number2, number3, local;
		
		
		
		
		
	
		
		System.out.print("Digite o primeiro numero:   \n");
		number1 = leia.nextInt();
		
		System.out.print("Digite o segundo numero:    \n");
		number2 = leia.nextInt();
		
		System.out.print("Digite o terceiro numero:   \n");
		number3 = leia.nextInt();
		
		leia.close();
				
		local = number3;
	      if (number1 > local)
	    	  local = number1;
	      if (number2 > local)
	    	  local = number2;
	       System.out.printf("O numero maior : ", local);
		
	}

}
