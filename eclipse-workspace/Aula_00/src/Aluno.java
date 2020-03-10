
public class Aluno {
	private String nome;
	private int id;
	
	public Aluno(String nome, int id) {
<<<<<<< HEAD
		this.nome = nome;
		this.id = id;
=======
		nome = nome;
		id = id;
>>>>>>> 596af409c5f48b8ea46b72345573b90af758035c
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public void setId(int id){
		this.id = id;
	}
}
