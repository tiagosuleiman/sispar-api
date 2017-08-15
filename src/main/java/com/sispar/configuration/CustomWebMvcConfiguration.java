package com.sispar.configuration;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class CustomWebMvcConfiguration extends WebMvcConfigurationSupport {

    protected void extendMessageConverters( List<HttpMessageConverter<?>> converters ) {

        for ( HttpMessageConverter<?> converter : converters ) {

            if ( converter instanceof MappingJackson2HttpMessageConverter ) {

                MappingJackson2HttpMessageConverter jacksonConverter = (MappingJackson2HttpMessageConverter) converter;

                jacksonConverter.setPrettyPrint( true );

            }

        }

    }

}