public class Main {
    public static void main(String[] args) {
        SistemaAluguel sistema = new SistemaAluguel();

        Veiculo carro = new Carro("MC Laren W1");
        Veiculo moto = new Moto("CG Titan 160");

        sistema.calcularAluguel(carro, 5);
        sistema.calcularAluguel(moto, 5);
    }
}