/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author 12968505602
 */
public class Internacao {
    private String id_internacao;
    private String motivoInternacao;
    private double valorDiaInternacao;
    private int quantDiaInternacao;
    private double valorTotalInternacao;

    public String getId_internacao() {
        return id_internacao;
    }

    public void setId_internacao(String id_internacao) {
        this.id_internacao = id_internacao;
    }

    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }

    public double getValorDiaInternacao() {
        return valorDiaInternacao;
    }

    public void setValorDiaInternacao(double valorDiaInternacao) {
        this.valorDiaInternacao = valorDiaInternacao;
    }

    public int getQuantDiaInternacao() {
        return quantDiaInternacao;
    }

    public void setQuantDiaInternacao(int quantDiaInternacao) {
        this.quantDiaInternacao = quantDiaInternacao;
    }

    public double getValorTotalInternacao() {
        valorTotalInternacao = this.quantDiaInternacao*this.valorDiaInternacao;
        return valorTotalInternacao;
    }

    public void setValorTotalInternacao(double valorTotalInternacao) {
        this.valorTotalInternacao = valorTotalInternacao;
    }
    
    Paciente pac;
    Medico med;
    Enfermeiro enf;

    public Internacao(Paciente pac, Medico med, Enfermeiro enf) {
        this.pac = pac;
        this.med = med;
        this.enf = enf;
    }
    
    public void visualizarInternacao() {
        
    System.out.println("Nome do paciente: "+pac.getNomeP());
    System.out.println("Nome do médico: "+med.getNomeM());
    System.out.println("Nome do enfermeiro: "+enf.getNomeE());
    System.out.println("ID de internação: "+this.getId_internacao());
    System.out.println("Motico de internação: "+this.getMotivoInternacao());
    System.out.println("Valor do dia de internação: "+this.getValorDiaInternacao());
    System.out.println("Quantidade dias de internação: "+this.getQuantDiaInternacao());
    System.out.println("Valor total: "+this.getValorTotalInternacao());
     }
}
    
