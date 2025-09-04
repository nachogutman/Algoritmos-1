package aed;

class ArregloRedimensionableDeRecordatorios {
    private Recordatorio[] datos;

    public ArregloRedimensionableDeRecordatorios() {
        this.datos = new Recordatorio[0];
    }

    public int longitud() {
        int cont = 0;
        for (Recordatorio elem : this.datos) {
            cont++;
        }
        return cont;
    }

    public void agregarAtras(Recordatorio i) {
        int nuevaLongitud = this.longitud() + 1;
        Recordatorio[] nuevosDatos = new Recordatorio[nuevaLongitud];

        for (int j = 0; j < nuevaLongitud; j++) {
            if(j == nuevaLongitud - 1){
                nuevosDatos[j] = i;
            }else{
                nuevosDatos[j] = this.datos[j];
            }
        }

        this.datos = nuevosDatos;
    }

    public Recordatorio obtener(int i) {
        return this.datos[i];
    }

    public void quitarAtras() {
        int nuevaLongitud = this.longitud() - 1;
        Recordatorio[] nuevosDatos = new Recordatorio[nuevaLongitud];

        for (int j = 0; j < nuevaLongitud; j++) {
            nuevosDatos[j] = this.datos[j];
        }

        this.datos = nuevosDatos;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        this.datos[indice] = valor;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        this.datos = new Recordatorio[vector.longitud()];

        for (int i = 0; i < vector.longitud(); i++) {
            this.datos[i] = vector.datos[i];
        }
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        return new ArregloRedimensionableDeRecordatorios(this);
    }
}
