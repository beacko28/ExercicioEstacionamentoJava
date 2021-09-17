/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

/**
 *
 * @author Beatriz
 */
public abstract class Carro {
    int codigo;
    String placa;
    int anoFabricacao;
    String modelo;
    boolean disponivel;
    String nomeVendedor;
    
    public boolean disponivel(){
        if (disponivel) {
            return true;
        } else {
            return false;
        }
    }
    
    public abstract void imprimeDados();
    
    public abstract boolean oferta(double valor);
    
    public boolean venderCarro(String vendedor, double valorVenda) {
       if(oferta(valorVenda)){
        disponivel = false;
        nomeVendedor = vendedor;
           System.out.println("Carro vendido por " + valorVenda + " pelo vendedor " + vendedor);
        return true;
       }
       if((!disponivel) || (!oferta(valorVenda))) {
           return false;
       }
       return false;
    } 
}
