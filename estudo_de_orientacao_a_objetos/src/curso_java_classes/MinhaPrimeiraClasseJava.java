package curso_java_classes;

public class MinhaPrimeiraClasseJava {
    
	public static void main(String[] args) {
		
		/*O new Aluno() Criacao de objetos (ou instanciar) */
		/* O aluno1 é uma referencia para o objeto*/
		Aluno aluno1 = new Aluno();//Aqui será o Renata
		aluno1.nome = "Ronnie";
		System.out.println("O nome do aluno é "+aluno1.nome);
		
		Aluno aluno2 = new Aluno();//Aqui será a Mary
	}
}
