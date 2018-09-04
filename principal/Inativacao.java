
package principal;

public class Inativacao {
    private String justificativa;
    private CategoriaInativacao categoriaInativacao;

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public CategoriaInativacao getCategoriaInativacao() {
        return categoriaInativacao;
    }

    public void setCategoriaInativacao(CategoriaInativacao categoriaInativacao) {
        this.categoriaInativacao = categoriaInativacao;
    }
}
