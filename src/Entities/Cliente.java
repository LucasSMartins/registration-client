package Entities;

public class Cliente {
	
	public String name;
	public Double grossSalary;
	public Double tax;
	
	public Double netSalary() {
		return grossSalary -= tax;
	}
	public void increaseSalary(Double percentage){
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	
}
