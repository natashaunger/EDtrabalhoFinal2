package sistema;

import java.util.Scanner;

import tadFila.Paciente;

public class Atendimento  {

	private Paciente pessoa;
	private int horaChegada, minutoChegada;
	private int horaAtendimento, minutoAtendimento;
	private int horaSaida, minutoSaida;
	private double temperatura, peso, altura;
	private int pressaoSistolica, pressaoDiastolica;
	private int prioridade;
	private String parecer;

	
	public Paciente getPessoa() {
		return pessoa;
	}

	public void setPessoa(Paciente pessoa) {
		this.pessoa = pessoa;
	}

	public int getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(int horaChegada) {
		this.horaChegada = horaChegada;
	}

	public int getMinutoChegada() {
		return minutoChegada;
	}

	public void setMinutoChegada(int minutoChegada) {
		this.minutoChegada = minutoChegada;
	}

	public int getHoraAtendimento() {
		return horaAtendimento;
	}

	public void setHoraAtendimento(int horaAtendimento) {
		this.horaAtendimento = horaAtendimento;
	}

	public int getMinutoAtendimento() {
		return minutoAtendimento;
	}

	public void setMinutoAtendimento(int minutoAtendimento) {
		this.minutoAtendimento = minutoAtendimento;
	}

	public int getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}

	public int getMinutoSaida() {
		return minutoSaida;
	}

	public void setMinutoSaida(int minutoSaida) {
		this.minutoSaida = minutoSaida;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPressaoSistolica() {
		return pressaoSistolica;
	}

	public void setPressaoSistolica(int pressaoSistolica) {
		this.pressaoSistolica = pressaoSistolica;
	}

	public int getPressaoDiastolica() {
		return pressaoDiastolica;
	}

	public void setPressaoDiastolica(int pressaoDiastolica) {
		this.pressaoDiastolica = pressaoDiastolica;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public String getParecer() {
		return parecer;
	}

	public void setParecer(String parecer) {
		this.parecer = parecer;
	}

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

		Scanner l1= new Scanner(System.in);
		System.out.print("Digite a temperatura do paciente: ");
		double temperatura = l1.nextInt();

		System.out.print("Digite a pressão sistólica do paciente: ");
		double pressaoSistolica = l1.nextInt();

		System.out.print("Digite a pressão diastólica do paciente: ");
		double pressaoDiastolica = l1.nextInt();

		System.out.print("Digite a hora e o minuto de chegada do paciente: ");
		int horaChegada = l1.nextInt();
		int minutoChegada = l1.nextInt();
	
		System.out.println("Digite a hora e o minuto de atendimento do paciente: ");
		int horaAtendimento = l1.nextInt();
		int minutoAtendimento = l1.nextInt();

		System.out.println("Digite a hora e o minuto de saída do paciente: ");
		int horaSaida = l1.nextInt();
		int minutoSaida = l1.nextInt();
		
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
