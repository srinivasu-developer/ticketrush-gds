package com.ticketrush.gds.theatre.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "datasource")
public class DataSourceConfiguration {

    // datasource bean configurations goes here
}
