package br.com.projanna;

public class Empresa {
	/*id, cnpj, nome, cep, idFornecedores(list)*/
	/*set nao deixa repetir numero, o list deixa*/   
    public long id;
    public String cnpj;
    public String nomeFantasia;
    public int cep;
    
    /*Empresa CNPJ Nome Fantasia CEP*/
    
    public Empresa(long id, String cnpj, String nomeFantasia, int cep){
        this.id = id;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.cep = cep;
    }
        
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getName(){
        return nomeFantasia;
    }
    public void setName(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }
    
    public int getCep(){
        return cep;
    }
    public void setCep(int cep){
        this.cep = cep;
    }
}