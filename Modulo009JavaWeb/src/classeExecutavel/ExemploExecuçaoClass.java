package classeExecutavel;

import cursojavaclasses.Aluno;

public class ExemploExecuçaoClass {
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Vitim");
		aluno1.setIdade(18);
		aluno1.setCpf("09973747482");
		aluno1.setRG("43443");
		aluno1.setNomeMae("ZUMIRA");

		System.out.println("O nome do aluno é :" + aluno1.getNome());
		System.out.println("a idade do aluno é :" + aluno1.getIdade());
		System.out.println("O CPF do aluno é :" + aluno1.getCpf());
		System.out.println("O RG do aluno é :" + aluno1.getRG());
		System.out.println("O Nome da mãe desse aluno é :" + aluno1.getNomeMae());

	}
}