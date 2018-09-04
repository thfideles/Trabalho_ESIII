
package principal;

public class Cliente extends Usuario {
    private Endereco endResidencial; 
    private int codigo; 

    public Endereco getEndResidencial() {
        return endResidencial;
    }

    public void setEndResidencial(Endereco endResidencial) {
        this.endResidencial = endResidencial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
