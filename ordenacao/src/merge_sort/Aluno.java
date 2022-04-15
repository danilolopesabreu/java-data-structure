package merge_sort;

public class Aluno {
	private String nome;
	private int id;

	public Aluno() {
	}

	public Aluno(String nome) {
		super();
		this.nome = nome;
	}

	public Aluno(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
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
		return "Aluno [nome=" + nome + ", id=" + id + "]";
	}

}
