/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.time.LocalDate;
/**
 *
 * @author Administrador
 */
public class Sacole {
    private Integer codigo;
    private Integer n_serie;
    private Double preco;
    private LocalDate data_validade; //é necessário fazer a seguinte importação: import java.time.LocalDate;
    private String sabor;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getN_serie() {
        return n_serie;
    }

    public void setN_serie(Integer n_serie) {
        this.n_serie = n_serie;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public LocalDate getData_validade() {
        return data_validade;
    }

    public void setData_validade(LocalDate data_validade) {
        this.data_validade = data_validade;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    @Override
    public String toString() {
        return "Sacole{" + "sabor=" + sabor + '}';
    }
}
