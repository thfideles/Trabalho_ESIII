
package principal;

public class Troca {
    private String solicitacao; 
    private final StatusTroca status; 
    private String descricao; 
    
    public Troca(StatusTroca status){
        this.status = status; 
    }
            
    public String getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(String solicitacao) {
        this.solicitacao = solicitacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   
}  

