import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculadoraServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recupere os números do formulário
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        // Realize as operações matemáticas
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = (double) num1 / num2;
        int resto = num1 % num2;

        // Exiba os resultados
        response.getWriter().println("Número 1: " + num1);
        response.getWriter().println("Número 2: " + num2);
        response.getWriter().println("Soma: " + soma);
        response.getWriter().println("Subtração: " + subtracao);
        response.getWriter().println("Multiplicação: " + multiplicacao);
        response.getWriter().println("Divisão: " + divisao);
        response.getWriter().println("Resto da Divisão: " + resto);
    }
}
