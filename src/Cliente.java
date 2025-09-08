import java.time.Year;

public class Cliente {
    String email;
    String nome;
    int nasc_ano;

    Cliente(String email, String nome, int nasc_ano){
        this.email = email;
        this.nome = nome;
        this.nasc_ano = nasc_ano;
    }

    void registrarCliente(){
        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println("Cliente cadastrado é: " + nome + " o seu e-mail para contato é: " + email + " e seu ano de nascimento é: " + nasc_ano + " então sua idade aproximada é: " + calcularIdade());
    }
    public int calcularIdade(){
        int ano_atual = Year.now().getValue();
        return ano_atual - this.nasc_ano;

    }

}
