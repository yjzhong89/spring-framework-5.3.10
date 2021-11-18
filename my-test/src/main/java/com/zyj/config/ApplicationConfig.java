package com.zyj.config;

import com.zyj.selector.MyImportSelector;
import com.zyj.service.UserService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;

@ComponentScan("com.zyj")
@Configuration
//@Import({MyImportSelector.class})
//@Import({UserService.class})
public class ApplicationConfig {

}
