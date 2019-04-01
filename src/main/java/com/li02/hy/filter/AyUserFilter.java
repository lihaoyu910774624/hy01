package com.li02.hy.filter;

/*
 *@Author: lihaoyu
 *@Date:2019/3/8,13:43
 *@Description:
 *@Modified:
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "AyUserFilter",urlPatterns = "/*")
public class AyUserFilter implements Filter {
    /** logger */
    private final static Logger logger = LoggerFactory.getLogger(AyUserFilter.class);



    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter********************>>>>init");
        logger.info("《《《《《《《《《《loginfo出品》》》》》》》》》》");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       System.out.println("filter*******************>>>>>>>dofilter");
       filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("filter********************>>>>destory");
    }
}
