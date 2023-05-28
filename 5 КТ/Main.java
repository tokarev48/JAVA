import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        double result = evaluateEquation(equation);
        System.out.println(result);
    }

    public static double evaluateEquation(String equation) {
        double result = 0.0;
        try {
            result = eval(equation);
            saveEquation(equation, result); // Сохранение уравнения и результата
        } catch (Exception e) {
            System.out.println("Ошибка при вычислении уравнения: " + equation);
        }
        return result;
    }

    public static double eval(String equation) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < equation.length()) ? equation.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ')
                    nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < equation.length())
                    throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if (eat('+'))
                        x += parseTerm();
                    else if (eat('-'))
                        x -= parseTerm();
                    else
                        return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if (eat('*'))
                        x *= parseFactor();
                    else if (eat('/'))
                        x /= parseFactor();
                    else if (eat('%'))
                        x %= parseFactor();
                    else if (eat('^'))
                        x = Math.pow(x, parseFactor());
                    else
                        return x;
                }
            }

            double parseFactor() {
                if (eat('+'))
                    return parseFactor();
                if (eat('-'))
                    return -parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    StringBuilder sb = new StringBuilder();
                    while ((ch >= '0' && ch <= '9') || ch == '.') {
                        sb.append((char) ch);
                        nextChar();
                    }
                    x = Double.parseDouble(sb.toString());
                } else if (ch == '|') {
                    eat('|');
                    x = parseExpression();
                    eat('|');
                    x = Math.abs(x);
                } else if (ch >= 'a' && ch <= 'z') {
                    StringBuilder sb = new StringBuilder();
                    while (ch >= 'a' && ch <= 'z') {
                        sb.append((char) ch);
                        nextChar();
                    }
                    String func = sb.toString();
                    x = parseFactor();
                    if (func.equals("sqrt"))
                        x = Math.sqrt(x);
                    else if (func.equals("sin"))
                        x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos"))
                        x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan"))
                        x = Math.tan(Math.toRadians(x));
                    else
                        throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^'))
                    x = Math.pow(x, parseFactor());

                return x;
            }
        }.parse();
    }

    public static void saveEquation(String equation, double result) {
        try {
            FileWriter writer = new FileWriter("history.txt", true);
            writer.write(equation + " = " + result + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении уравнения: " + equation);
        }
    }
}