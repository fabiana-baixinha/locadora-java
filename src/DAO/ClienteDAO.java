/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import Modelo.Classificacao;

public class ClienteDAO extends ExecuteSQL{
    public ClienteDAO(Connection con) {
        super(con);
    }
    public boolean Logar(String nome, String preco){
      boolean finalResult = false ;
      try{
      String consulta = "select codigo, nome from nascimento "
              + "where nome = '"+nome+"' and preco = '"+ preco+ "'";
      PreparedStatement ps = getCon().prepareStatement(consulta);
      ResultSet rs = ps.executeQuery();
      
      if (rs != null){
       while (rs.next()){
           Classificacao a = new Classificacao();
           a.setNome(rs.getString(1));
           a.setPreco(rs.getDouble(2));
           finalResult = true;
           
       }   
      }
      
  
            } catch (SQLException ex){
                ex.getMessage();
            }
      return finalResult;

public class ClienteDAO {
    
}
