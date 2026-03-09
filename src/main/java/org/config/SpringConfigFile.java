package org.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfigFile {
  @Bean
          public Student stdId(){
    Student std= new Student();
  std.setName("Aditi");
  std.setEmail("raiaditi2018@gmail.com");
  std.setId(1);
  return std;
}
}
