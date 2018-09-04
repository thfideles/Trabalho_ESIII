
package principal;

public class Estoque {
    private int quantidadeTotal; 
    private LivroEstoque livroEstoque;

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(int quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public LivroEstoque getLivroEstoque() {
        return livroEstoque;
    }

    public void setLivroEstoque(LivroEstoque livroEstoque) {
        this.livroEstoque = livroEstoque;
    }
}
