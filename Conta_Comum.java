import java.util.Date;

public class Conta_Comum {
    protected long nro_conta;
    protected Date dt_aberura = new Date();
    protected Date dt_encerramento = new Date();
    protected int situacao = 1;
    protected int senha;
    protected double saldo = 0;

    public long getNro_conta() {
        return nro_conta;
    }
    public Date getDt_aberura() {
        return dt_aberura;
    }
    public Date getDt_encerramento() {
        return dt_encerramento;
    }
    public int getSituacao() {
        return situacao;
    }
    public int getSenha() {
        return senha;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setNro_conta(long nro_conta) {
        this.nro_conta = nro_conta;
    }
    public void setDt_aberura(Date dt_aberura) {
        this.dt_aberura = dt_aberura;
    }
    public void setDt_encerramento(Date dt_encerramento) {
        this.dt_encerramento = dt_encerramento;
    }
    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
