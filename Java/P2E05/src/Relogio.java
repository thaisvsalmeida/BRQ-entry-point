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
		if (seg >= 3600) {
			hora = hora + seg / 3600;
			if (hora >= 24) {
				hora = hora - 24;
			}
			int resto = seg % 3600;
			minuto = minuto + resto / 60;
			if (minuto >= 60) {
				minuto = minuto - 60;
				hora++;
				if (hora >= 24) {
					hora = hora - 24;
				}
			}
			resto = resto % 60;
			segundo = segundo + resto;
			if (segundo >= 60) {
				segundo = segundo - 60;
				minuto++;
				if (minuto >= 60) {
					minuto = minuto - 60;
					hora++;
					if (hora >= 24) {
						hora = hora - 24;
					}
				}
			}
		} else if (seg >= 60) {
			minuto = minuto + seg / 60;
			if (minuto >= 60) {
				minuto = minuto - 60;
				hora++;
				if (hora >= 24) {
					hora = hora - 24;
				}
			}
			int resto = seg % 60;
			segundo = segundo + resto;
			if(segundo >= 60) {
				segundo = segundo - 60;
				minuto++;
				if (minuto >= 60) {
					minuto = minuto - 60;
					hora++;
					if (hora >= 24) {
						hora = hora - 24;
					}
				}
			}
		}
	}
		
	public void atrasar(int seg) {
		if(seg >= 3600) {
			hora = hora - (seg / 3600);
			if (hora < 0) {
				hora = 24 + hora;
			}
			int resto = seg % 3600;
			minuto = minuto - ((resto)/60);
			if (minuto < 0) {
				minuto = 60 + minuto;
				hora--;
				if (hora < 0) {
					hora = 24 + hora;
				}
			}
			resto = resto % 60;
			segundo = segundo - resto;
			if (segundo < 0) {
				segundo = 60 + segundo;
				minuto--;
				if (minuto < 0) {
					minuto = 60 + minuto;
					hora--;
					if (hora < 0) {
						hora = 24 + hora;
					}
				}
			}
		}
		else if (seg >= 60){
			minuto = minuto - (seg / 60);
			if (minuto < 0) {
				minuto = 60 + minuto;
				hora--;
				if (hora < 0) {
					hora = 24 +hora;
				}
			}
			int resto = seg % 60;
			segundo = segundo - resto;
			if (segundo < 0) {
				segundo = 60 + segundo;
				minuto--;
				if (minuto < 0) {
					minuto = 60 + minuto;
					hora--;
					if (hora < 0) {
						hora = 24 + hora;
					}
				}
			}
		}
		else {
			segundo = segundo - seg;
			if (segundo < 0) {
				segundo = 60 + segundo;
				minuto--;
				if (minuto < 0) {
					minuto = 60 + minuto;
					hora--;
					if (hora < 0) {
						hora = 24 + hora;
					}
				}
			}
		}
	}
	
	public void exibeHorario() {
		System.out.println(hora + ":" + minuto + ":" + segundo);
	}
}