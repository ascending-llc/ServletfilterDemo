package com.ascending.training;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "loggerFilter")
public class LoggerFilter implements Filter {

    FilterConfig filterConfig = null;

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
            System.out.println("In LoggerFilter before doFilter");
            chain.doFilter(request, response);
            System.out.println("In LoggerFilter after doFilter");
    }

    public void init(FilterConfig fConfig) throws ServletException {
        this.filterConfig = fConfig;
    }

}
