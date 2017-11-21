package sistema;

import java.util.Scanner;

public class Atendimento extends Paciente {

	private Paciente pessoa;
	private int horaChegada, minutoChegada;
	private int horaAtendimento, minutoAtendimento;
	private int horaSaida, minutoSaida;
	private double temperatura, peso, altura;
	private int pressaoSistolica, pressaoDiastolica;
	private int prioridade;
	private String parecer;

	public Atendimento() {

		super();
		this.pessoa = pessoa;
		this.horaChegada = horaChegada;
		this.minutoChegada = minutoChegada;
		this.horaAtendimento = horaAtendimento;
		this.minutoAtendimento = minutoAtendimento;
		this.horaSaida = horaSaida;
		this.minutoSaida = minutoSaida;
		this.temperatura = temperatura;
		this.peso = peso;
		this.altura = altura;
		this.pressaoSistolica = pressaoSistolica;
		this.pressaoDiastolica = pressaoDiastolica;
		this.prioridade = prioridade;
		this.parecer = parecer;
		
	}

	public static  void iniciaNovoAtendimento() {
		System.out.println("---------------------------------------");
		System.out.println("           NOVO ATENDIMENTO            ");
		System.out.println("---------------------------------------");

		//eu mudei isso para commitar
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite a hora e o minuto de atendimento do paciente: ");
		int horaAtendimento = leitura.nextInt();
		int minutoAtendimento = leitura.nextInt();

		System.out.println("Digite a hora e o minuto de saída do paciente: ");
		int horaSaida = leitura.nextInt();
		int minutoSaida = leitura.nextInt();
		
	}

	public static void chamaTriagem() {
		System.out.println("---------------------------------------");
		System.out.println("         PROCESSO DE TRIAGEM           ");
		System.out.println("---------------------------------------");

	}

	public static void consulta() {
		System.out.println("---------------------------------------");
		System.out.println("                CONSULTA               ");
		System.out.println("---------------------------------------");

	}

	public static void relatoriosAdm() {
		System.out.println("---------------------------------------");
		System.out.println("       RELATÓRIOS ADMINISTRATIVOS      ");
		System.out.println("---------------------------------------");

	}

}
