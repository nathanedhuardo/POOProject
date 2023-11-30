package POOProject;

public class Desenvolvedor extends Funcionario {
	private String linguagem;
	
	public Desenvolvedor(String nome, double salario, String linguagem) {
		super(nome, salario);
		this.linguagem = linguagem;
	}
	
	public String getLinguagem() {
		return linguagem;
	}
	
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	@Override
	public double calcularBonus() {
		return getSalario() * 0.1; // Os Desenvolvedores vão receber 10% de bônus.
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Linguagem: " + linguagem; 
	}
}
