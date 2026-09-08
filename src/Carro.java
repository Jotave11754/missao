public class Carro extends Veiculo {
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public double getValorDiaria() {
        return 11600.0;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}