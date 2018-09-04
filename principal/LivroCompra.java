
package principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LivroCompra {
    private int quantidade;
    private int numPedido;
    private Date dtEntrega;
    private String tipoPagamento;
    private final Compra compra;
    private final List<Livro> livros;

    public LivroCompra(Compra compra, List<Livro> livros) {
        this.compra = compra;
        this.livros = livros;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public Date getDtEntrega() {
        return dtEntrega;
    }

    public void setDtEntrega(Date dtEntrega) {
        this.dtEntrega = dtEntrega;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    public LivroCompra (){
        this.compra = new Compra();
        this.livros = new ArrayList<>();
    }
   
    
}
