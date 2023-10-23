import java.io.IOException;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IdadeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recupere o ano de nascimento e a opção de aniversário do formulário
        int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
        String fezAniversario = request.getParameter("fezAniversario");

        // Obtém o ano atual
        Calendar calendario = Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);

        // Calcula a idade atual
        int idade = anoAtual - anoNascimento;

        // Se a pessoa não fez aniversário este ano, subtrai 1 da idade
        if ("nao".equals(fezAniversario)) {
            idade--;
        }

        // Exibe a idade calculada
        response.getWriter().println("Ano de Nascimento: " + anoNascimento);
        response.getWriter().println("Aniversário em " + (fezAniversario.equals("sim") ? "já fez" : "não fez") + " este ano.");
        response.getWriter().println("Idade Atual: " + idade + " anos");
    }
}
