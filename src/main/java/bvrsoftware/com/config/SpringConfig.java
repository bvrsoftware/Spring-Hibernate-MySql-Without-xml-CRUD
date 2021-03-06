package bvrsoftware.com.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "bvrsoftware.com"})
public class SpringConfig implements WebMvcConfigurer{

	    @Bean
	   public InternalResourceViewResolver resolver() {
	      InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	      //resolver.setViewClass(JstlView.class);
	      resolver.setPrefix("/views/");
	      resolver.setSuffix(".jsp");
	      return resolver;
	   }
}
