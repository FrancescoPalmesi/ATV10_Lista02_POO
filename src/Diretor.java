class Diretor extends Usuario {
    @Override
    public void exibirMenu() {
        System.out.println("1. Vender");
        System.out.println("2. Imprimir comprovante");
        System.out.println("3. Cadastrar vendedor");
        System.out.println("4. Cadastrar produto");
        System.out.println("5. Gerenciar financeiro");
        System.out.println("6. Emitir relatório");
    }

    // Sobrecarga do método emitirRelatorio
    public void emitirRelatorio() {
        System.out.println("Emitindo relatório genérico");
    }

    public void emitirRelatorio(String produto) {
        System.out.println("Emitindo relatório com filtro por produto: " + produto);
    }

    public void emitirRelatorio(String produto, String cliente) {
        System.out.println("Emitindo relatório com filtro por produto: " + produto + " e cliente: " + cliente);
    }

    public void emitirRelatorio(String produto, String cliente, String vendedor) {
        System.out.println("Emitindo relatório com filtro por produto: " + produto + ", cliente: " + cliente + " e vendedor: " + vendedor);
    }
}
