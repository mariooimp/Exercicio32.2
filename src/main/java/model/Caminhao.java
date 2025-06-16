package model;

import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Caminhao extends Veiculo {

    private int cargam;
    private int alturam;
    private int comprimento;

    public Caminhao() {
    }

    public Caminhao(int cargam, int alturam, int comprimento, int peso, int velom, float preco) {
        super(peso, velom, preco);
        this.cargam = cargam;
        this.alturam = alturam;
        this.comprimento = comprimento;
    }

    public int getCargam() {
        return cargam;
    }

    public void setCargam(int cargam) {
        this.cargam = cargam;
    }

    public int getAlturam() {
        return alturam;
    }

    public void setAlturam(int alturam) {
        this.alturam = alturam;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public void leitura() {
        super.leitura();
        setCargam(Integer.parseInt(JOptionPane.showInputDialog("Digite a Carga: ")));
        setAlturam(Integer.parseInt(JOptionPane.showInputDialog("Digite a Altura Max: ")));
        setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o Comprimento: ")));
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    @Override
    public String paraString() {
        return (super.paraString() + "\nCarga: " + getCargam() + "kg" + "\nAltura max: " + getCargam() + "m" + "\nComprimento: " + getComprimento() + "m");
    }
}
