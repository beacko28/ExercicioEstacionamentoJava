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
public class CarroConsignado extends Carro{
    String nomeProprietario;
    double valorDesejado;

    @Override
    public boolean oferta(double valor) {
        double valorComparacao = (valorDesejado + valorDesejado * 0.05);
        if ((valor > valorComparacao) && (disponivel)) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void imprimeDados() {
        codigo = 213;
        placa = "MKA-4162";
        modelo = "BMW X1";
        anoFabricacao = 2018;
        System.out.println("Codigo: "+codigo);
        System.out.println("Modelo: "+modelo);
        System.out.println("Placa: "+placa);
        System.out.println("Status: "+disponivel);
        System.out.println("Ano de Fabricação: "+anoFabricacao);
    }
}
