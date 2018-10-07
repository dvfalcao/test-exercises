package br.david.compras;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class CarrinhoTest {

    private Carrinho carrinho;

    @Before
    public void criandoCarrinho() {
        carrinho = new Carrinho();
    }

    // Testa se o carrinho está vazio
    
    @Test(expected = CarrinhoVazioExpected.class)
    public void colocandoZeroProduto() throws CarrinhoVazioExpected {
        Produto menor;
        menor = carrinho.menorProduto();
        assertEquals(null, menor);
    }

    
    // Verifica a inclusão de um produto
    @Test
    public void colocandoUmProduto() throws CarrinhoVazioExpected {
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add(livro);
        Produto menor;
        menor = carrinho.menorProduto();
        
        assertEquals(livro, menor);
    }

    // Insere produtos no carrinho e verifica o de menor valor
    @Test
    public void colocandoMaisProdutos() throws CarrinhoVazioExpected {
    	
    	Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add(livro);      
        Produto deitel = new Produto("C#: como programar", 150.00);
        carrinho.add(deitel);               
        Produto krug = new Produto("Não me faça pensar", 40.00);
        carrinho.add(krug);

        Produto menor;
        menor = carrinho.menorProduto();
   
        // Verifica se o livro do Krug é realmente o de menor valor dentres o produtos criados
        assertEquals(krug, menor);
     }
}

