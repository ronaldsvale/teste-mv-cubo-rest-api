package br.com.ronaldvale.testemvrestapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "colaborador")
public class ColaboradorMV {

    @Id
    public Integer cpf;

    @Column(nullable = false, length = 50)
    public String nome;

    @Column(nullable = false, length = 10)
    public String login;

    @Column(nullable = false, length = 10)
    public String senha;

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
