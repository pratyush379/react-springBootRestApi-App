package com.pratyush.springbootBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pratyush.springbootBackend.model.User;
import com.pratyush.springbootBackend.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Pratyush","Singh","pratyush@gamil.com"));
		this.userRepository.save(new User("Rajarshi","biswas","raj@gamil.com"));
		this.userRepository.save(new User("Pratyush"," ","pratyush@gamil.com"));
		this.userRepository.save(new User("Aaditya","Raj","adi@gamil.com"));
		
		
	}

}
