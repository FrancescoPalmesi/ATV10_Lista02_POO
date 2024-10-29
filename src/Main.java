public class Main {
    public static void main(String[] args) {
        Usuario vendedor = new Vendedor();
        Usuario gerente = new Gerente();
        Usuario diretor = new Diretor();

        System.out.println("Menu Vendedor:");
        vendedor.exibirMenu();

        System.out.println("\nMenu Gerente:");
        gerente.exibirMenu();

        System.out.println("Menu Diretor:");
        diretor.exibirMenu();

        System.out.println("\nRelatórios:");
        diretor.emitirRelatorio();
        diretor.emitirRelatorio("ProdutoA");
        diretor.emitirRelatorio("ProdutoA", "ClienteB");
        diretor.emitirRelatorio("ProdutoA", "ClienteB", "VendedorC");

    }
}
