/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projanna.projempresa;

/**
 *
 * @author ninha
 */
public class Fornecedor {
    private int id;
    private String doc;
    private String nome;
    private String email;
    private int cep;
    
    public Fornecedor(int id, String doc, String nome, String email, int cep){
        this.id = id;
        this.doc = doc;
        this.nome = nome;
        this.email = email;
        this.cep = cep;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getDoc(){
        return doc;
    }
    public void setDoc(String doc){
        this.doc = doc;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public int getCep(){
        return cep;
    }
    public void setCep(int cep){
        this.cep = cep;
    }
}
