class Vendedor extends Usuario {
    @Override
    public void exibirMenu() {
        System.out.println("1. Vender");
        System.out.println("2. Imprimir comprovante");
    }
}
