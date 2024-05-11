package FakeDB;

import java.time.LocalDate;
import java.util.HashMap;

import Dominio.ClasseProduto;

public class ClasseProdutoFakeDB extends BaseFakeDB<ClasseProduto>{

    @Override
    public HashMap<Long, ClasseProduto> getTabela() {
        if(this.tabela == null){
            this.tabela = new HashMap<>();
            this.CarregarDados();
        }
        return this.tabela;
    }

    @Override
    protected void CarregarDados() {
        this.tabela.put(1L, new ClasseProduto(1L, "Carnes", LocalDate.now()));
        this.tabela.put(2L, new ClasseProduto(2L, "Laticínios", LocalDate.now()));
        this.tabela.put(3L, new ClasseProduto(3L, "Padaria", LocalDate.now()));
        this.tabela.put(4L, new ClasseProduto(4L, "Farmácia", LocalDate.now()));
        this.tabela.put(5L, new ClasseProduto(5L, "Cosméticos", LocalDate.now()));
    }
}
