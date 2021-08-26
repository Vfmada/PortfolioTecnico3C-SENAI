/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhobd_12.pkg07;

/**
 *
 * @author vfmad
 */
public class Rota {
    //Criando atributos:
    int codRota;
    String nomeRota;
    int qtdTorres;

    //Métodos get e set:
    public int getCodRota() {
        return codRota;
    }

    public void setCodRota(int codRota) {
        this.codRota = codRota;
    }

    public String getNomeRota() {
        return nomeRota;
    }

    public void setNomeRota(String nomeRota) {
        this.nomeRota = nomeRota;
    }

    public int getQtdTorres() {
        return qtdTorres;
    }

    public void setQtdTorres(int qtdTorres) {
        this.qtdTorres = qtdTorres;
    }   
}
