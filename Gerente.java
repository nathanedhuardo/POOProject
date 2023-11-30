package POOProject;

public class Gerente extends Funcionario {
	private String departamento;
	
	public Gerente(String nome, double salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public double calcularBonus() {
		return getSalario() * 0.2; // Gerente vai receber 20% de bônus, por seu cargo ser "maior".
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Departamento" + departamento;
	}
}
