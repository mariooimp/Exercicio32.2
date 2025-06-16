package model;

import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Veiculo {
    private int peso;
    private int velom;
    private float preco;

    public Veiculo() {
    }

    public Veiculo(int peso, int velom, float preco) {
        this.peso = peso;
        this.velom = velom;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelom() {
        return velom;
    }

    public void setVelom(int velom) {
        this.velom = velom;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void leitura() {
        setPeso(Integer.parseInt(JOptionPane.showInputDialog("Digite o Peso: ")));
        setVelom(Integer.parseInt(JOptionPane.showInputDialog("Digite a Velocidade Max: ")));
        setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o Preço: ")));
    }
    
    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }
    
    public String paraString() {
        return ("DADOS:" + "\nPreço: " + getPreco() + "\nVelo. MAX: " + getVelom() + "\nPeso: " + getPeso());
    }
}
