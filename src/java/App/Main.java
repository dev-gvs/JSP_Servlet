package App;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Main")
public class Main extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Main() {
        super();
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("calc") != null) {
            Result result = null;
            try {
                double x = Double.parseDouble(req.getParameter("x"));
                if (x <= 4) {
                    double a = Double.parseDouble(req.getParameter("a"));
                    double y1 = ((a * a) / (x * x));
                    double y2 = (6 * x);
                    result = new Result((y1 + y2));
                } else {
                    double b = Double.parseDouble(req.getParameter("b"));
                    double y1 = b * b;
                    double y2 = ((4 + x) * (4 + x));
                    result = new Result((y1 * y2));
                }
            } catch (Exception e) {
            }
            req.setAttribute("result", result);
            req.getRequestDispatcher("/result.jsp").forward(req, resp);
        }
    }
}
