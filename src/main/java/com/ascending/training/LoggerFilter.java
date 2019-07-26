package com.ascending.training;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName = "loggerFilter")
public class LoggerFilter implements Filter {

    FilterConfig filterConfig = null;

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
            System.out.println(((HttpServletRequest) request).getServletPath());
            System.out.println("In LoggerFilter before doFilter");
            chain.doFilter(request, response);
            System.out.println("In LoggerFilter after doFilter");
    }

    public void init(FilterConfig fConfig) throws ServletException {
        this.filterConfig = fConfig;
    }

}
