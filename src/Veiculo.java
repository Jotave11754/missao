public abstract class Veiculo {
    public String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    private String getModelo() {
        return modelo;
    }

    public abstract double getValorDiaria();
    public abstract String getTipo();

    public void processarAluguel(int dias) {
        double total = dias * getValorDiaria();
        IO.println(getTipo() + ": " + modelo);
        IO.println("Total do aluguel: R$ " + total);
        IO.println("[LOG] Aluguel de " + getTipo().toLowerCase() + " processado com sucesso. \n ");
    }
}