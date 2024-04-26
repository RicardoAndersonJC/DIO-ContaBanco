import java.math.BigDecimal;

public class ContaTerminal {
 private String numero;
 private int agencia;
 private String nomeCliente;
 private BigDecimal saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void dadosCliente(){
        System.out.println("Olá " +getNomeCliente() + ", " +
                "obrigado por criar uma conta em nosso banco, sua agência é "+ getAgencia() +"," +
                " conta " + getNumero() +" e seu saldo "+getSaldo() +" já está disponível para saque");
    }
}
