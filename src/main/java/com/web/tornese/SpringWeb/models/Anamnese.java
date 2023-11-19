package com.web.tornese.SpringWeb.models;

import javax.persistence.*;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "anamneses")
public class Anamnese {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "paciente", length = 255, nullable = false)
    private String paciente;

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    @Column(name = "idade", length = 100, nullable = false)
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Column(name = "sexo", length = 100, nullable = false)
    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Column(name = "condicao", length = 100, nullable = false)
    private String condicao;

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    @Column(name = "cirurgia", length = 100, nullable = false)
    private String cirurgia;

    public String getCirurgia() {
        return cirurgia;
    }

    public void setCirurgia(String cirurgia) {
        this.cirurgia = cirurgia;
    }

    @Column(name = "medicamentos", length = 100, nullable = false)
    private String medicamentos;

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Column(name = "detalhes", length = 255, nullable = false)
    private String detalhes;

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    @Column(name = "dores", length = 100, nullable = false)
    private String dores;

    public String getDores() {
        return dores;
    }

    public void setDores(String dores) {
        this.dores = dores;
    }

    @Column(name = "inchaco", length = 100, nullable = false)
    private String inchaco;

    public String getInchaco() {
        return inchaco;
    }

    public void setInchaco(String inchaco) {
        this.inchaco = inchaco;
    }

    @Column(name = "febre", length = 100, nullable = false)
    private String febre;

    public String getFebre() {
        return febre;
    }

    public void setFebre(String febre) {
        this.febre = febre;
    }

    @Column(name = "atividade", length = 100, nullable = false)
    private String atividade;

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    @Type(type = "text")
    @Column(name = "informacoes", length = 255)
    private String informacoes;

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }
}
