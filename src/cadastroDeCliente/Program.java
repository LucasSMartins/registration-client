package cadastroDeCliente;

import java.util.Locale;
import java.util.Scanner;

import Entities.Cliente;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Cliente cliente = new Cliente();
		System.out.println("Cadastro cliente");
		
		System.out.print("Name: ");
		cliente.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		cliente.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		cliente.tax = sc.nextDouble();
		cliente.netSalary();
		System.out.println();
		
		System.out.printf("Employee: "+ cliente.name +", R$ %.2f%n",cliente.grossSalary);
		System.out.println();
		
		System.out.print("which percentage to increase salary?");
		Double percentage = sc.nextDouble();
		cliente.increaseSalary(percentage);
		
		System.out.printf("Update date: "+ cliente.name +", R$ %.2f", cliente.grossSalary);
		
		
		sc.close();
	}
}
