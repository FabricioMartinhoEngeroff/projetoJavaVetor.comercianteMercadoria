package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US);
		Scanner sc = new  Scanner (System.in);
		
		int n, lucroAcima , lucroEntre , lucroAbaixo ;
		double valorTotalCompra, valorTotalVenda, lucrototal;
		
		System.out.print("Serao digitados dados de quantos produtos?");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		double[] pCompras = new double[n];
		double[] pVendas = new double[n];
		double[] porcentagemLucro = new double[n];
		
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados dos %da produtos: \n", i + 1);
			System.out.print("Nome do produto: ");
			nomes[i] = sc.next();
			System.out.print("Preco da compra: ");
			pCompras[i] = sc.nextDouble();
			System.out.print("preco da venda: ");
			pVendas[i] = sc.nextDouble();
		}	
		
		 for (int i=0; i<n; i++) {
		        porcentagemLucro[i] = (pVendas[i] - pCompras[i]) / pCompras[i] * 100.0;
		    }
		 
		 lucroAbaixo = 0;
		 lucroEntre = 0;
		 lucroAcima = 0;
		 
		 for (int i=0; i<n; i++) {
		        if (porcentagemLucro[i] < 10.0) {
		        	lucroAbaixo++;
		        }
	        else if (porcentagemLucro[i] < 20.0) {
	        	lucroEntre++;
	        }
	        	 else {
	 	            lucroAcima++;
	 	        }
		        
		    valorTotalCompra = 0;
			valorTotalVenda = 0;
			
			for (int i1=0; i1<n; i1++) {
		        valorTotalCompra = valorTotalCompra + pCompras[i1];
		        valorTotalVenda = valorTotalVenda + pVendas[i1];
		    }

		    lucrototal = valorTotalVenda - valorTotalCompra;
		    
		    System.out.println("\nRELATORIO:");
		    System.out.printf("Lucro abaixo de 10%%: %d\n", lucroAbaixo);
		    System.out.printf("Lucro entre 10%% e 20%%: %d\n", lucroEntre);
		    System.out.printf("Lucro acima de 20%%: %d\n",  lucroAcima);
		    System.out.printf("Valor total de compra: %.2f\n", valorTotalCompra);
		    System.out.printf("Valor total de venda: %.2f\n", valorTotalVenda);
		    System.out.printf("Lucro total: %.2f\n", lucrototal);
	 	  
		 }
		 
		sc.close();

	}

}
