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
public class CarroProprio extends Carro {
    double valorCompra;
    String dataCompra;

    public CarroProprio(double valorCompra, String dataCompra) {
        this.valorCompra = valorCompra;
        this.dataCompra = dataCompra;
    }
    
    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    @Override
    public boolean oferta(double valor) {
        double valorComparacao = (valorCompra + valorCompra * 0.1);
        if ((valor > valorComparacao) && (disponivel)) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void imprimeDados() {
        codigo = 351;
        placa = "PLA-4125";
        modelo = "BMW I3";
        anoFabricacao = 2019;
        System.out.println("Valor da compra: "+valorCompra);
        System.out.println("Data da compra: "+dataCompra);
        System.out.println("Código: "+codigo);
        System.out.println("Modelo: "+modelo);
        System.out.println("Placa: "+placa);
        System.out.println("Disponível: "+disponivel);
        System.out.println("Ano de Fabricação: "+anoFabricacao);
    }
}
