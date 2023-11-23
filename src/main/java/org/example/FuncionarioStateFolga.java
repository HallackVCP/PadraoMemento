package org.example;

public class FuncionarioStateFolga extends FuncionarioState {
    private FuncionarioStateFolga(){}

    private static FuncionarioStateFolga instance = new FuncionarioStateFolga();

    public static FuncionarioStateFolga getInstance(){return instance;}

    @Override
    public String getState() {
        return "Folga";
    }
    /*public boolean alocar(Funcionario funcionario){
        funcionario.setFuncionarioState(FuncionarioStateAlocado.getInstance());
        return true;
    }

    public boolean iniciarFerias(Funcionario funcionario){
        funcionario.setFuncionarioState(FuncionarioStateFerias.getInstance());
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
