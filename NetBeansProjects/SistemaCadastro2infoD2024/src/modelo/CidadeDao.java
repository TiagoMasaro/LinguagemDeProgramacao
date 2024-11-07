/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author tulio
 */
public class CidadeDao { // Data Acess Object padrão
    
    public List<Cidade> getLista(){
        String sql = "select * from cidade";
        List<Cidade> lista = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Cidade objCidade = new Cidade();
                objCidade.setCodigo(rs.getInt("codCidade"));
                objCidade.setNome(rs.getString("nomeCidade"));
                objCidade.setUf(rs.getNString("ufCidade"));
                lista.add(objCidade);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de SQL: "+ ex.getMessage());
        }
        return lista;
    }
    
    
    public boolean incluir(Cidade objCidade){
        String sql = "insert into cidade(nomeCidade, ufCidade) values (?,?)";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, objCidade.getNome());
            pst.setString(2, objCidade.getUf());
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Cidade cadastrada com sucesso!");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Cidade não cadastrada!");
                return false;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro de SQL: "+ ex.getMessage());
        }
        return false;
    }
    public boolean alterar(Cidade objCidade){
        String sql = "update cidade set nomeCidade=?, ufCidade=? where codCidade=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, objCidade.getNome());
            pst.setString(2, objCidade.getUf());
            pst.setInt(3, objCidade.getCodigo());
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Cidade atualizada com sucesso!");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Cidade não atualizada!");
                return false;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro de SQL: "+ ex.getMessage());
        }
        return false;
    }
    
    public boolean remover(Cidade objCidade){
        String sql = "delete from  cidade where codCidade=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            /*pst.setString(1, objCidade.getNome());
            pst.setString(2, objCidade.getUf());*/
            pst.setInt(1, objCidade.getCodigo());
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Cidade removida com sucesso!");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Cidade não removida!");
                return false;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro de SQL: "+ ex.getMessage());
        }
        return false;
    }
    
    public boolean salvar(Cidade obj){
        if(obj.getCodigo()==null){
            return incluir(obj);
            /*Integer codigo = Dados.listaCidade.size()+1;
            obj.setCodigo(codigo);
            Dados.listaCidade.add(obj);*/
        }else{
            return  alterar(obj);
        }
       
    }
    
    public Cidade localizar(Integer id){
        String sql = "select * from cidade where codCidade=?";
        Cidade obj = new Cidade();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery(); 
               while(rs.next()){
                   obj.setCodigo(rs.getInt("codCidade"));
                   obj.setNome(rs.getString("nomeCidade"));
                   obj.setUf(rs.getString("ufCidade"));
                   return obj;
               }
           }catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Erro de SQL localizar"+e.getMessage());
           }
        return null;
    }
    
    
}
