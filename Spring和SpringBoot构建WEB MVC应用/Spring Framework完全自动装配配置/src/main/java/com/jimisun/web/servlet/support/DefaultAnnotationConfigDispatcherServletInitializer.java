package com.jimisun.web.servlet.support;

import com.jimisun.web.config.DispathcherConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DefaultAnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{DispathcherConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
