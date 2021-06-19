package by.andervyd.standard_libraries.get_symbol_code;

public class Ex00 {
    public static void main(String[] args) {

        char symbol = 'B';
        int valSymbol = symbol;
        System.out.println(symbol + ":" + valSymbol);
        // >> B:66

        int valChar = 66;
        char charType = (char) valChar;
        System.out.println(valChar + ":" + charType);
        // >> 66:B
    }
}
