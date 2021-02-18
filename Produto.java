/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mercado;

import java.util.Date;

/**
 *
 * @author michel.andrade
 */
public class Produto {
    
    private int id_produto;
    private String nome;
    private String marca;
    private Date validade;
    private String codigo_barras;
    private String unidade_medida;
    private float preco;
    
    public Produto(int id_produto,String nome, String marca, Date validade, 
                    String codigo_barras, String unidade_medida, float preco){
        this.id_produto = id_produto;
        this.nome = nome;
        this.marca = marca;
        this.validade = validade;
        this.codigo_barras = codigo_barras;
        this.unidade_medida = unidade_medida;
        this.preco = preco;
    }

    /**
     * @return the id_produto
     */
    public int getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the validade
     */
    public Date getValidade() {
        return validade;
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(Date validade) {
        this.validade = validade;
    }

    /**
     * @return the codigo_barras
     */
    public String getCodigo_barras() {
        return codigo_barras;
    }

    /**
     * @param codigo_barras the codigo_barras to set
     */
    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    /**
     * @return the unidade_medida
     */
    public String getUnidade_medida() {
        return unidade_medida;
    }

    /**
     * @param unidade_medida the unidade_medida to set
     */
    public void setUnidade_medida(String unidade_medida) {
        this.unidade_medida = unidade_medida;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
    
}
