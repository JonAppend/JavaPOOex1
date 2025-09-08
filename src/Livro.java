public class Livro {
    public int ano;
    public String autor;
    public String titulo;
    public int numero_pag;
    public double preco;

    public Livro(int ano, String autor, String titulo, int numero_pag, double preco){
        this.ano = ano;
        this.autor = autor;
        this.titulo = titulo;
        this.numero_pag = numero_pag;
        this.preco = preco;
        System.out.println("O livro "  + titulo +  " foi registrado com sucesso.");

    }


}
