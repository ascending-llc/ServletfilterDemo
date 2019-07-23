package com.ascending.training;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "authFilter", urlPatterns = {"/*"})
public class AuthFilter implements Filter {

    FilterConfig filterConfig = null;

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("In AuthFilter before doFilter");
        chain.doFilter(request, response);
        System.out.println("In AuthFilter after doFilter");
    }

    public void destroy() {
    }

    public void init(FilterConfig fConfig) throws ServletException {
        this.filterConfig = fConfig;
    }

}
