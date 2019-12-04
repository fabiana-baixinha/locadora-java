/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import Modelo.Cliente;

public class ClienteDAO extends ExecuteSQL{
    public ClienteDAO(Connection con) {
        super(con);
    }
    public boolean Logar(String nome, String nascimento, String RG, String CPF, String telefone, String email,String bairro, String rua, int numero, String CEP ){
      boolean finalResult = false ;
      try{
      String consulta = "select codigo, nome, nascimento, RG, CPF, Telefone, email, bairro, rua, numero from CEP "
              + "where nome = '"+nome+"', nascimento= '"+nascimento+"', RG = '"+RG+"',CPF = '"+CPF+"', telefone = '"+telefone+"', email = '"+email+"', bairro = '"+bairro+"', rua = '"+rua+"',numero= '"+numero+"' and = '"+CEP+ "'";
      PreparedStatement ps = getCon().prepareStatement(consulta);
      ResultSet rs = ps.executeQuery();
      
      if (rs != null){
       while (rs.next()){
           Cliente a = new Cliente();
           a.setNome(rs.getString(1));
           a.setNascimento(rs.getString(2));
           a.setRG(rs.getString(3));
           a.setCPF(rs.getString(4));
           a.setTelefone(rs.getString(5));
           a.setEmail(rs.getString(6));
           a.setBairro(rs.getString(7));
           a.setRua(rs.getString(8));
           a.setNumero(rs.getInt(9));
           a.setCEP(rs.getString(10));
           
           
           finalResult = true;
           
       }   
      }
      
  
            } catch (SQLException ex){
                ex.getMessage();
            }
      return finalResult;
    }
}
