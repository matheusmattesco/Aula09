import java.sql.Time;
import java.util.Date;

public class Movimento {
    private int tipo_move = 0;
    private Date dt_mov = new Date();
    private Time hor_mov = new Time(1);
    private double val_mov =0.0;

    public int getTipo_move() {
        return tipo_move;
    }
    public Date getDt_mov() {
        return dt_mov;
    }
    public Time getHor_mov() {
        return hor_mov;
    }
    public double getVal_mov() {
        return val_mov;
    }

    public void setTipo_move(int tipo_move) {
        this.tipo_move = tipo_move;
    }
    public void setDt_mov(Date dt_mov) {
        this.dt_mov = dt_mov;
    }

    public void setHor_mov(Time hor_mov) {
        this.hor_mov = hor_mov;
    }
    public void setVal_mov(double val_mov) {
        this.val_mov = val_mov;
    }
}
