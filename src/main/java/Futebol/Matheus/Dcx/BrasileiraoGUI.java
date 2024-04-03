package Futebol.Matheus.Dcx;

import javax.swing.*;
import java.awt.*;

public class BrasileiraoGUI extends JFrame {

    JLabel linha1,linha2,linha3,linha4;
    ImageIcon brasileirao;
    //ImageIcon brasileiraoImg = new ImageIcon("./imgs/brasileirao.png");
    ImageIcon addImg = new ImageIcon("./imgs/icons/add_jogador.png");
    ImageIcon pesqImg = new ImageIcon("./imgs/icons/search_jogador.png");
    ImageIcon removeImg = new ImageIcon("./imgs/icons/remove_jogador.png");
    ImageIcon listarImg = new ImageIcon("./imgs/icons/lista3.png");
    JButton botaoAdicionar, botaoPesquisar, botaoRemover, botaoListar;
    SistemaCampeonato campeonato = new CampeonatoBrasileiro();



    public BrasileiraoGUI(){

        brasileirao = new ImageIcon("./imgs/brasileirao.png");

        Image imagemOriginal = brasileirao.getImage();
        Image imagemRedimensionada = imagemOriginal.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        brasileirao = new ImageIcon(imagemRedimensionada);

        setTitle("Brasileirão Série A");
        setSize(900,700);
        setLocation(150,150);
        setResizable(false);
        getContentPane().setBackground(Color.blue);
        linha1 = new JLabel("Brasileirão Série A", JLabel.CENTER);
        linha1.setForeground(Color.BLACK);
        linha1.setFont(new Font("Serif",Font.ITALIC,40));
        linha2 = new JLabel(brasileirao, JLabel.CENTER);
        linha3 = new JLabel("2024", JLabel.CENTER);
        linha3.setForeground(Color.BLACK);
        linha3.setFont(new Font("Serif",Font.ITALIC,40));
        //linha4 = new JLabel(brasileirao, JLabel.CENTER);
        botaoAdicionar = new JButton("Adicionar",addImg);
        botaoAdicionar.addActionListener(new CampeonatoAddController(campeonato, this));
        botaoPesquisar = new JButton("Pesquisar", pesqImg);
        botaoPesquisar.addActionListener(new CampeonatoSearchController(campeonato, this));
        botaoRemover = new JButton("Remover", removeImg);
        botaoRemover.addActionListener(new CampeonatoRemoveController(campeonato, this));
        botaoListar = new JButton("Listar", listarImg);
        botaoListar.addActionListener(new CampeonatoListarController((CampeonatoBrasileiro) campeonato,this));
        getContentPane().setLayout(new GridLayout(4,2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(linha2);
        getContentPane().add(botaoListar);
        getContentPane().add(linha3);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);
    }

    public static void main(String [] args){
        JFrame janela = new BrasileiraoGUI();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
