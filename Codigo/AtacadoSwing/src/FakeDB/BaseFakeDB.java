package FakeDB;

import java.util.HashMap;

public abstract class BaseFakeDB<TDominio> {
    
    protected HashMap<Long, TDominio> tabela;

    public abstract HashMap<Long, TDominio> getTabela();

    public BaseFakeDB(){
        this.tabela = new HashMap<>();
    }

    protected abstract void CarregarDados();
}
