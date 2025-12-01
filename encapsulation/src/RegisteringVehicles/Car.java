package RegisteringVehicles;

public class Car {
    private String modelo;
    private String placa;
    private int ano;

    public Car(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Veículo cadastrado:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}