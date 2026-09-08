
public class Moto extends Veiculo {
    public Moto(String modelo) {
        super(modelo);
    }

    @Override
    public double getValorDiaria() {
        return 120.0;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}