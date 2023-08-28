package javabasico;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String []args) {
		 Scanner scan = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		Float saldo;
		System.out.println("Digite seu nome : ");
		nomeCliente = scan.nextLine();
		System.out.println("Digite o numero da agencia : ");
		agencia = scan.nextLine();
		System.out.println("Digie o numero da conta : ");
		numero = scan.nextInt();
		System.out.println("Digite o seu saldo : ");
		saldo = scan.nextFloat();
		System.out.printf("Bem vindo %s ,Obrigado por criar sua conta ! seus dados são "
				+ ":  \n Agencia : %s \n Numero da conta : %d \n saldo : %.2f",nomeCliente,agencia,numero,saldo );
		scan.close();
	}
}
