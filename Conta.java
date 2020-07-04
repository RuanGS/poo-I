/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconta;

/**
 *
 * @author ruang
 */
public class Conta {
    public String nomeTitular;
    public int numero;
    public String agencia;
    public double saldo;
    private double rendimento;
    public String dataAbertura;
    public void saque(double valor){
        
        saldo = saldo - valor;
    }
    public void deposito(double valor){
        saldo = saldo + valor;
    }
    private double calculaRendimento(){
          rendimento = saldo*0.02 ;
        return rendimento ;
    }
    public void mostraDados(){
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Numero: " + numero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Criada em: " + dataAbertura);
        System.out.println("Saldo: " + saldo);
        System.out.println("Rendimento em 2%: " + calculaRendimento());
        System.out.println("_________________________");
    }
}
