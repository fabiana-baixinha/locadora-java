/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ELAIO
 */
public class Filme {

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setCod_categoria(int cod_categoria) {
        this.cod_categoria = cod_categoria;
    }

    public void setCod_classificacao(int cod_classificacao) {
        this.cod_classificacao = cod_classificacao;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getDuracao() {
        return duracao;
    }

    public int getCod_categoria() {
        return cod_categoria;
    }

    public int getCod_classificacao() {
        return cod_classificacao;
    }

    public String getCapa() {
        return capa;
    }
    private int codigo;
    private String titulo;
     private int ano;
     private String duracao;
      private int cod_categoria;
       private int cod_classificacao;
       private String capa;
       
}
