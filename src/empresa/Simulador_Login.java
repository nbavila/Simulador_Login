package empresa;

import java.util.Scanner;

public class Simulador_Login {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome de usuario: ");
		String nome = teclado.next();
		
		System.out.println("Digite sua senha: ");
		int senha = teclado.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Incorreta! Tente Novamente: ");
				senha = teclado.nextInt();
		}
		System.out.println("Seja bem vindo, Sr."+ nome);
	}

}
