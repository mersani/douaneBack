package bns.tn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import bns.tn.Services.AccountService;
import bns.tn.entities.Role;
import bns.tn.entities.Utilisateur;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class DdmApplication  /*implements CommandLineRunner*/ {


	 // @Autowired private AccountService accountService;


	public static void main(String[] args) {
		SpringApplication.run(DdmApplication.class, args);

	}

	@Bean
	public BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}


	 /* @Override
	 public void run(String... args) throws Exception {

		accountService.saveUser(new Utilisateur("admin", "1234", "ines", "tita", "ines@gmail.com", "mhamdia,ben arous",
				21267218, "07228960", null));
		accountService.saveUser(new Utilisateur("declarant", "1234", "malek", "kouki", "malek.kouki@esen.tn",
				"mateur bizerte", 51750866, "11396187", null));

		accountService.saveRoles(new Role("ADMIN"));
		accountService.saveRoles(new Role("DECLARANT"));
		accountService.addRolesToUser("admin", "ADMIN");
		accountService.addRolesToUser("declarant", "DECLARANT");

		accountService.saveUser(new Utilisateur("inspecteur", "1234", "ichrak", "tita", "ichrak@gmail.com",
				"mhamdia,ben arous", 21267218, "07228960", null));
		accountService.saveUser(new Utilisateur("reviseur", "1234", "islem", "kouki", "malek.kouki@esen.tn",
				"mateur bizerte", 51750866, "11396187", null));

		accountService.saveRoles(new Role("INSPECTEUR"));
		accountService.saveRoles(new Role("REVISEUR"));
		accountService.addRolesToUser("inspecteur", "INSPECTEUR");
		accountService.addRolesToUser("reviseur", "REVISEUR");

		accountService.saveUser(new Utilisateur("regisseur", "1234", "mounira", "benahmed", "ichrak@gmail.com",
				"mhamdia,ben arous", 21267218, "07228960", null));
		

		accountService.saveRoles(new Role("REGISSEUR"));
	
		accountService.addRolesToUser("regisseur", "REGISSEUR");
	
	}*/

}