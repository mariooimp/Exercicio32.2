package model;

import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class CarroPasseio extends Veiculo {

    private String cor;
    private String modelo;

    public CarroPasseio() {
    }

    public CarroPasseio(String cor, String modelo, int peso, int velom, float preco) {
        super(peso, velom, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void leitura() {
        super.leitura();
        setCor(JOptionPane.showInputDialog("Digite a cor: "));
        setModelo(JOptionPane.showInputDialog("Digite o modelo: "));
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    @Override
    public String paraString() {
        return (super.paraString() + "\nCor: " + getCor() + "\nModelo: " + getModelo());
    }
}
