class Data{
    int ano;
    int mes;
    int dia;
}

class Funcionario{
    String nome;
    String departamento;
    double salario;
    Data dataEntrada;
    String rg;

    void recebeAumento(double aumento){
        double novoSalario = this.salario + aumento;
        this.salario = novoSalario;
    }

    double calculaGanhoAnual(){
        double calculoAnual = this.salario * 12;

        return calculoAnual;
    }

    String formataData(){
        String dataFormatada = this.dataEntrada.dia + "/" + this.dataEntrada.mes + "/" + this.dataEntrada.ano;

        return dataFormatada;
    }

    void mostra(){
        System.out.println("nome: " + this.nome);
        System.out.println("departamento: " + this.departamento);
        System.out.println("data de entrada: " + this.formataData());
        System.out.println("salario: " + this.salario);
        System.out.println("ganho anual: " + this.calculaGanhoAnual());
    }
}

class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Data data = new Data();

        f1.nome = "Hugo";
        f1.salario = 100;
        f1.departamento = "vendas";
        data.dia = 22;
        data.mes = 11;
        data.ano = 1234;
        f1.dataEntrada = data;
        f1.recebeAumento(0);

        f1.mostra();

        Funcionario f2 = new Funcionario();

        f2.nome = "Marco";
        f2.salario = 200;
        f2.departamento = "rh";
        data.dia = 15;
        data.mes = 2;
        data.ano = 2223;
        f2.dataEntrada = data;
        f2.recebeAumento(110);

        f2.mostra();

        Funcionario f3 = new Funcionario();
        f3.nome = "Danilo";
        f3.salario = 100;

        Funcionario f4 = f3;

        if (f3 == f4) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

    }
}

