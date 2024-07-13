package Classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String entrada = "sim";
		String novamente = "";
		System.out.println("Ola! bem vindo ao sistema de verificação de notas!");
		
		while(entrada.equalsIgnoreCase("sim")) {
			System.out.println("Gostaria de verificar"+novamente+"se seus alunos foram aprovados sim ou não?");
			entrada = scan.next();
			if(entrada.equalsIgnoreCase("sim")) {
				situacaoAcademica();
				novamente = " novamente ";
			}else if(entrada.equalsIgnoreCase("não") || entrada.equalsIgnoreCase("nao") ) {
				System.out.println("Obrigado! Caso precise verificar suas notas e só me chamar!");
				break;
			}else {
				System.out.println("Não entendi! Foi digitado algo diferente de sim e não\n");
				entrada = "sim";
				continue;
			}
			
		}

	}

	
	public static void situacaoAcademica() {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		for(int i = 1;i<=4;i++) {
			
			System.out.println("insira o valor da "+i+"ª"+" nota");
			Long nota = scan.nextLong();
			
			if(nota>=7){				
				System.out.print("Aluno aprovádo!\n\n");
				
			}else if(nota>=5 && nota<7) {				 
				System.out.print("Aluno Recuperacao\n\n");
				
			}else {
				System.out.print("Aluno Reprovado\n\n");
			}
			
			
		}
		
		
	
	}
	
}
