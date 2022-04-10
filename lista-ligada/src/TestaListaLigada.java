public class TestaListaLigada {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("paulo");
        System.out.println(lista);
        lista.adicionaNoComeco("guilherme");
        System.out.println(lista);
        
        lista.adiciona("guilherme 2");
        System.out.println(lista);
        
        lista.adiciona("guilherme 3");
        System.out.println(lista);
        
        lista.adiciona("guilherme 4");
        System.out.println(lista);
        
        System.out.println(lista.contem("guilherme 4"));
        
        lista.adiciona(2, "guilherme 5");
        System.out.println(lista);
        
        lista.adiciona(5, "guilherme 6");
        System.out.println(lista);
        
        lista.remove(2);
        System.out.println(lista);
        
        System.out.println(lista.pega(2).getElemento());
        
    }
}