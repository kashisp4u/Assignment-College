package com.example.demo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.example.demo.model.Administrator;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import com.example.demo.repo.AdminRepository;
import com.example.demo.repo.StudentRepository;
import com.example.demo.repo.TeacherRepository;

@EnableWebSecurity
@Configuration
@EnableMethodSecurity
public class SecurityConfig {

	@Autowired
	private AdminRepository adminRepo;

	@Autowired
	private StudentRepository studentRepo;

	@Autowired
	private TeacherRepository teacherRepo;

	public static final String[] ACCESS_ALL = { "/adminController/loginadmin", "/student/loginstudent",
			"/teacher/loginteacher" };

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder) {
		List<Administrator> admin = adminRepo.findAll();
		List<Student> su = studentRepo.findAll();
		List<Teacher> te = teacherRepo.findAll();

		List<Object> alluser = new ArrayList<>();
		alluser.addAll(admin);
		alluser.addAll(su);
		alluser.addAll(te);

		List<UserDetails> usd = new ArrayList<>();
		
	UserDetails defaultone = User.withUsername("Shyam").password(encoder.encode("1234")).roles("ADMIN").build();
		usd.add(defaultone);

		UserDetails default2 = User.withUsername("ramu").password(encoder.encode("ramu")).roles("TEACHER").build();
		usd.add(default2);
		UserDetails default3 = User.withUsername("niru").password(encoder.encode("niru")).roles("STUDENT").build();
		usd.add(default3);

		return  new InMemoryUserDetailsManager(usd);

//		return new UserInfoUserDetailsService();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// .httpBasic(Customizer.withDefaults()
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
				.formLogin(fo -> fo.permitAll()).logout(lo -> lo.permitAll());
		return http.build();
	}
}