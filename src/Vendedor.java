public class Vendedor extends Funcionario {
    private Double comissao;
    private int numerosVendas;

    public Vendedor(String nome, String cpf, Double comissao, int numerosVendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numerosVendas = numerosVendas;
    }

    @Override
    public double calcularSalario() {
        return super.getSALARIO_MINIMO() + (this.comissao * this.numerosVendas);
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public int getNumerosVendas() {
        return numerosVendas;
    }

    public void setNumerosVagas(int numerosVagas) {
        this.numerosVendas = numerosVagas;
    }
}