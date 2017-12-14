package ru.netcracker.config.webconfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import ru.netcracker.config.ServiceConfig;



public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

                @Override
            protected Class<?>[] getRootConfigClasses() {
                return new Class[] {ServiceConfig.class};
                //AppSecurityConfig.class

            }
            // Тут добавляем конфигурацию, в которой инициализируем ViewResolver
            @Override
            protected Class<?>[] getServletConfigClasses() {
                return new Class<?>[]{
                        WebConfig.class
                };
            }

            @Override
            protected String[] getServletMappings() {
                return new String[]{"/"};
            }

          /*  AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
            context.setConfigLocation("ru.netcracker.config");
            servletContext.addListener(new ContextLoaderListener(context));
            ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
            dispatcher.setLoadOnStartup(1);
            dispatcher.addMapping("/");*/
        }


