package aed;

public class Recordatorio {
    private String mensaje;
    private Fecha fecha;
    private Horario horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = new String(mensaje);
        this.fecha = new Fecha(fecha);
        this.horario = new Horario(horario.hora(), horario.minutos());
    }

    public Horario horario() {
        return new Horario(this.horario.hora(), this.horario.minutos());
    }

    public Fecha fecha() {
        return new Fecha(this.fecha);
    }

    public String mensaje() {
        return new String(this.mensaje);
    }

    @Override
    public String toString() {
        return mensaje + " @ " + fecha.toString() + " " + horario.toString();
    }

    @Override
    public boolean equals(Object otro) {
        if(otro == this){
            return true;
        }
        Recordatorio r = (Recordatorio) otro;
        return this.mensaje.equals(r.mensaje) && this.fecha.equals(r.fecha) && this.horario.equals(r.horario);
    }

}
