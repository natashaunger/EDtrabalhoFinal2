package sistema;

import java.util.Scanner;

public class Principal {


	public static void sairAplica��o() {
		System.out.println("At� mais!!");
		System.exit(0);

	}

	public static void main(String[] args) {

		System.out.println("---------------------------------------");
		System.out.println("        REGISTRO DE PACIENTES         ");
		System.out.println("---------------------------------------");
		System.out.println("1.CADASTRAR PACIENTE");
		System.out.println("2.PESQUISAR PACIENTE");
		System.out.println("3.NOVO ATENDIMENTO");
		System.out.println("4.TRIAGEM");
		System.out.println("5.CONSULTA");
		System.out.println("6.ALTA DO PACIENTE");
		System.out.println("7.RELAT�RIOS ADMINISTRATIVOS");
		System.out.println("8.SAIR");

		
		Scanner l = new Scanner(System.in);
		int op = l.nextInt();

		switch (op) {

		case 1:
			Paciente.cadastroPaciente();
			break;
		case 2:
			Paciente.pesquisarPaciente();
			break;
		case 3:
			Atendimento.iniciaNovoAtendimento();
			break;
		case 4:
			Atendimento.chamaTriagem();
			break;
		case 5:
			Atendimento.consulta();
			break;
		case 6: 
			Paciente.altaPaciente();
			break;
		case 7:
			Atendimento.relatoriosAdm();
			break;
		case 8: 
			Principal.sairAplica��o();
			break;
		default:
			System.out.println("Op��o n�o identificada.");
		}
		l.close();
		
		

	}

}
