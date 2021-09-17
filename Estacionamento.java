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
public class Estacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarroProprio cp = new CarroProprio(350000, "05/05/2021");
        cp.disponivel = true;
        System.out.println(cp.disponivel());
        System.out.println(cp.venderCarro("Joao", 450000));
        System.out.println(cp.disponivel());
        cp.imprimeDados();
        
        CarroConsignado cc = new CarroConsignado();
        cc.valorDesejado = 35000;
        cc.nomeProprietario = "Marcos Roberto";
        cc.disponivel = true;
        System.out.println(cc.disponivel());
        System.out.println(cc.venderCarro("Felipe", 45000));
        System.out.println(cc.disponivel());
        cc.imprimeDados();
    }
    
}
