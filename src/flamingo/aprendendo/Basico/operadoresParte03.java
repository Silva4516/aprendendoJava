package flamingo.aprendendo.Basico;

public class operadoresParte03 {
    public static void main(String[] args) {
        /*
        *|| or -> ou
        * ! not -> nao
        * && and -> E
         */

        byte idade = 127;
        boolean isCNH = true;

        boolean isEstaNaLeiParaDirigir = idade >= 18 && isCNH == true;

        System.out.println(isEstaNaLeiParaDirigir);
    }
}
