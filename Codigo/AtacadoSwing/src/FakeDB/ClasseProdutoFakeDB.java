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

    public ClasseProdutoFakeDB(){
        super();
    }

    @Override
    protected void CarregarDados() {
        this.tabela.put(1L, new ClasseProduto(1510L, "Carnes", LocalDate.now()));
        this.tabela.put(2L, new ClasseProduto(1525L, "Laticínios", LocalDate.now()));
        this.tabela.put(3L, new ClasseProduto(1634L, "Padaria", LocalDate.now()));
        this.tabela.put(4L, new ClasseProduto(1642L, "Farmácia", LocalDate.now()));
        this.tabela.put(5L, new ClasseProduto(1751L, "Cosméticos", LocalDate.now()));
    }
}
