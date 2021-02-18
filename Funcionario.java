/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mercado;

/**
 *
 * @author michel.andrade
 */
public class Funcionario {
    
    private int Id_funcionario;
    private String nome;
    private String cargo;
    private String cpf;
    private String endereco;
    private String telefone;

    /**
     * @return the Id_funcionario
     */
    public int getId_funcionario() {
        return Id_funcionario;
    }

    /**
     * @param Id_funcionario the Id_funcionario to set
     */
    public void setId_funcionario(int Id_funcionario) {
        this.Id_funcionario = Id_funcionario;
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
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public boolean Verifica_Telefone(String telefone){
        return false;
    }
    
    public boolean Verifica_Documento(String cpf){
        return false;
    }
}
