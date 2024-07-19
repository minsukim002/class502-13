//package filters;
//
//import jakarta.servlet.*;
//
//import java.io.IOException;
//
//public class Board2Filter implements Filter {
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//
//        System.out.println("BoardFilter 전");
//
//        filterChain.doFilter(servletRequest, servletResponse);
//
//        System.out.println("BoardFilter 후");
//    }
//}
