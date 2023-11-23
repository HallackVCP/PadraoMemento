package org.example;

public class FuncionarioStateFerias extends FuncionarioState{

    private FuncionarioStateFerias(){}

    private static FuncionarioStateFerias instance = new FuncionarioStateFerias();

    public static FuncionarioStateFerias getInstance(){return instance;}

    @Override
    public String getState() {
        return "Ferias";
    }
    /*public boolean alocar(Funcionario funcionario){
        funcionario.setFuncionarioState(FuncionarioStateAlocado.getInstance());
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
