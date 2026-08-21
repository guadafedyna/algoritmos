package aed;

public class Fecha {

    private int _dia;
    private int _mes;
    private Fecha _fecha;

    public Fecha(int dia, int mes) {
        _dia = dia;    // como son int primitivos no hace falta poner new 
        _mes = mes;
    }

    public Fecha(Fecha fecha) {
        _fecha = fecha;          //constructor por copia 
    }  // _fecha = (_dia,_mes);

    public Integer dia() {
        return _dia;
    }

    public Integer mes() {
        return _mes;
    }

    public String toString() {
        // Implementar
        return _dia + "/" + _mes;

     // return dia() + "/" + mes();
    }

    @Override
    public boolean equals(Object otra) {
        // Implementar
        return true;
    }

    public void incrementarDia() {
        // Implementar
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
