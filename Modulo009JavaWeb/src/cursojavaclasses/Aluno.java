package cursojavaclasses;

public class Aluno {

	String nome;
	int idade;
	String Cpf;
	String RG;
	String NomeMae;
	String NomePai;
	String DataNascimento;
	double altura;

	public Aluno() { /* CRIA OS DADOS NA MEMORIA COM O JAVA - Sendo padrão */
		

	}
	/*TAMBEM USADO PARA RECEBER DADOS PRÉ DEFINIDOS*/
	public Aluno(String nomePadrão) {
		nome = nomePadrão;
	}
	
	public Aluno(String nomePadrão, int idadePadrão) {
		nome = nomePadrão;
		idade = idadePadrão;
		
	}
	
	
}
