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
public class DVD {

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCod_filme(int cod_filme) {
        this.cod_filme = cod_filme;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setData_comprar(String data_comprar) {
        this.data_comprar = data_comprar;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCod_filme() {
        return cod_filme;
    }

    public String getSituacao() {
        return situacao;
    }

    public double getPreco() {
        return preco;
    }

    public String getData_comprar() {
        return data_comprar;
    }
  //atributos
    private int codigo;
    private int cod_filme;
    private String situacao;
    private double preco;
    private String data_comprar;
}
