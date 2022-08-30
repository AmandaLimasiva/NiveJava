package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItensInclusos;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;


import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Nestle", Tamanho.MEDIO);


        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(10);
        //meuProduto.setMarca("Sony");
        //meuProduto.setTamanho(Tamanho.PEQUENO);

        List<ItensInclusos> itensInclusos = new ArrayList<>();
        ItensInclusos primeiroItemAdicional = new ItensInclusos("Controle", 3);
        //primeiroItemAdicional.setNomeItem("controle");
        //primeiroItemAdicional.setQuantidadeItens(2);
        itensInclusos.add(primeiroItemAdicional); //0

        ItensInclusos segundoItemAdicional = new ItensInclusos("Jogos", 3);
        itensInclusos.add(segundoItemAdicional);


        ItensInclusos terceiroItemAdicional = new ItensInclusos("Cabos de Energia", 2);
        itensInclusos.add(terceiroItemAdicional);


        meuProduto.setItensInclusos(itensInclusos);


        //System.out.println(meuProduto.getValor());
        //System.out.println(meuProduto.getNome());
        //System.out.println(meuProduto.getMarca());
        //System.out.println(meuProduto.getTamanho());
        //System.out.println(meuProduto.getItensInclusos().get(1).getNomeItem());
        //System.out.println(meuProduto.getItensInclusos().size());

        System.out.println("Comecando a apresentar os itens");

        for (ItensInclusos itemAtual : meuProduto.getItensInclusos()) {
            //Comando aqui em baixo
            System.out.println(itemAtual.getNomeItem());
            System.out.println(itemAtual.getQuantidadeItens());
        }

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.GRANDE);
        meuProdutoNacional.setimpostoNacional(2.5);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony 2",Tamanho.MEDIO);
        meuProdutoInternacional.settaxaImportacao(100.00);
        System.out.println(meuProdutoInternacional.gettaxaImportacao());

    }
}
