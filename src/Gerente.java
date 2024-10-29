class Gerente extends Usuario {
    @Override
    public void exibirMenu() {
        System.out.println("1. Vender");
        System.out.println("2. Imprimir comprovante");
        System.out.println("3. Cadastrar vendedor");
        System.out.println("4. Cadastrar produto");
    }
}
