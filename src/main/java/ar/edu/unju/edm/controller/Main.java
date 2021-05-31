package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.service.IProductoService;
import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class Main {
	@Autowired
	IUsuarioService iUsuarioService;
	@Autowired
	IProductoService iProductoService;
	@GetMapping({"/","/login","/home","/login?error=true"})
	public String IniciarAplicacion(Model model) {
		
		// Agregar usuarios y productos de ejemplo
		iProductoService.guardarProd(new Producto((long)1,"Auriculares Sony ", "1",Float.parseFloat("1000.0"),Float.parseFloat("20.0")));
		iProductoService.guardarProd(new Producto((long)2,"Mouse", "2",Float.parseFloat("2000.0"),Float.parseFloat("150.0")));
		iProductoService.guardarProd(new Producto((long)3,"Teclado", "3",Float.parseFloat("2000.0"),Float.parseFloat("100.0")));
		
		
		Usuario bas=new Usuario((long)1,"luz","luz1","4256987","luz","Alvarez","Admin");
		iUsuarioService.crear(bas);
		bas=new Usuario((long)2,"pablo","1234","43269587","pablo","Alvarez","Client");
		iUsuarioService.crear(bas);
		//*/
		return "index";
	}
}



