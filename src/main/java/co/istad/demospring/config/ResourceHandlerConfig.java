package co.istad.demospring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceHandlerConfig implements WebMvcConfigurer {
    @Value("${classpath.server}")
    private String classPathServer;

    @Value("${classpath.client}")
    private String classPathClient;

    @Value("${file.server}")
    private String fileServer;

    @Value("${file.client}")
    private String fileClient;


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // TODO
        // 1. Mapping URL for handling client
        // 2. Your location resource (classpath & filesystem)

        registry.addResourceHandler(classPathClient)
                .addResourceLocations(classPathServer);

        registry.addResourceHandler(fileClient)
                .addResourceLocations(fileServer);
    }
}
















