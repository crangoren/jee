import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Shop", urlPatterns = "/show_page")
public class Shop extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
        for (int i = 1; i < 11; i++) {
            Product product = new Product(i, "Product" + i, Math.random() * 1000000);
            resp.getWriter().printf(i + "&nbsp" + product.getName() + "&nbsp" + " - " + product.getCost() + "&nbsp" + "<br>");
        }
        resp.getWriter().printf("</body></html>");
        resp.getWriter().close();
    }
}
