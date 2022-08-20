package aplicativo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {

		Set<Integer> duplicadas = new HashSet<>();
		
		Random sorteio = new Random();
		
		
		List <Integer> numeros = new ArrayList<>();
		
		
		for (int i=0;i<10;i++) {
			numeros.add(i, sorteio.nextInt(100));
		}
		
		System.out.println("N�meros sorteados: ");

		for (Integer n: numeros) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		
		System.out.println("Os n�meros duplicados s�o: ");
		
		for (Integer n: numeros) {
			if (duplicadas.add(n)== false) {
				System.out.print(n+" ");
			}
		}
	}

}
