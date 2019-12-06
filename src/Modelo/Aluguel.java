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
public class Aluguel {
    private int cod;

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setCoddvd(int coddvd) {
        this.coddvd = coddvd;
    }

    public void setCodcliente(int codcliente) {
        this.Codcliente = codcliente;
    }

    public void setData_aluguel(String data_aluguel) {
        this.Data_aluguel = data_aluguel;
    }

    public void setHorario(String horario) {
        this.Horario = horario;
    }

    public void setData_devolucao(String data_devolucao) {
        this.Data_devolucao = data_devolucao;
    }

    public int getCod() {
        return cod;
    }

    public int getCoddvd() {
        return coddvd;
    }

    public int getCodcliente() {
        return Codcliente;
    }

    public String getData_aluguel() {
        return Data_aluguel;
    }

    public String getHorario() {
        return Horario;
    }

    public String getData_devolucao() {
        return Data_devolucao;
    }
      private int coddvd;
        private int Codcliente;
        private String Data_aluguel;
        private String Horario;
        private String Data_devolucao;
        
    
}
