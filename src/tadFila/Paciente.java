
package tadFila;

//import java.util.Scanner;

public class Paciente {

	private String nomePaciente;
	private String cpfPaciente;
	private int anoNascimento;
	

	public Paciente(String nomePaciente,String cpfPaciente,int anoNascimento) {

		this.nomePaciente = nomePaciente;
		this.cpfPaciente = cpfPaciente;
		this.anoNascimento = anoNascimento;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getCpfPaciente() {
		return cpfPaciente;
	}

	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public String toString() {
		return "[Nome: " + nomePaciente 
				+ "\n CPF do paciente:" + cpfPaciente 
						+ "\n Ano de nascimento do paciente: "+anoNascimento+"]";


//	public static void cadastroPaciente() {
//
//		System.out.println("---------------------------------------");
//		System.out.println("    REGISTRO DE ENTRADA DE PACIENTES   ");
//		System.out.println("---------------------------------------");
//
//		Scanner leitura = new Scanner(System.in);
//
//		System.out.print("Digite o nome do paciente: ");
//		String nomePaciente = leitura.nextLine();
//
//		System.out.print("Digite o cpf do paciente: ");
//		String cpfPaciente = leitura.nextLine();
//
//		System.out.print("Digite o ano de nascimento do paciente: ");
//		int anoNascimento = leitura.nextInt();
//
//		System.out.print("Digite a temperatura do paciente: ");
//		double temperatura = leitura.nextInt();
//
//		System.out.print("Digite a pressão sistólica do paciente: ");
//		double pressaoSistolica = leitura.nextInt();
//
//		System.out.print("Digite a pressão diastólica do paciente: ");
//		double pressaoDiastolica = leitura.nextInt();
//
//		System.out.print("Digite a hora e o minuto de chegada do paciente: ");
//		int horaChegada = leitura.nextInt();
//		int minutoChegada = leitura.nextInt();
//
//		leitura.close();
//
//	}

//	public static void altaPaciente() {
//		System.out.println("---------------------------------------");
//		System.out.println("      REGISTRO DE ALTA DE PACIENTE     ");
//		System.out.println("---------------------------------------");
//
//	}
//
//	public static void pesquisarPaciente() {
//		System.out.println("---------------------------------------");
//		System.out.println("            PESQUISAR PACIENTE         ");
//		System.out.println("---------------------------------------");
//
//	}

}
}
