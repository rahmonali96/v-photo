package com.example.vphoto.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Developed by Rahmonali Yoqubov
 * Email: rahmonaliyoqubov@gmail.com
 * Date: 20.10.2022
 * Project: v-photo
 */
@Component
public class SecurityFilter extends GenericFilter {
//    private static final Logger logger = LogManager.getLogger(SecurityFilter.class);
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        logger.info("Security filter is working");
        boolean hasAccess = false;
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String header = httpServletRequest.getHeader("v-photo");
        if (header != null) {
            if (header.equals("998916774162")) {
                hasAccess = true;
            }
        }

        if (hasAccess) {
            chain.doFilter(request, response);
        }else {
            HttpServletResponse httpServletResponse = (HttpServletResponse) response;
            httpServletResponse.sendError(401);
        }
    }
}
