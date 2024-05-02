import java.util.ArrayList;

public class ContaHandler {
    private ArrayList<Conta> contas;

    public ContaHandler() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta obterContaMaiorConsumo() {
        Conta contaMaiorConsumo = null;
        double maiorConsumo = Double.MIN_VALUE;

        for (Conta conta : contas) {
            if (conta.getMediaConsumo() > maiorConsumo) {
                maiorConsumo = conta.getMediaConsumo();
                contaMaiorConsumo = conta;
            }
        }

        return contaMaiorConsumo;
    }

    public Conta obterContaMenorConsumo() {
        Conta contaMenorConsumo = null;
        double menorConsumo = Double.MAX_VALUE;

        for (Conta conta : contas) {
            if (conta.getMediaConsumo() < menorConsumo) {
                menorConsumo = conta.getMediaConsumo();
                contaMenorConsumo = conta;
            }
        }

        return contaMenorConsumo;
    }
}
