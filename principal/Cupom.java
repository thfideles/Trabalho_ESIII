
package principal;

public class Cupom {
    private int quantidade; 
    private String descricao; 
    
    Compra compra1 = new Compra(); 

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Compra getCompra1() {
        return compra1;
    }

    public void setCompra1(Compra compra1) {
        this.compra1 = compra1;
    }
    
    
}
