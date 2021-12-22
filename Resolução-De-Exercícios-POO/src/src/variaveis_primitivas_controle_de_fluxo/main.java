package src.variaveis_primitivas_controle_de_fluxo;

public class main {
public static void main(String[] args) {
		
		/*1.Imprima todos os números de 150	a 300*/
		
		for(int i = 150; i <= 300; i++) {
			System.out.println(i);
		}
		
		
		/*2.	 Imprima	a	soma	de	1	até	1000.*/
		
		int soma = 0;
		for(int i =1; i <= 1000;i++) {
			soma += i;
		}
		System.out.println("A soma de 1 ate 1000 é: "+ soma);
		
		
		/*3.	 Imprima	todos	os	múltiplos	de	3,	entre	1	e	100.*/
		
		int cont = 0;
		for(int i = 1; i<=100; i++) {
			if(i%3==0) {
				cont+=1;
			}
		}
		System.out.println("Entre 1 e 100 há: "+cont+" Multiplos de 3");	
		
		/*4.	 Imprima	os	fatoriais	de	1	a	10.*/
		
		for(int i = 1;i<=10;i++) {
			int fatorial = 1;
			for(int j = 1;j<=i;j++) {
				fatorial = (fatorial * j);
			}
			System.out.println("Fatorial de "+i+" = "+fatorial);
		}
		
		/*5.	 No	código	do	exercício	anterior,	aumente	a	quantidade	de	números	que	terão	os	fatoriais	impressos
		até	20,	30	e	40.	Em	um	determinado	momento,	além	de	esse	cálculo	demorar,	começará	a	mostrar
		respostas	completamente	erradas.	Por	quê?*/
		
		for(int i = 1;i<=40;i++) {
			long fatorial = 1;
			for(int j = 1;j<=i;j++) {
				fatorial = (fatorial * j);
			}
			System.out.println("Fatorial de "+i+" = "+fatorial);
		}
		
		/*6.	 (Opcional)	 Imprima	 os	 primeiros	 números	 da	 série	 de	 Fibonacci	 até	 passar	 de	 100.	 A	 série	 de
		Fibonacci	é	a	seguinte:	0,	1,	1,	2,	3,	5,	8,	13,	21,	etc.	Para	calculá-la,	o	primeiro	elemento	vale	0,	o
		segundo	vale	1,	e	daí	por	diante.	O	n-ésimo	elemento	vale	o	(n-1)-ésimo	elemento	somado	ao	(n-2)-
		ésimo	elemento	(ex:	8	=	5	+	3).*/
		
		int termo1 = 0;
		int termo2 = 1;
		int termo3 = termo1 + termo2;
		
		System.out.print(termo1+" ");
		System.out.print(termo2+" ");
		for(int i = 1; i<=100;i++) {
			System.out.print(termo3+" ");
			
			termo1 = termo2;
			termo2 = termo3;
			
			termo3 = termo1+termo2;
			
		}
			
		
		
	}
		
}
