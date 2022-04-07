package Insurance.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	@RequestMapping("index")
	public String test1(Model model) {
		return "Customer/index";
	}

	@RequestMapping("login")
	public String login(Model model) {
		return "Customer/login";
	}

	@RequestMapping("products")
	public String products(Model model) {
		return "Customer/products";
	}
}
