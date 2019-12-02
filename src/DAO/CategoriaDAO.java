/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import Modelo.Categoria;

public class CategoriaDAO extends ExecuteSQL{
    public CategoriaDAO(Connection con) {
        super(con);
    }
    public boolean Logar(String login, String senha){
      boolean finalResult = false ;
      try{
      String consulta = "select nome from Categoria"
              + "where nome = '"+ login+"' and senha = '"+ senha+ "'";
      PreparedStatement ps = getCon().prepareStatement(consulta);
      ResultSet rs = ps.executeQuery();
      
      if (rs != null){
       while (rs.next()){
           Categoria a = new Categoria();
           a.setNome(rs.getString(1));
           finalResult = true;
           
       }   
      }
      
  
            } catch (SQLException ex){
                ex.getMessage();
            }
      return finalResult;
    }
}
