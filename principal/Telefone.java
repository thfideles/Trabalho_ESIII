
package principal;

public class Telefone {
    private String tipo; 
    private int numero; 
    private int ddd;
    
    Telefone fone1 = new Telefone();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
    
    
}
