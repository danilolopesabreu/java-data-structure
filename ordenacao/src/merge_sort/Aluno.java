package merge_sort;

public class Aluno {
	private String nome;
	private int id;
	private double nota;

	public Aluno() {
	}

	public Aluno(String nome) {
		super();
		this.nome = nome;
	}

	public Aluno(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return nome + "  " + nota ;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
