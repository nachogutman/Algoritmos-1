package aed;

public class Horario {
    private int hora;
    private int minutos;

    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int hora() {
        return this.hora;
    }

    public int minutos() {
        return this.minutos;
    }

    @Override
    public String toString() {
        String horaParseada = "";
        if(this.hora > 9){
            horaParseada += this.hora;
        }else{
            horaParseada += "0" + this.hora;
        }

        horaParseada += ":";

        if(this.minutos > 9){
            horaParseada += this.minutos;
        }else{
            horaParseada += "0" + this.minutos;
        }
        return horaParseada;
    }

    @Override
    public boolean equals(Object otro) {
        if(otro == this){
            return true;
        }
        Horario h = (Horario) otro;
        return this.hora == h.hora && this.minutos == h.minutos;
    }

}
