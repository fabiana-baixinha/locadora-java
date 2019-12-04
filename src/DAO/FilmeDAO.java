/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import Modelo.Filme;

public class FilmeDAO extends ExecuteSQL{
    public FilmeDAO(Connection con) {
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
           Filme a = new Filme();
           a.setTitulo(rs.getString(1));
           a.setAno(rs.getInt(2));
           a.setDuracao(rs.getString(3));
           a.setCod_categoria(rs.getInt(4));
           a.setCod_classificacao(rs.getInt(5));
           a.setCapa(rs.getString(6));
           
           
           
           finalResult = true;
           
       }   
      }
      
  
            } catch (SQLException ex){
                ex.getMessage();
            }
      return finalResult;
    }

}

