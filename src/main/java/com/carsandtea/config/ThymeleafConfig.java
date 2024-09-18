package com.carsandtea.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.FileTemplateResolver;

/*
This is the default Thymeleaf config. The app works without this class.
 */
@Configuration
public class ThymeleafConfig {

    private static final String TEMPLATE_SOURCE = "./src/main/resources/templates/";

    @Bean
    public SpringTemplateEngine thymeleafTemplateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        FileTemplateResolver viewResolver = createTemplateResolver(ThymeleafConfig.TEMPLATE_SOURCE);
        viewResolver.setCheckExistence(true);
        templateEngine.setTemplateResolver(viewResolver);
        return templateEngine;
    }

    private FileTemplateResolver createTemplateResolver(String prefix) {
        FileTemplateResolver templateResolver = new FileTemplateResolver();
        templateResolver.setPrefix(prefix);
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCacheable(true);
        templateResolver.setCharacterEncoding("UTF-8");
        return templateResolver;
    }
}
