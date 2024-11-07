/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Nycollas
 * 
 Atividade de revisão
 * 
(Crie as classes dentro do pacote banco no projeto)
* 
O objetivo aqui é criar um sistema para gerenciar os funcionários do Banco.
* 
1) Modele um funcionário. Ele deve ter o nome do funcionário, o departamento onde trabalha, seu salário
(double), a data de entrada no banco (String), seu RG (String) e um valor booleano que indique se o funcionário
ainda está ativa na empresa no momento ou se já foi mandado embora.
* 
Você deve criar alguns métodos de acordo com sua necessidade. Além deles, crie um método bonifica que
aumenta o salario do funcionário de acordo com o parâmetro passado como argumento. Crie, também, um método
demite, que não recebe parâmetro algum, só modifica o valor booleano indicando que o funcionário não trabalha
mais aqui.
* 
A idéia aqui é apenas modelar, isto é, só identifique que informações são importantes e o que um funcionário faz.
Desenhe no papel tudo o que um Funcionario tem e tudo que ele faz.  */

abstract class Funcionario {
    
    /* private String nome;
    private String departamento;
    private String dataEntrada;
    private String rg;
    boolean situacao;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    void ativo() {
        this.situacao = true;
    }
    
    void demite(){
        this.salario = 0;
        this.departamento = "Sem departamento";
        this.situacao = false;
    }
  
        
    
    public void bonifica(double quantidade){
     this.salario = this.salario + quantidade;   
    }
    
    void mostra(){
        System.out.println("Nome: "+this.nome);
        System.out.println("RG: "+this.rg);
        System.out.println("Data de entrada: "+this.getDataEntrada());
        System.out.println("Departamento: "+this.departamento);
        System.out.println("Salário: "+this.salario);
        
        }
    
   
    */
    
    // Fazendo com o professor
    
    private String departamento, dataEntrada, RG, nome;
    private double salario;
    private boolean ativo=true; // É possível colocar uma valor booleano para ativo logo no início
    
    //  Se usa o private para facilitar a manutenção. É mais fácil alterar as coisas sem prejudicar o resto das classes.

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    
    
    
    public Funcionario(String nome) { // Se usa o construtor para obrigar quem for instanciar a classe a digitar o nome 
        this.nome = nome;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void bonifica(double aumento){
        this.salario = this.salario + aumento;
    }
    
    
    public void demite(){
       
        this.ativo = false;
    }

   /* public Funcionario() { //Para não ser necessário criar construtores nas classes filhas
    }
    */
    
    
    
    public void mostra(){
        
        System.out.println("Nome: "+this.getNome());
        System.out.println("Departamneto: "+this.getDepartamento());
        System.out.println("Data de entrada: "+this.getDataEntrada());
        System.out.println("RG: "+this.getRG());
        System.out.println("Salário: "+this.getSalario());
        System.out.println("Bonificação: "+this.getBonificacao());
        System.out.println("Ativo: "+(this.isAtivo()==true?"Sim":"Não")); // como ativo é boolean, o get vem como isAtivo, sendo possível fazer uma estrutra de condição 
        System.out.println("-------------------------------------");
    }
    
    public abstract double getBonificacao();  // O método abstrato não tem corpo, ele só obriga as classes filhas a terem que reescrevê-lo
       
    
    

  
 }
