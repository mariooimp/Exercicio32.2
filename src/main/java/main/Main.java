package main;

import javax.swing.JOptionPane;
import model.Caminhao;
import model.CarroPasseio;
import model.Veiculo;

/**
 *
 * @author mario
 */
public class Main {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo();
        CarroPasseio cp1 = new CarroPasseio();
        Caminhao c1 = new Caminhao();
        
        int controle = -1;
        while (controle != 0) {
            controle = Integer.parseInt(JOptionPane.showInputDialog("1 - preencher carro passeio" + 
                    "\n2 - preencher caminhao" + "\n3 - preencher veiculo" + "\n4 - imprimir carro passeio" + 
                    "\n5 - imprimir caminhao" + "\n6 - imprimir veiculo" + "\n0 - sair"));
            
            switch (controle) {
                case 1:
                    cp1.leitura();
                    break;
                    
                case 2:
                    c1.leitura();
                    break;
                    
                case 3:
                    v1.leitura();
                    break;
                    
                case 4:
                    cp1.imprimir();
                    break;
                    
                case 5:
                    c1.imprimir();
                    break;
                    
                case 6:
                    v1.imprimir();
                    break;
            }
        }
    }
}
