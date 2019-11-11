package pe.edu.upn.clinica.init;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import pe.edu.upn.clinica.model.entity.Usuario;
import pe.edu.upn.clinica.model.repository.AuthorityRepository;
import pe.edu.upn.clinica.model.repository.UsuarioRepository;

public class InitDB {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Autowired
    private PasswordEncoder passwordEncoder;

	public void run(String... args) throws Exception {
		
		this.usuarioRepository.deleteAll();
		this.authorityRepository.deleteAll();
		
		Usuario juan = new Usuario();
		juan.setUsername("juan");
		juan.setPassword(passwordEncoder.encode("juan"));
		juan.setApellidos("Flores");
		juan.setNombres("Juan");
		juan.setCargo("cargo");
		juan.setEnable(true);
		
		Usuario admin = new Usuario();
		admin.setUsername("admin");
		admin.setPassword(passwordEncoder.encode("admin"));
		admin.setApellidos("Flores");
		admin.setNombres("Juan");
		admin.setCargo("cargo");
		admin.setEnable(true);
		
        Usuario manager = new Usuario();
        manager.setUsername("manager");
        manager.setPassword(passwordEncoder.encode("manager"));
        manager.setApellidos("Flores");
		manager.setNombres("Juan");
		manager.setCargo("cargo");
        manager.setEnable(true);
        
        juan.addAuthority("ROLE_USER");
        juan.addAuthority("ACCESS_MEDICO_READ");
        admin.addAuthority("ROLE_ADMIN");
        admin.addAuthority("ACCESS_REST1");
        admin.addAuthority("ACCESS_REST2");
        manager.addAuthority("ROLE_MANAGER");
        manager.addAuthority("ACCESS_REST1");
        
        List<Usuario> usuarios = Arrays.asList(juan, admin, manager);        
        this.usuarioRepository.saveAll(usuarios);
	}
}
