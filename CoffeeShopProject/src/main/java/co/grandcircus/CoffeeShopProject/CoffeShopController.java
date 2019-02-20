package co.grandcircus.CoffeeShopProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.jdbcintro.entity.Room;

@Controller
public class CoffeShopController {
	
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	@RequestMapping("/register")
	public ModelAndView showRegister() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}
	
	@RequestMapping("/drinkslurm")
	public ModelAndView showdrinkslurm() {
		ModelAndView mav = new ModelAndView("drinkslurm");
		return mav;
	}
	@RequestMapping("/register/{id}")
	public ModelAndView detail(@PathVariable("id") Long id) {
		Register register = registerDao.findById(id);
		
		return new ModelAndView("detail", "register", register);
	}
	
	@RequestMapping("/register/{id}/edit")
	public ModelAndView edit(@PathVariable("id") Long id) {
		Register register = registerDao.findById(id);
		
		return new ModelAndView("edit", "register", register);
	}
	
	@PostMapping("/rooms/{id}/edit")
	public ModelAndView save(@PathVariable("id") Long id, Register register) {
		register.setId(id);
		
		registerDao.update(register);
		
		
		
		return new ModelAndView("redirect:/rooms/" + id);
	}
	
	@RequestMapping("/register/add")
	public ModelAndView add() {		
		return new ModelAndView("add");
	}
	
	@PostMapping("/register/add")
	public ModelAndView addSubmit(Register register) {	
		registerDao.create(register);	
		
		
		return new ModelAndView("redirect:/register");
	}
	
	@RequestMapping("/register/{id}/delete")
	public ModelAndView remove(@PathVariable("id") Long id) {
		registerDao.delete(id);
		
		return new ModelAndView("redirect:/register");
	}
}
