import java.util.*;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;
    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(idade, nome, altura));
    }

    public List<Pessoa> ordanacaoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public String ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura.toString();
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 21, 1.67);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 22, 1.78);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 23, 1.89);

        System.out.println(ordenacaoPessoa.ordanacaoPorIdade());
        System.out.printf(ordenacaoPessoa.ordenarPorAltura());

    }

}
