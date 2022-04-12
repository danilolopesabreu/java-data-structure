public class TesteDeConjunto {

    public static void main(String[] args) {

        Conjunto conjunto = new Conjunto();
        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);
    }
}