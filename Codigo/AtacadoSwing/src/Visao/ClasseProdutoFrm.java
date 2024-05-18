package Visao;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTable;

public class ClasseProdutoFrm extends JFrame {

    private JTable tabela;

    public ClasseProdutoFrm(){
        this.setTitle("Classes de Produto");
        this.setSize(new Dimension(800,600));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void Exibir(){
        this.tabela = new JTable();
        this.tabela.setBounds(30, 40, 200, 300);

    }

    private void PrepararDados(){
        ClasseProdutoServico servico = new ClasseProdutoServico();
    }
    
}