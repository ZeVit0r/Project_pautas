// package br.com.pautas.configs.security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.http.HttpMethod;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.cors.CorsConfigurationSource;
// import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

// import br.com.pautas.services.UserDetailsServiceImpl;

// @EnableWebSecurity
// public class JWTConfiguration extends WebSecurityConfigurerAdapter {
    
//     private final UserDetailsServiceImpl userDetailsService;

//     public JWTConfiguration(UserDetailsServiceImpl userDetailsService, PasswordEncoder passwordEncoder) {
//         this.userDetailsService = userDetailsService;
//     }

//     @Override
//     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//         auth.userDetailsService(userDetailsService)
//             .passwordEncoder(passwordEncoder());
//     }

//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http
//             .csrf().disable()
//             .authorizeRequests()
//                 .antMatchers(HttpMethod.POST, "/login").permitAll()
//                 .antMatchers(HttpMethod.POST, "/users").permitAll()
//                 .antMatchers(HttpMethod.GET, "/**").permitAll()
//                 .antMatchers(HttpMethod.POST, "/**").authenticated()
//                 .antMatchers(HttpMethod.PUT, "/**").authenticated()
//                 .antMatchers(HttpMethod.DELETE, "/**").authenticated()
//             .and()
//             .addFilter(new JWTAuthFilter(authenticationManager()))
//             .addFilter(new JWTValidateFilter(authenticationManager()))
//             .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//     }

//     // @Bean
//     // CorsConfigurationSource corsConfiguration() {
//     //     final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

//     //     CorsConfiguration corsConfiguration = new CorsConfiguration().applyPermitDefaultValues();
        
//     //     source.registerCorsConfiguration("/**", corsConfiguration);

//     //     return source;
//     // }

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }
    
// }
