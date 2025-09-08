public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro(1997, "JK Rowling", "Harry Potter e a Pedra Filosofal", 264, 35.48);
        Livro l2 = new Livro(1949, "George O.", "1984", 416, 60.00);

        l1.exibirLivros();
        l2.exibirLivros();

        l1.setPreco(50.00);
        l1.exibirLivros();

        Cliente n1 = new Cliente("estermadureira@gmail.com", "Ester", 2003);
        n1.registrarCliente();

    }
}
