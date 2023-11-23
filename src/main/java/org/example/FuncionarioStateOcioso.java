package org.example;

public class FuncionarioStateOcioso extends FuncionarioState {

    private FuncionarioStateOcioso(){}

    private static FuncionarioStateOcioso instance = new FuncionarioStateOcioso();

    public static FuncionarioStateOcioso getInstance(){return instance;}

    @Override
    public String getState() {
        return "Ocioso";
    }
    /*public boolean alocar(Funcionario funcionario){
        funcionario.setFuncionarioState(FuncionarioStateAlocado.getInstance());
        return true;
    }

    public boolean iniciarFerias(Funcionario funcionario){
        funcionario.setFuncionarioState(FuncionarioStateFerias.getInstance());
        return true;
    }

    public boolean folgar(Funcionario funcionario){
        funcionario.setFuncionarioState(FuncionarioStateFolga.getInstance());
        return true;
    }

    public boolean desligar(Funcionario funcionario){
        funcionario.setFuncionarioState(FuncionarioStateDesligado.getInstance());
        return true;
    }*/

}
