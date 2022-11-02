public class Pessoa_Fisica extends Pessoa{
    private long cpf_pessoa;
    private long rg_pessoa;

    void Pessoa(){}

    public long getCpf_pessoa() {
        return cpf_pessoa;
    }
    public long getRg_pessoa() {
        return rg_pessoa;
    }

    public void setCpf_pessoa(long cpf_pessoa) {
        this.cpf_pessoa = cpf_pessoa;
    }
    public void setRg_pessoa(long rg_pessoa) {
        this.rg_pessoa = rg_pessoa;
    }
}
