package org.example;

public class FuncionarioStateDesligado extends FuncionarioState {
    private FuncionarioStateDesligado(){}

    private static FuncionarioStateDesligado instance = new FuncionarioStateDesligado();

    public static FuncionarioStateDesligado getInstance(){return instance;}

    @Override
    public String getState() {
        return "Desligado";
    }

}
