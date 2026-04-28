import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class estjava2 extends HttpServlet {

    @Override
    public void init() throws ServletException {
        
        System.out.println("Servlet initialized");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        resp.getWriter().println("<html><body><h1>Hello from Servlet!</h1></body></html>");
    }

    @Override
    public void destroy() {
       
        System.out.println("Servlet destroyed");
    }
}
