public class Contador {
    public static void main(String[] args) throws InvalidParametersException {
        int parameter1 = IO.getInt("Digite o primeiro parâmetro:");
        int parameter2 = IO.getInt("Digite o segundo parâmetro:");

        if (parameter1 < parameter2) {
            throw new InvalidParametersException("Primeiro parâmetro deve ser menor que o segundo.");
        }
    }
}
