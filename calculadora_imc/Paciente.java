public class Paciente {
    double peso;
    double altura;
    

    public Paciente(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

    double calcularIMC(){
        return peso / (altura * altura);
    }

    String diagnostico(){
        double imc = calcularIMC();

        if (imc < 16.00){
            return "Baixo peso muito grave";
        } else if (imc > 16.00 && imc < 16.99){
            return "Baixo peso grave";
        } else if (imc > 17.00 && imc < 18.49){
            return "Baixo peso";
        } else if (imc > 18.50 && imc < 24.99){
            return "Peso normal";
        } else if (imc > 25.00 && imc < 29.99){
            return "Sobrepeso";
        } else if (imc > 30.00 && imc < 34.99){
            return "Obesidade grau I";
        } else if (imc > 35.00 && imc < 39.99){
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (obesidade mórbida)";
        }
    }
}