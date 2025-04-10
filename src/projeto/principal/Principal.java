package projeto.principal;

import projeto.ConsultaCep;
import projeto.Endereco;

public class Principal {
    public static void main(String[] args) {
        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco("03928235");
        System.out.println(novoEndereco);
    }
}
