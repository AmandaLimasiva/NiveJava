package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    //Atributos - Aspectos ou características
    private String nome;
    private String marca;
    protected double valor; //Produto internancional pode fazer alteração pois é extendida
    private Tamanho tamanho;
    private List<ItensInclusos> itensInclusos;

    //Contrutor
   public Produto(String novaInicial, Tamanho tamanhoInicial ){
    //Definir comandos que serão iniciados durante a instanciação
       this.marca = novaInicial;
       this.tamanho = tamanhoInicial;
   }

    //Atributo VALOR
    //Static - se quiser -- ISSO É UM MÈTODO
    public double getValor() {
        return this.valor; // returne o valor contido neste documento
    }

    //Void significa sem returno
    public void setValor(double novoValor) {
        if (novoValor > 0) {
            this.valor = novoValor;
        } else {
            //System.out.println("O valor deve ser maior que zero!!");
            throw new IllegalArgumentException("O valor deve ser maior que zero!!");
        }
    }

    //Atributo NOME

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    //Atributo MARCA

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    //Atributo TAMANHO

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho Novotamanho){
            this.tamanho = Novotamanho;
    }

    //Atributo ITENS INCLUSOS
    public List<ItensInclusos> getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(List<ItensInclusos> NovosItensInclusos) {
        this.itensInclusos = NovosItensInclusos;
    }

    
}
