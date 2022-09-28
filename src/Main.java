public class Main {
    public static void main(String[] args) {
        Vendedor joaoVendedor =
                new Vendedor( nome: "joao Vendedor", cpf:"123456", comissao:"10.0", numeroVendas:"5");

        double salarioJoao = joaoVendedor.calcularSalario();
        System.out.println("O salairio de joao");

        //System.out.println("Hello world!");
    }
}