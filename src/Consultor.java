public class Consultor extends Funcionario {
    private Double valorhora;
    private long horasTrabalhadas;

    public Consultor(String nome, String cpf, Double valorhora, long horasTrabalhadas) {
        super(nome, cpf);
        this.valorhora = valorhora;
        this.horasTrabalhadas = horasTrabalhadas;
    }


    @Override
    public double calcularSalario() {
        return this.horasTrabalhadas = this.horasTrabalhadas;
    }

    public Double getValorhora() {
        return valorhora;
    }

    public void setValorhora(Double valorhora) {
        this.valorhora = valorhora;
    }

    public long getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(long horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
