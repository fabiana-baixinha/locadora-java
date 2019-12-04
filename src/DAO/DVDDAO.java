/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
 import java.sql.*;
import Modelo.DVD;

public class DVDDAO extends ExecuteSQL {
     public DVDDAO(Connection con) {
        super(con);
    }
    public boolean Logar(String cod_filme, String situacao, Double preco, String data_comprar ){
      boolean finalResult = false ;
      try{
      String consulta = "select codigo, nome, nascimento, RG, CPF, Telefone, email, bairro, rua, numero from CEP "
              + "where cod_filme = '"+cod_filme+"' situacao = '"+situacao+"', preco = '"+preco+"' and = '"+data_comprar+ "'";
      PreparedStatement ps = getCon().prepareStatement(consulta);
      ResultSet rs = ps.executeQuery();
      
      if (rs != null){
       while (rs.next()){
           DVD a = new DVD();
           a.setCod_filme(rs.getInt(1));
           a.setSituacao(rs.getString(2));
           a.setPreco(rs.getDouble(3));
           a.setData_comprar(rs.getString(4));
           
           
           
           finalResult = true;
           
       }   
      }
      
  
            } catch (SQLException ex){
                ex.getMessage();
            }
      return finalResult;
    }

}
