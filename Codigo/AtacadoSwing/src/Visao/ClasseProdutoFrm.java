package Visao;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Dominio.ClasseProduto;
import Servico.ClasseProdutoServico;

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
        ClasseProdutoServico servico = new ClasseProdutoServico();
        ArrayList<ClasseProduto> lista = servico.Browse();
        DefaultTableModel mod = new DefaultTableModel(
            new Object[][]{}, 
            new String[]{"Código", "Nome da Classe", "Data de Inclusão"}
        ){
            boolean[] canEdit = new boolean[]{false, false};
            
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return canEdit[columnIndex];
            }
        };

        for (ClasseProduto classe : lista) {
            mod.addRow(new Object[]{
                classe.getCodigo(), 
                classe.getNome(), 
                classe.getDataDeInclusao()}
            );
        }
        this.tabela.setModel(mod);
        JScrollPane painel = new JScrollPane(this.tabela);
        this.add(painel);
        this.setVisible(true);
    }
}