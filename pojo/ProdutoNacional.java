package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito {

    private double impostoNacional;

    //encapsulamento

    public double getImpostoNacional() {
        return this.impostoNacional;
    }

    public void setimpostoNacional(double NovoimpostoNacional) {
        this.impostoNacional = NovoimpostoNacional;
    }


    public ProdutoNacional(String novaInicial, Tamanho tamanhoInicial) {
        super(novaInicial, tamanhoInicial);
    }

    //@Override //anotação
    public String getDadosFavoritos() {
        //Nome: PS4, Sony e o valor 30
        return this.getNome() + "e " + this.getMarca() + "e " + this.getValor();
    }
}
