package bankAccountDIO.app;

import java.util.Locale;
import java.util.Scanner;

import bankAccountDIO.entities.User;

public class Main {

	public static void main(String[] args){
		 String name;
		 int agency;
		 int number;
		 double balance;
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("*************** Bem vindo ao DIO bank ***************");
		 System.out.println();
		 System.out.println("Qual o numero da conta:   ");
		 number = sc.nextInt();
		 System.out.println("Qual o numero da agencia: ");
		 agency = sc.nextInt(); 
		
		 System.out.println("Qual o nome do cliente:   ");
		 sc.next();
		 name = sc.nextLine();	
		 System.out.println("Qual o saldo da conta:    ");
		 balance= sc.nextDouble();
		 
		 User user=  new User(name, agency, number, balance);
		 
		 
		 System.out.println("Olá "+user.getName()+ ", obrigado por criar uma conta em nosso banco, sua agência é "+ user.getAgency()+ ", conta "+user.getNumber()+" e seu saldo R$"+ user.getBalance()+" já está disponível para saque");
		 sc.close();
	}

}
