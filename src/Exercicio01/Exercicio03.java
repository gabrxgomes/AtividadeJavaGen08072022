package Exercicio01;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com sua idade: ");
		int idade = leia.nextInt();
		
		
		
		
	
		
		leia.close();
		
		
	
		if (idade <=10)
	    {
			System.out.printf("Você se enquadra na faixa de idade Infantil " );
	    }
			else if (idade >=15 && idade <= 17)
			{
				System.out.printf("Você se enquadra na faixa de idade Juvenil " );
			}
			else if (idade >=18 && idade <= 25)
			{
				System.out.printf("Você se enquadra na faixa de idade Adulto " );
			}
	

	}

}
