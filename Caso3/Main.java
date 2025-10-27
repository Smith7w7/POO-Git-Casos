package Caso3;

import java.util.Scanner; 

class CuentaBancaria {
    private double saldo; 
    // Método para depositar dinero
    public void depositar(double monto) {
        saldo += monto;
    }
    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes."); // Mensaje si no hay saldo suficiente
        }
    }
    // Método para consultar el saldo
    public double getSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        CuentaBancaria cuenta = new CuentaBancaria(); 
        System.out.print("Monto a depositar: ");
        cuenta.depositar(sc.nextDouble()); // Guarda y deposita el monto
        System.out.print("Monto a retirar: ");
        cuenta.retirar(sc.nextDouble()); // Guarda y retira el monto
        System.out.println("Saldo final: " + cuenta.getSaldo()); 
        sc.close(); 
    }
}