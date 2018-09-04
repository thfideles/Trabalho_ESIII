
package principal;

import java.util.Date;

public class LivroEstoque {
    private int quantidade; 
    private float valorCusto; 
    private float valorVenda; 
    private String descProduto; 
    private Date dtEntrada;
    private String lote; 

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(float valorCusto) {
        this.valorCusto = valorCusto;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public Date getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }
    
    
}
