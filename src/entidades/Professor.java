package entidades;

public class Professor {
	
	private String nome;
	private String disciplina;
	private double valorAula;
	private int totalHoras;
	
	
	public Professor(String nome, String disciplina, double valorAula, int totalHoras) {
		this.nome = nome;
		this.disciplina = disciplina;
		this.valorAula = valorAula;
		this.totalHoras = totalHoras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getValorAula() {
		return valorAula;
	}

	public void setValorAula(double valorAula) {
		this.valorAula = valorAula;
	}

	public int getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}
	
	public double calcularTotal() {
		return totalHoras * valorAula;
	}
	
	public String toString() {
		return "Professor: " + nome + " - Total de horas: " + totalHoras + " Pagamento: " + calcularTotal();
	}
	

}
