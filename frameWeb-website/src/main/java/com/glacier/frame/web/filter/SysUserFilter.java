package com.glacier.frame.web.filter;

import java.util.Arrays;
import org.apache.shiro.web.filter.PathMatchingFilter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-15
 * <p>Version: 1.0
 */
public class SysUserFilter extends PathMatchingFilter {

    //@Autowired
    //private UserService userService;

    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
    	System.out.println("hhahahahaha");
    	System.out.println("url matches,config is " + Arrays.toString((String[])mappedValue));  
        //String username = (String)SecurityUtils.getSubject().getPrincipal();
        //request.setAttribute(Constants.CURRENT_USER, userService.findByUsername(username));
        return true;
    }
}
