package Repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Dominio.ClasseProduto;
import FakeDB.ClasseProdutoFakeDB;

public class ClasseProdutoRepositorio
    extends BaseRepositorio<ClasseProdutoFakeDB, ClasseProduto>
    implements IBaseRepositorio<ClasseProdutoFakeDB, ClasseProduto>
{
    public ClasseProdutoRepositorio(){
        this.fakeDB = new ClasseProdutoFakeDB();
        this.dados = this.fakeDB.getTabela();
    }

    @Override
    public ClasseProduto Create(ClasseProduto instancia) {
        Long posicao = Long.valueOf(this.dados.size()) - 1;
        Long novaPosicao = posicao + 1;
        Long novaChave = this.Read(posicao).getCodigo() + 1;
        instancia.setCodigo(novaChave);
        this.dados.put(novaPosicao, instancia);
        return instancia;
    }

    @Override
    public ClasseProduto Read(Long chave) {
        if (this.dados.containsKey(chave)){
            return this.dados.get(chave);
        }
        else{
            return null;
        }
    }

    @Override
    public List<ClasseProduto> ReadAll() {
        ArrayList<ClasseProduto> lista = new ArrayList<>();
        for(Map.Entry<Long, ClasseProduto> par : this.dados.entrySet()){
            lista.add(par.getValue());
        }
        return lista;
    }

    @Override
    public ClasseProduto Update(Long chave, ClasseProduto instancia) {
        if (this.dados.containsKey(chave)){
            ClasseProduto objVelho = this.dados.get(chave);
            if (this.dados.replace(chave, objVelho, instancia)){
                return instancia;
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }
    }

    @Override
    public ClasseProduto Delete(Long chave) {
        if (this.dados.containsKey(chave)){
            ClasseProduto apagado = this.dados.remove(chave);
            return apagado;
        }
        else{
            return null;
        }
    }    
}
