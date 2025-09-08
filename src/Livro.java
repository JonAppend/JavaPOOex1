public class Livro {
    public int ano;
    public String autor;
    public String titulo;
    public int numero_pag;
    public double preco;
    public double novoPreco;

    public Livro(int ano, String autor, String titulo, int numero_pag, double preco){
        this.ano = ano;
        this.autor = autor;
        this.titulo = titulo;
        this.numero_pag = numero_pag;
        this.preco = preco;
        System.out.println("O livro "  + titulo +  " foi registrado com sucesso.");
    }
    void exibirLivros(){
        System.out.println("O titulo do Livro é: " + titulo + " O autor é: " + autor + " lançado em: " + ano + " e o numero de páginas é: " + numero_pag + " e o preço é: R$ " + preco);
    }
    void setPreco(double novoPreco){
        if (novoPreco > 0){
            System.out.println("------------------------------");
            System.out.println("PREÇO ALTERADO COM SUCESSO");
            this.preco = novoPreco;
        }else{
            System.out.println("Digite um valor positivo, não será aceito valores negativos.");
        }
    }


}
