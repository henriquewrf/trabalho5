package br.unicamp.ic.inf335.beans;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProdutoBeanTest {
    private ProdutoBean produtoBean;

    @Test
    public void compareToTeste(){
        produtoBean = new ProdutoBean();
        produtoBean.setValor(120.00);

        ProdutoBean produtoBean2 = new ProdutoBean();

        produtoBean2.setValor(130.00);

        int retorno = produtoBean2.compareTo(produtoBean2);
        assertEquals(retorno, 0);
    }
}
