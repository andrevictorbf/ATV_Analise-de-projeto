import java.time.LocalDate;

public class App {
  
    public static void main(String[] args) {
        // Criando algumas contas
        Conta conta1 = new Conta(LocalDate.of(2024, 1, 1), "0001", 100, 50.0, LocalDate.of(2024, 1, 15));
        Conta conta2 = new Conta(LocalDate.of(2024, 1, 1), "0002", 150, 75.0, LocalDate.of(2024, 1, 15));
        Conta conta3 = new Conta(LocalDate.of(2024, 1, 1), "0003", 80, 40.0, LocalDate.of(2024, 1, 15));

        // Criando um objeto ContaHandler e adicionando as contas
        ContaHandler handler = new ContaHandler();
        handler.adicionarConta(conta1);
        handler.adicionarConta(conta2);
        handler.adicionarConta(conta3);

        // Verificando o maior e o menor consumo
        Conta maiorConsumo = handler.obterContaMaiorConsumo();
        Conta menorConsumo = handler.obterContaMenorConsumo();

        // Exibindo os resultados
        if (maiorConsumo != null && menorConsumo != null) {
            System.out.println("Conta com maior consumo: " + maiorConsumo.getNumLeitura() + " (" + maiorConsumo.getMediaConsumo() + " kW/dia)");
            System.out.println("Conta com menor consumo: " + menorConsumo.getNumLeitura() + " (" + menorConsumo.getMediaConsumo() + " kW/dia)");
        } else {
            System.out.println("Nenhuma conta encontrada.");
        }
    }
}
