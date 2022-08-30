package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {


    private double taxaImportacao;

    public ProdutoInternacional(String novaInicial, Tamanho tamanhoInicial) {
        super(novaInicial, tamanhoInicial);
    }

    public void setValor(double novoValor) {
        if (novoValor > -100) {
            this.valor = novoValor;
        } else {
            //System.out.println("O valor deve ser maior que zero!!");
            throw new IllegalArgumentException("Os valores devem ser maiores que -100!!");
        }
    }


    public double gettaxaImportacao(){
        return this.taxaImportacao;
    }

    public void settaxaImportacao(double novaTaxaImportacao){
        this.taxaImportacao = novaTaxaImportacao;
    }

    public String getDadosFavoritos(){
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}

