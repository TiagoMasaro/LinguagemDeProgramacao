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
public class ClienteDao { // Data Acess Object padrão
    
    public List<Cliente> getLista(){
        String sql = "select * from cliente";
        List<Cliente> lista = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Cliente objCliente = new Cliente();
                objCliente.setCodigo(rs.getInt("codCliente"));
                objCliente.setNome(rs.getString("nomeCliente"));
                objCliente.setRg(rs.getString("rgCliente"));
                objCliente.setCpf(rs.getString("cpfCliente"));
                objCliente.setEndereco(rs.getString("enderecoCliente"));
                objCliente.setTipoPessoa(rs.getString("tipoPessoaCliente"));
                lista.add(objCliente);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de SQL: "+ ex.getMessage());
        }
        return lista;
    }
    
    
    public boolean incluir(Cliente objCliente){
        String sql = "insert into cliente(nomeCliente, rgCliente, cpfCliente, enderecoCliente, tipoPessoaCliente) values (?,?,?,?,?)";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, objCliente.getNome());
            pst.setString(2, objCliente.getRg());
            pst.setString(3, objCliente.getCpf());
            pst.setString(4, objCliente.getEndereco());
            pst.setString(5, objCliente.getTipoPessoa());
            //pst.setInt(6, objCliente.getCodigo());
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Cliente cadastrada com sucesso!");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não cadastrada!");
                return false;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro de SQL: "+ ex.getMessage());
        }
        return false;
    }
    public boolean alterar(Cliente objCliente){
        String sql = "update cliente set nomeCliente=?, rgCliente=?, cpfCliente=?, enderecoCliente=?, tipoPessoaCliente=? where codCliente=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
          
            pst.setString(1, objCliente.getNome());
            pst.setString(2, objCliente.getRg());
            pst.setString(3, objCliente.getCpf());
            pst.setString(4, objCliente.getEndereco());
            pst.setString(5, objCliente.getTipoPessoa());
            pst.setInt(6, objCliente.getCodigo());
           
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, " Cliente atualizada com sucesso!");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não atualizada!");
                return false;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro de SQL: "+ ex.getMessage());
        }
        return false;
    }
    
    public boolean remover(Cliente objCliente){
        String sql = "delete from  cliente where codCliente=?";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            
            /*pst.setString(1, objCliente.getNome());
            pst.setString(2, objCliente.getRg());
            pst.setString(3, objCliente.getCpf());
            pst.setString(4, objCliente.getEndereco());
            pst.setString(5, objCliente.getTipoPessoa());*/
            pst.setInt(1, objCliente.getCodigo());
            
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não removido!");
                return false;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro de SQL: "+ ex.getMessage());
        }
        return false;
    }
    
    public boolean salvar(Cliente obj){
        if(obj.getCodigo()==null){
            return incluir(obj);
            /*Integer codigo = Dados.listaCidade.size()+1;
            obj.setCodigo(codigo);
            Dados.listaCidade.add(obj);*/
        }else{
            return  alterar(obj);
        }
       
    }
    
    
}
