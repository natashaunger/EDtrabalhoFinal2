package sistema;

import java.util.Scanner;

import tadFila.FilaSequencial;
import tadFila.Paciente;
import tadLista.ListaEncadeada;

public class Principal {

	public static int menu() {

		Scanner lt = new Scanner(System.in);
		System.out.println("---------------------------------------");
		System.out.println("                 MENU                  ");
		System.out.println("---------------------------------------");
		System.out.println("1.CADASTRAR PACIENTE");
		System.out.println("2.PESQUISAR PACIENTE");
		System.out.println("3.NOVO ATENDIMENTO");
		System.out.println("4.TRIAGEM");
		System.out.println("5.CONSULTA");
		System.out.println("6.ALTA DO PACIENTE");
		System.out.println("7.RELATÓRIOS ADMINISTRATIVOS");
		System.out.println("8.SAIR");

		int op = lt.nextInt();
		while (op < 0 || op > 8) {
			System.out.println("Por favor, escolha uma opção válida.");
			op = lt.nextInt();
		}
		return op;

	}

	public static Paciente cadastro() {
		Scanner lt = new Scanner(System.in);
		System.out.println("---------------------------------------");
		System.out.println("    REGISTRO DE ENTRADA DE PACIENTES   ");
		System.out.println("---------------------------------------");

		Scanner lt1 = new Scanner(System.in);
		System.out.print("Digite o nome do paciente: ");
		String nomePaciente = lt1.next();

		System.out.print("Digite o cpf do paciente: ");
		String cpfPaciente = lt1.nextLine();
		lt1.next();
		System.out.print("Digite o ano de nascimento do paciente: ");
		int anoNascimento = lt1.nextInt();
		return new Paciente(nomePaciente, cpfPaciente, anoNascimento);
	}

	public static void main(String[] args) {

		System.out.println("===Bem vindo ao sistema de controle da emergência!===");
		System.out.println("Escolha uma das opções do menu:");
		Scanner lt2 = new Scanner(System.in);

		FilaSequencial atendimento = new FilaSequencial();
		FilaSequencial priori1 = new FilaSequencial();
		FilaSequencial priori2 = new FilaSequencial();
		FilaSequencial priori3 = new FilaSequencial();
		FilaSequencial priori4 = new FilaSequencial();
		FilaSequencial priori5 = new FilaSequencial();
		
		ListaEncadeada lisPacientes = new ListaEncadeada();
		ListaEncadeada atendEncerrados = new ListaEncadeada();

		while (true) {
			int op = menu();
			if (op == 8) {
				System.out.println("Acesso Finalizado");
				break;
			}

			switch (op) {
			
			case 1: // CADASTRO PACIENTE
				Paciente paciente1 = cadastro();
				lisPacientes.adicionarNoComeco(paciente1);
				lisPacientes.imprimeTodos();
				
				break;
				
//			case 2: // PESQUISAR PACIENTE
//				System.out.println("---------------------------------------");
//				System.out.println("            PESQUISAR PACIENTE         ");
//				System.out.println("---------------------------------------");
//				break;

			/* ou usar Paciente.pesquisarPaciente(); */

			case 3: // NOVO ATENDIMENTO

				Atendimento.iniciaNovoAtendimento();

				break;

//			case 4: // TRIAGEM
//				System.out.println("---------------------------------------");
//				System.out.println("         PROCESSO DE TRIAGEM           ");
//				System.out.println("---------------------------------------");
//
//				Scanner lt3 = new Scanner(System.in);
//				System.out.println("Paciente encontra-se entubado, apnéico, sem pulso e/ou sem reação?[S/N]");
//				char pri1 = lt3.next().toUpperCase().charAt(0);
//				while (pri1 != 'S' && pri1 != 'N') {
//					System.out.print("Informação incorreta. digite novamente: ");
//					pri1 = lt3.next().toUpperCase().charAt(0);
//				}
//				if (pri1 == 'S') {
//					priori1.enqueue(paciente1);
//				} else {
//					System.out.println("Paciente encontra-se em situação de alto risco/confuso" + "\n"
//							+ "/letárgico/desorientado/dor/sofrimento agudo [S/N]?");
//					char pri2 = lt3.next().toUpperCase().charAt(0);
//					while (pri2 != 'S' && pri2 != 'N') {
//						System.out.print("Informação incorreta. digite novamente: ");
//						pri2 = lt3.next().toUpperCase().charAt(0);
//					}
//					if (pri2 == 'S') {
//						priori2.enqueue(paciente1);
//					} else {
//
//						System.out.println("Quantas coisas são necessárias?"
//								+ " Raio X, testes laboratoriais, injeções, procedimentos, consulta?");
//						System.out.println("1.Nenhuma");
//						System.out.println("2.Uma");
//						System.out.println("3.Muitas");
//
//						int op = lt3.nextInt();
//						while (op < 0 || op > 3) {
//							System.out.print("Opção inexistente. Tente novamente: ");
//							op = lt3.nextInt();
//
//						}
//						switch (op) {
//						case 1:
//							System.out.println("Paciente com prioridade 5");
//							priori5.enqueue(paciente1); // ERROS
//							break;
//						case 2:
//							System.out.println("Paciente com prioridade 4");
//							priori4.enqueue(paciente1);
//
//							// System.out.println(priori4.size());
//							break;
//						// case 3:
//						// System.out.println("Nova triagem");
//						// if (p2.> 38) { // USAR GETTEMP
//						// priori2.enqueue(????????);
//						// } else {
//						// priori3.enqueue(?????????);
//						// }
//						}
//					}
//				}
			case 5: // CONSULTA
				System.out.println("---------------------------------------");
				System.out.println("                CONSULTA               ");
				System.out.println("---------------------------------------");
				break;

			case 6: // ALTA PACIENTE
				System.out.println("---------------------------------------");
				System.out.println("      REGISTRO DE ALTA DE PACIENTE     ");
				System.out.println("---------------------------------------");
				break;

			case 7: // RELATORIOS ADMINISTRATIVOS
				System.out.println("---------------------------------------");
				System.out.println("       RELATÓRIOS ADMINISTRATIVOS      ");
				System.out.println("---------------------------------------");
				break;

			case 8: // SAIR
				if (op == 8) {
					System.out.println("Acesso Finalizado");
					break;
				}
			}
		}

	}
}
