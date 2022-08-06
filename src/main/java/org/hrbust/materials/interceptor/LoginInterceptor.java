package org.hrbust.materials.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        作用是在处理器方法执行之前去执行，第三个参数，Object，代表拦截的处理器方法，实际的类型叫HandleMethod，是Method的子类，SpringMVC自己定义的
//        返回值Boolean类型，如果返回true，是放行，下面是处理器就执行处理器，下面是拦截器就执行拦截器，按照拦截器的声明顺序依次执行preHandle方法
//        在这判断用户是否登录
        HttpSession session = request.getSession();
        System.out.println("1"+session.getAttribute("adname"));
        System.out.println("2"+session.getAttribute("pass"));
        if(session.getAttribute("adname") !=null)
        {
            return true;
        }
        else
        {
            response.sendRedirect("http://localhost:2020/index.jsp");
//           request.getContextPath() 得到当前应用程序根目录，不加会在服务器根目录去找
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,@Nullable ModelAndView modelAndView) throws Exception {
//       作用是在处理器方法执行之后去执行，执行顺序是：处理器代码执行完之后，执行这个方法，多于一个拦截器时，从最后一个拦截器开始，执行倒数第二个...以此类推
//        按照拦截器声明顺序的倒序来执行postHandle
//        参数：多了个ModelAndView，前面注解NullAble可写可不写，是Spring提供的，如果是空的会报警告
        //如果使用序列化，不会解析视图和渲染视图，也就不会进入postHandle和afterCompletion这两个
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        作用是视图渲染完毕之后，发送到客户端之前执行，执行顺序是：渲染完毕了，发送到客户端之前，把这个过程叫一次请求完成，执行这个方法，也是从声明顺序的倒序执行
//        参数Exception前面的异常都能捕捉到，也有NullAble注解
    }
}







