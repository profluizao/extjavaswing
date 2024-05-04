package Visao;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class InicialFrm extends JFrame {

    private JMenuBar menuBar;

    private JMenu arquivoMenu;
    private JMenu editarMenu;
    private JMenu ajudaMenu;

    public InicialFrm(){
        // Cria a barra de menu
        this.menuBar = new JMenuBar();

        // Configura o título da janela
        this.setTitle("Projeto Atacado - Versão Swing");

        // Configura o título e o tamanho da janela
        this.setMinimumSize(new Dimension(800, 600));

        // Centraliza a janela
        this.setLocationRelativeTo(null);

        // Configurar o comportamento ao fechar a janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void Exibir(){
        this.AdicionarMenuArquivo();
        this.AdicionarMenuEditar();
        this.AdicionarMenuAjuda();
        this.setJMenuBar(menuBar);
    }

    private void AdicionarMenuArquivo(){
        this.arquivoMenu = new JMenu("Arquivo");
        JMenuItem abrirMenu = new JMenuItem("Abrir");
        JMenuItem sairMenu = new JMenuItem("Sair");
        abrirMenu.addActionListener(e -> JOptionPane.showMessageDialog(this, "Abrindo arquivo..."));
        sairMenu.addActionListener(e -> System.exit(0));
        this.arquivoMenu.add(abrirMenu);
        this.arquivoMenu.add(sairMenu);
        this.menuBar.add(arquivoMenu);
    }

    private void AdicionarMenuEditar(){
        this.editarMenu = new JMenu("Editar");
        JMenuItem copiarMenuItem = new JMenuItem("Copiar");
        JMenuItem colarMenuItem = new JMenuItem("Colar");
        copiarMenuItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Copiando..."));
        colarMenuItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Colando..."));
        this.editarMenu.add(copiarMenuItem);
        this.editarMenu.add(colarMenuItem);
        this.menuBar.add(editarMenu);
    }

    private void AdicionarMenuAjuda(){
        this.ajudaMenu = new JMenu("Ajuda");
        JMenuItem sobreMenuItem = new JMenuItem("Sobre");
        sobreMenuItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Aplicativo desenvolvido em Java Swing."));
        this.ajudaMenu.add(sobreMenuItem);
        this.menuBar.add(ajudaMenu);
    }
}
