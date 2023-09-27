import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConcatenarDadosServlet")
public class ConcatenarDadosServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtém os parâmetros do formulário
        String nome = request.getParameter("nome");
        String estadoCivil = request.getParameter("estadoCivil");
        String faixaEtaria = request.getParameter("faixaEtaria");

        // Concatena os dados
        String resultado = "Nome: " + nome + ", Estado Civil: " + estadoCivil + ", Faixa Etária: " + faixaEtaria;

        // Define o resultado como atributo para a página JSP
        request.setAttribute("resultado", resultado);

        // Encaminha para a página JSP de resultado
        request.getRequestDispatcher("/resultado.jsp").forward(request, response);
    }
}
