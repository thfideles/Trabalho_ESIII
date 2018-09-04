
package principal;

import java.util.List;
import java.util.ArrayList;

public class Livro {
    private int ano; 
    private String titulo; 
    private int edicao; 
    private String isbn; 
    private int numPag; 
    private String sinopse; 
    private String altura; 
    private String peso; 
    private String largura; 
    private String profundidade; 
    private String codBarras; 
    private final List<Categoria> categorias;
    private Inativacao inativacao;
    private Ativacao ativacao;
    private GrupoDePrecificacao grupoprecificacao;
    private Estoque estoque; 
    private final List<Autor> autores;
    private final List<Fornecedor> fornecedores;   
    
    public Livro(List<Autor> autores, List<Fornecedor> fornecedores, List<Categoria> categorias){
        this.autores = autores; 
        this.fornecedores = fornecedores; 
        this.categorias = categorias; 
    }
    
    public int getAno(){
        return ano; 
    }
    
    public void setAno(int ano){
        this.ano = ano; 
    }
   
    public String getTitulo(){
        return titulo; 
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo; 
    }
    
    public int getEdicao(){
        return edicao; 
    }
    
    public void setEdicao(int edicao){
        this.edicao = edicao; 
    }
    
    public String getIsbn(){
        return isbn; 
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn; 
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(String profundidade) {
        this.profundidade = profundidade;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public Inativacao getInativacao() {
        return inativacao;
    }

    public void setInativacao(Inativacao inativacao) {
        this.inativacao = inativacao;
    }

    public Ativacao getAtivacao() {
        return ativacao;
    }

    public void setAtivacao(Ativacao ativacao) {
        this.ativacao = ativacao;
    }
    
    public GrupoDePrecificacao getGrupoDePrecificacao(){
        return grupoprecificacao; 
    }

    public void setGrupoprecificacao(GrupoDePrecificacao grupoprecificacao) {
        this.grupoprecificacao = grupoprecificacao;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
    
    public Livro(){
        this.autores = new ArrayList<>();
        this.fornecedores = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }
    
}

