package com.example.apptrabalhon1;

public class Filme {

    public static final int ANO_MINIMO = 1950;

    public int id;
    public String nome;
    public String categoria;
    private int ano;

    public Filme() {

    }

    public Filme(String nome, int ano, String categoria) {
        this.nome = nome;
        this.setAno( ano );
        this.categoria = categoria;
    }

    public Filme(int id, String nome, int ano, String categoria) {
        this.id = id;
        this.nome = nome;
        this.setAno(ano);
        this.categoria = categoria;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if( ano >= ANO_MINIMO )
            this.ano = ano;

    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return id + " - " + nome + " | " + ano + "|" + categoria;
    }
}