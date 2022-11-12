import java.util.Date;

public class ContaSalario extends Conta_Comum{
    private Date dt_Aniversario = new Date();

    public Date getDt_Aniversario() {
        return dt_Aniversario;
    }

    public void setDt_Aniversario(Date dt_Aniversario) {
        this.dt_Aniversario = dt_Aniversario;
    }
}