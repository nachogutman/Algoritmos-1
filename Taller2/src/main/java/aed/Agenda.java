package aed;

public class Agenda {
    private Fecha fechaActual;
    private ArregloRedimensionableDeRecordatorios recordatorios;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = new Fecha(fechaActual);
        this.recordatorios = new ArregloRedimensionableDeRecordatorios();
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        this.recordatorios.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        String resultado = this.fechaActual.toString() + "\n";
        resultado = resultado + "=====\n";
        for (int i = 0; i < recordatorios.longitud(); i++) {
            Recordatorio recordatorio = recordatorios.obtener(i);
            if (recordatorio.fecha().equals(this.fechaActual)) {
                resultado = resultado + recordatorio.toString() + "\n";
            }
        }
        return resultado;
    }

    public void incrementarDia() {
         this.fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        return this.fechaActual;
    }

}
