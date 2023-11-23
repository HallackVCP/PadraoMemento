package org.example;

public class FuncionarioStateAlocado extends FuncionarioState{

    private FuncionarioStateAlocado(){}

    private static FuncionarioStateAlocado instance = new FuncionarioStateAlocado();

    public static FuncionarioStateAlocado getInstance(){return instance;}

    @Override
    public String getState() {
        return "Alocado";
    }

    /*public boolean iniciarFerias(Funcionario funcionario){
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
    }

    public boolean ocioso(Funcionario funcionario){
        funcionario.setFuncionarioState(FuncionarioStateOcioso.getInstance());
        return true;
    }*/


}
