
package Ventana;


public class Tripleta {
    
    private int fila;
    private int columna;
    private int valor;

    public Tripleta() {
    }

    public void crearHidato(int x1, int y1, int s){
        int x2, y2, k;
        k=-1;
        boolean termina = false;
        
        do{
            
            
        }while(k<7 && termina==false);
        
    }
    
    public Tripleta(int fila, int columna, int valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    @Override
    public String toString(){
        
        return "\n " + getFila() + "," + getColumna() + "," + getValor();
    }
    
    
}
