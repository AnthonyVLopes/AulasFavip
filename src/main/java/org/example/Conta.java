package org.example;

public class Conta {

    public int numero;
    public float saldo;
    public String senha;

    public Conta(){};

    public Conta(int numero, float saldo, String senha) {
        this.numero = numero;
        this.saldo = saldo;
        this.senha = senha;
    };

    public void depositar(float valor){
        saldo = saldo + valor;
    }

    public void sacar(float valor){
        if (valor > saldo) {
            throw new RuntimeException("Conta sem saldo");
        }else{
            saldo = saldo - valor;
        }
    }

    public void imprimirsaldo(){
        System.out.println("Saldo: " + saldo);
    }
}
