public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.dia = 04;
        data1.mes = "Junho";
        data1.ano = 2003;

        System.out.printf("%d de %s de %d\n", data1.dia,
                data1.mes,data1.ano);

        var data2 = new Data();
        data2.dia = 22;
        data2.mes = "Dezembro";
        data2.ano = 1989;
        System.out.printf("%d  de %s de %d", data2.dia,data2.mes,
                data2.ano);
    }
}
