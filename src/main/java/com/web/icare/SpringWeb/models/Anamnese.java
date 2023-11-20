package com.web.icare.SpringWeb.models;

import javax.persistence.*;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "anamneses")
public class Anamnese {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "paciente", length = 255, nullable = false)
    private String paciente;

    @Column(name = "idade", length = 100, nullable = false)
    private int idade;

    @Column(name = "sexo", length = 100, nullable = false)
    private String sexo;

    @Column(name = "condicao", length = 100, nullable = false)
    private String condicao;

    @Column(name = "cirurgia", length = 100, nullable = false)
    private String cirurgia;

    @Column(name = "medicamentos", length = 100, nullable = false)
    private String medicamentos;

    @Type(type = "text")
    @Column(name = "detalhes", length = 255, nullable = false)
    private String detalhes;

    @Column(name = "dores", length = 100, nullable = false)
    private String dores;

    @Column(name = "inchaco", length = 100, nullable = false)
    private String inchaco;

    @Column(name = "febre", length = 100, nullable = false)
    private String febre;

    @Column(name = "atividade", length = 100, nullable = false)
    private String atividade;

    @Type(type = "text")
    @Column(name = "informacoes", length = 255)
    private String informacoes;

    @ManyToOne
    @JoinColumn(name = "administrador_id")
    private Administrador administrador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public String getCirurgia() {
        return cirurgia;
    }

    public void setCirurgia(String cirurgia) {
        this.cirurgia = cirurgia;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getDores() {
        return dores;
    }

    public void setDores(String dores) {
        this.dores = dores;
    }

    public String getInchaco() {
        return inchaco;
    }

    public void setInchaco(String inchaco) {
        this.inchaco = inchaco;
    }

    public String getFebre() {
        return febre;
    }

    public void setFebre(String febre) {
        this.febre = febre;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }
}
