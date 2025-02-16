package curso_java_classes;

public class MinhaPrimeiraClasseJava {
    
	public static void main(String[] args) {
		
		/*O new Aluno() Criacao de objetos (ou instanciar) */
		/* O aluno1 é uma referencia para o objeto*/
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Ronnie Willyams");
		aluno1.setIdade(100);
		aluno1.setDataNascimento("13/04/1984");
		aluno1.setNumeroCpf("666.444.33.00");
		aluno1.setNomeMae("Maria");
		aluno1.setNomePai("Erivaldo");
		aluno1.setDataMatricula("20/04/2024");
		aluno1.setNomeEscola("RWS_TEC");
		aluno1.setSerieMatriculado("10");
		
		System.out.println("Data de nascimento "+aluno1.getDataNascimento());
		
		

	}
}
