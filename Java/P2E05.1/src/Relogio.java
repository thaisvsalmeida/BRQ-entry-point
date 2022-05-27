public class Relogio {

	private int hora;
	private int minuto;
	private int segundo;
	
	public Relogio() {}
	
	public Relogio(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void adiantar(int seg) {
		int horario = (segundo + minuto * 60 + hora * 3600);
		horario = (horario + seg) % 86400;
		hora = (horario / 3600);
		minuto = ((horario % 3600) / 60);
		segundo = ((horario % 3600) % 60);
	}
		
	public void atrasar(int seg) {
		int horario = (segundo + minuto * 60 + hora * 3600) + 86400;
		horario = (horario - seg % 86400) % 86400;
		hora = (horario / 3600);
		minuto = ((horario % 3600) / 60);
		segundo = ((horario % 3600) % 60);
	}
	
	public void exibeHorario() {
		System.out.println(hora + ":" + minuto + ":" + segundo);
	}
}
