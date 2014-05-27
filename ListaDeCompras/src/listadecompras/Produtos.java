package listadecompras;

public class Produtos {

    String vegetais, frutas, embutidos, industrializados;

    public String produtos() {
        String ListaCompleta = ("Sua Lista contém " + "\n" + vegetais + "\n" + frutas
                + "\n" + embutidos + "\n" + industrializados);

        return (ListaCompleta);
    }

}
