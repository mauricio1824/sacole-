/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Sacole;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DaoSacole {
    
    public static boolean inserir(Sacole objeto) {
        String sql = "INSERT INTO sacole (n_serie, preco, data_validade,  sabor) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getN_serie());
            ps.setDouble(2, objeto.getPreco());
            ps.setDate(3, Date.valueOf(objeto.getData_validade())); //é necessário fazer a seguinte importação import java.sql.Date;
            ps.setString(4, objeto.getSabor());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static void main(String[] args) {
        Sacole objeto = new Sacole();
        objeto.setN_serie(2);
        objeto.setPreco(3.2);
        objeto.setData_validade(LocalDate.parse("11/07/2019", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        objeto.setSabor("Limão");
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
