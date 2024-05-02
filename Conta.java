import java.time.LocalDate;

public class Conta {

    // atrubutos

    String numLeitura;
    int kwGasto;
    double valorPagar;
    LocalDate dataPagamento;
    LocalDate dataLeitura;
    double mediaConsumo;

    // construtor

    public Conta(LocalDate dataLeitura, String numLeitura, int kwGasto, double valorPagar, LocalDate dataPgto) {

        this.dataLeitura = dataLeitura;
        this.numLeitura = numLeitura;
        this.kwGasto = kwGasto;
        this.valorPagar = valorPagar;
        this.dataPagamento = dataPgto;
        this.mediaConsumo = kwGasto / dataLeitura.lengthOfMonth();

    }

    // métodos

    public String getNumLeitura() {
        return numLeitura;
    }

    public void setNumLeitura(String numLeitura) {
        this.numLeitura = numLeitura;
    }

    public int getKwGasto() {
        return kwGasto;
    }

    public void setKwGasto(int kwGasto) {
        this.kwGasto = kwGasto;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public LocalDate getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(LocalDate dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public double getMediaConsumo() {
        return mediaConsumo;
    }

    public void setMediaConsumo(double mediaConsumo) {
        this.mediaConsumo = mediaConsumo;
    }
}