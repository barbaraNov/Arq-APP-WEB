package com.example.webservice;

import com.example.webservice.Produto;  
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();
    private Long nexId = 1L;

    public List<Produto> getAllProdutos() {
        return produtos;
    }

    public Produto addProduto(Produto produto) {
        produto.setId(nexId++);
        produtos.add(produto);
        return produto;
    }
}
