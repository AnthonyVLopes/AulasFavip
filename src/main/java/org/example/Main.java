package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1001, 250.00f,"neymito");

        conta1.imprimirsaldo();
        conta1.depositar(200);
        conta1.imprimirsaldo();
        conta1.depositar(500);
        conta1.imprimirsaldo();
        conta1.sacar(350);
        conta1.imprimirsaldo();
        conta1.sacar(1000);
    }
}