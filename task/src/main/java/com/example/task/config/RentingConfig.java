package com.example.task.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Влад on 12.12.2015.
 */
@Configuration
@Import({ServiceConfig.class})
public class RentingConfig {
}
