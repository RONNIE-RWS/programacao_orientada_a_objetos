package curso_java_classes;

public class Aluno {
    
	/*Aqui temos os atributos do aluno*/
	public String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	public Aluno() {/*Cria os dados na memória - Sendo padrão Java*/
		
	}
	
	public Aluno(String nomePadrao) {
		
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	
}
