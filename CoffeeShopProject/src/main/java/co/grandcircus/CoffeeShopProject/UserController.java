package co.grandcircus.CoffeeShopProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping("/register-user")
	public ModelAndView showUserForm() {
		return new ModelAndView("register");
	}
	
	@RequestMapping("/submit-user-registration")
	public ModelAndView submitUserForm(
			@RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname,
			@RequestParam("password") String password) {
		
	
		User user = new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setPassword(password);
		
		ModelAndView mav = new ModelAndView("user-info");
		mav.addObject("user", user);
		return mav;
	}
}
