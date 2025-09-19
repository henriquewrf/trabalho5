package br.unicamp.ic.inf335.beans;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnuncioBeanTest
{
    private AnuncioBean anuncio;

    //Classe teste que implementa um métdodo que verifica se está sendo realizado o cálculo correto da porcentagem
    @Test
    public void addAnuncioTest() {

        anuncio = new AnuncioBean();

        ProdutoBean produto = new ProdutoBean();

        produto.setNome("teste anuncio");
        produto.setDescricao("teste descrição");
        produto.setCodigo("1");
        produto.setEstado("SP");
        produto.setValor(150.00);

        anuncio.setProduto(produto);
        anuncio.setDesconto(0.1);

        anuncio.setProduto(produto);

        double valor = anuncio.getValor();
        assertEquals(valor, 135);
    }
}
