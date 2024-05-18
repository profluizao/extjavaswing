package Servico;

import java.util.ArrayList;

import Dominio.ClasseProduto;
import Repositorio.ClasseProdutoRepositorio;

public class ClasseProdutoServico extends BaseServico<ClasseProdutoRepositorio, ClasseProduto> {

    public ClasseProdutoServico(){
        this.repo = new ClasseProdutoRepositorio();
    }

    @Override
    public ArrayList<ClasseProduto> Browse() {
        return this.repo.ReadAllAsArrayList();
    }

    @Override
    public ClasseProduto Read(Long chave) {
        return this.repo.Read(chave);
    }

    @Override
    public ClasseProduto Edit(Long chave, ClasseProduto instancia) {
        return this.repo.Update(chave, instancia);
    }

    @Override
    public ClasseProduto Add(ClasseProduto instancia) {
        return this.repo.Create(instancia);
    }

    @Override
    public ClasseProduto Delete(Long chave) {
        return this.repo.Delete(chave);
    }
    
}
