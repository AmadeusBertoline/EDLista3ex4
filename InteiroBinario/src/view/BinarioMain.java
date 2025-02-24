package view;

import controller.BinarioController;
import java.util.Scanner;

public class BinarioMain {

	public static void main(String[] args) {
		
		BinarioController binario = new BinarioController();
		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um valor para conversão para binário: ");
		num = scanner.nextInt();
		
        if (num > 2000) {
            System.out.println("Número excede o limite permitido de 2000.");
        } else {
            System.out.println("Representação binária: " + binario.Binario(num));
        }

	}

}
