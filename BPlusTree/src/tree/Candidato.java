/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author Administrador
 */
public class Candidato {
    private String nome;
    private String genero;
    private Integer idade;

    public Candidato(String nome, String genero, Integer idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
