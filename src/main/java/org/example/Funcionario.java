package org.example;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private String nome;

    private FuncionarioState funcionarioState;

    private List<FuncionarioState> memento = new ArrayList<FuncionarioState>();

    public Funcionario(FuncionarioState funcionarioState) {
        this.funcionarioState = funcionarioState;
    }
    public Funcionario() {
        this.funcionarioState = FuncionarioStateAlocado.getInstance();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioState getFuncionarioState() {
        return funcionarioState;
    }

    public void setFuncionarioState(FuncionarioState funcionarioState) {
        this.funcionarioState = funcionarioState;
        this.memento.add(this.funcionarioState);
    }

    /*public boolean alocar(){
        return this.funcionarioState.alocar(this);
    }

    public boolean iniciarFerias(){
        return this.funcionarioState.iniciarFerias(this);
    }

    public boolean folgar(){
        return this.funcionarioState.folgar(this);
    }

    public boolean desligar(){
        return this.funcionarioState.desligar(this);
    }

    public boolean ocioso(){
        return this.funcionarioState.ocioso(this);
    }*/

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.funcionarioState = this.memento.get(indice);
    }

    public List<FuncionarioState> getEstados() {
        return this.memento;
    }
}
