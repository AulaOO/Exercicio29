/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio29;

/**
 *
 * @author Luis Guilherme
 */
public class ItemVenda implements Recebivel{
    
    private String produto;
    private int quantidade;
    private double pprecoUnitario;

    public ItemVenda() {
    }

    public ItemVenda(String produto, int quantidade, double pprecoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.pprecoUnitario = pprecoUnitario;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPprecoUnitario() {
        return pprecoUnitario;
    }

    public void setPprecoUnitario(double pprecoUnitario) {
        this.pprecoUnitario = pprecoUnitario;
    }
    
    
    
    public double totalizarRecita(){
        double d = 0;
        return d;
    }

    @Override
    public double totalizarReceita() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
