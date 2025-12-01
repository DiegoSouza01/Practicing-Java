package BatteryLevelControl;

public class Battery {
    private int nivel;

    public Battery() {
        this.nivel = 100;
    }

    public void setNivel(int novoNivel) {
        if (novoNivel >= 0 && novoNivel <= 100) {
            this.nivel = novoNivel;
            System.out.println("Nível da bateria definido para: " + novoNivel + "%.");
        } else {
            System.out.println("Erro: Nível inválido (" + novoNivel + "%). O valor deve estar entre 0 e 100.");
        }
    }

    public void exibirStatus() {
        String status;

        if (nivel <= 20) {
            status = "Bateria fraca";
        } else if (nivel >= 80) {
            status = "Bateria cheia";
        } else {
            status = "Bateria ok";
        }

        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        Battery b = new Battery();

        System.out.println("Teste 1: Entrada Solicitada");
        b.setNivel(85);
        b.exibirStatus();

        System.out.println("\nTeste 2: Bateria Fraca (15%)");
        b.setNivel(15);
        b.exibirStatus();

        System.out.println("\nTeste 3: Bateria OK (50%)");
        b.setNivel(50);
        b.exibirStatus();

        System.out.println("\nTeste 4: Nível Inválido (120%)");
        b.setNivel(120);
        b.exibirStatus();
    }
}
