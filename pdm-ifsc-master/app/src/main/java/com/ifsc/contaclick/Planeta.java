package com.ifsc.contaclick;

import java.io.Serializable;

public class Planeta implements Serializable {

    String nome;
    Integer imagem;//são recursos acessados por drawable R.drawable.nome

    public Planeta(String nome, Integer imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }


}
