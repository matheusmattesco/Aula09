public class Pessoa {
    protected String nom_pessoa;
    protected String end_pessoa;
    protected long cep_pessoa;
    protected String tel_pessoa;
    protected double renda_pessoa;
    protected int sit_pessoa;

    Pessoa(){

    }

    public String getNom_pessoa() {
        return nom_pessoa;
    }
    public String getEnd_pessoa() {
        return end_pessoa;
    }
    public long getCep_pessoa() {
        return cep_pessoa;
    }
    public String getTel_pessoa() {
        return tel_pessoa;
    }
    public double getRenda_pessoa() {
        return renda_pessoa;
    }
    public int getSit_pessoa() {
        return sit_pessoa;
    }

    public void setNom_pessoa(String nom_pessoa) {
        this.nom_pessoa = nom_pessoa;
    }
    public void setEnd_pessoa(String end_pessoa) {
        this.end_pessoa = end_pessoa;
    }
    public void setCep_pessoa(long cep_pessoa) {
        this.cep_pessoa = cep_pessoa;
    }
    public void setTel_pessoa(String tel_pessoa) {
        this.tel_pessoa = tel_pessoa;
    }
    public void setRenda_pessoa(double renda_pessoa) {
        this.renda_pessoa = renda_pessoa;
    }
    public void setSit_pessoa(int sit_pessoa) {
        this.sit_pessoa = sit_pessoa;
    }
}
