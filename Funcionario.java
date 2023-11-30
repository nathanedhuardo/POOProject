package POOProject;
import java.io.*;

abstract class Funcionario implements Serializable {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
			this.nome = nome;
			this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// Método que vai calcular o bônus
	
	public abstract double calcularBonus();
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", Salário: " + salario;
	}
}
