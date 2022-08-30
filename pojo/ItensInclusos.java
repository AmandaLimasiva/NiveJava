package br.com.lojinha.pojo;

public class ItensInclusos {
     private String nomeItem;
     private int quantidadeItens;

     public ItensInclusos(String nomeInicial, int quantidadeItensInicial){
          this.nomeItem = nomeInicial;
          this.quantidadeItens = quantidadeItensInicial;
     }

     public String getNomeItem(){
          return this.nomeItem;
     }

     public void setNomeItem(String novoItem){
          this.nomeItem = novoItem;
     }

     public int getQuantidadeItens() {
          return quantidadeItens;
     }

     public void setQuantidadeItens(int NovaquantidadeItens) {
          this.quantidadeItens = NovaquantidadeItens;
     }
}
