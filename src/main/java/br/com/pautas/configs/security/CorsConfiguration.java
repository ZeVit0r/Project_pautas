// package br.com.pautas.configs.security;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.EnableWebMvc;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @EnableWebMvc
// @Configuration
// public class CorsConfiguration implements WebMvcConfigurer {

//     @Override
//     public void addCorsMappings(CorsRegistry registry) {
//         registry.addMapping("/**")
//             .allowedOrigins("http://localhost:3000")
//             .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS",  "HEAD", "TRACE", "CONNECT")
//             .allowedHeaders("Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
//                         "Access-Control-Request-Headers")
//                 .exposedHeaders("Access-Control-Request-Headers", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials")
//                 .allowCredentials(true).maxAge(3600);
//     }
// }