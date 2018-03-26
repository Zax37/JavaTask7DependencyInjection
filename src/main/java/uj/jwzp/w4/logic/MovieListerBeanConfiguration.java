package uj.jwzp.w4.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

@Configuration
public class MovieListerBeanConfiguration {
    @Autowired
    private Environment environment;

    @Bean
    @Scope("prototype")
    public String fileName() {
        return environment.getProperty("fileName");
    }

    @Bean
    @Scope("prototype")
    public MovieFinder finder(String fileName) {
        return new CSVMovieFinder(fileName);
    }
}
