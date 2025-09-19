package br.unicamp.ic.inf335.beans;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnuncianteBeanTest {

    private AnuncianteBean anunciante;

    //Classe teste que implementa um métdodo que verifica se um anuncio foi inserido:
    @Test
    public void addAnuncioTest() {

        anunciante = new AnuncianteBean();

        ProdutoBean produto = new ProdutoBean();

        produto.setNome("teste anuncio");
        produto.setDescricao("teste descrição");
        produto.setCodigo("1");
        produto.setEstado("SP");
        produto.setValor(150.00);

        AnuncioBean anuncio = new AnuncioBean();

        anuncio.setProduto(produto);
        anuncio.setDesconto(100.00);

        anunciante.addAnuncio(anuncio);
        //Verifica se o anuncio foi inserido
        assertTrue(anunciante.getAnuncios().contains(anuncio));

    }

}
