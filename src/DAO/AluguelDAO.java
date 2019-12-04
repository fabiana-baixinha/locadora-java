/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import Modelo.Aluguel;

public class AluguelDAO extends ExecuteSQL{
     public AluguelDAO(Connection con) {
        super(con);
    }
    public boolean Logar(String login, String senha){
      boolean finalResult = false ;
      try{
      String consulta = "select data_aluguel, horario, data_devolucao from Aluguel"
              + "where login = '"+ login+"' and senha = '"+ senha+ "'";
      PreparedStatement ps = getCon().prepareStatement(consulta);
      ResultSet rs = ps.executeQuery();
      
      if (rs != null){
       while (rs.next()){
           Aluguel a = new Aluguel();
           a.setCodcliente(rs.getInt(1));
           a.setData_aluguel(rs.getString(2));
           a.setHorario(rs.getString(3));
           a.setData_devolucao(rs.getString(4));
           finalResult = true;
           
       }   
      }
      
  
            } catch (SQLException ex){
                ex.getMessage();
            }
      return finalResult;
    }
    
}
