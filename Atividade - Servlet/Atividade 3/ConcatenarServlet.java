import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConcatenarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String estadoCivil = request.getParameter("estadoCivil");
        String faixaEtaria = request.getParameter("faixaEtaria");

        // Concatena os dados
        String dadosConcatenados = "Nome: " + nome + "<br>" +
                                  "Estado Civil: " + estadoCivil + "<br>" +
                                  "Faixa Etária: " + faixaEtaria;

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Dados Concatenados</h1>");
        response.getWriter().println(dadosConcatenados);
        response.getWriter().println("</body></html>");
    }
}
