public class Turma {
    private int idTurma;
    private int qtdAlunos;
    private double notas[];

    public Turma(int idTurma, int qtdAlunos, double[] notas) {
        this.idTurma = idTurma;
        this.qtdAlunos = qtdAlunos;
        this.notas = notas;
    }

    public Turma() {}

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double mediaTurma(double [] v){
    	double soma = 0.0;
    	for (int i = 0; i < v.length; i++) {
    		soma = soma + v[i];
    	}
        double mediaTurma = soma/v.length;
        return mediaTurma;
    }
}