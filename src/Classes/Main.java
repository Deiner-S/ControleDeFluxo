package Classes;
/**
 * @author Deiner.Rodrigues
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String entrada = "sim";
		String outro = " seu ";
		System.out.println("Ola! bem vindo ao sistema de verificação de notas!");
		
		while(entrada.equalsIgnoreCase("sim")) {
			System.out.println("Gostaria de verificar se"+outro+"aluno foi aprovado, reprovado ou se está de recuperação? Sim ou não? ");
			entrada = scan.next();
			if(entrada.equalsIgnoreCase("sim")) {
				situacaoAcademica();
				outro = " outro ";
			}else if(entrada.equalsIgnoreCase("não") || entrada.equalsIgnoreCase("nao") ) {
				System.out.println("Obrigado! Caso precise verificar alguma nota e só me chamar!");
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
		
		Float media = 0.0f;
		
		Float nota = 0.0f;
		
		for(int i = 1;i<=4;i++) {
			
			System.out.println("insira o valor da "+i+"ª"+" nota\n");
			nota = scan.nextFloat();
			
			media += nota;
			if(i == 4) {
				media /= i;
			}
			
		}
		
		
		if(media>=7){				
			System.out.print("Aluno aprovádo!\nMedia:"+ media+"\n\n");
				
		}else if(media>=5 && media<7) {				 
			System.out.print("Aluno Recuperacao\nMedia:"+ media+"\n\n");
				
		}else {
				System.out.print("Aluno Reprovado\nMedia:"+ media+"\n\n");
		}
		
		
	
	}
	
}
