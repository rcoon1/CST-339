package com.gcu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.dto.AddProductDto;

@Controller
@RequestMapping("/addProduct")
public class AddProductController {
	
	@ModelAttribute("record")
	public AddProductDto addProductDto() {
		return new AddProductDto();
	}
	
	@GetMapping
	public String showAddProductForm() {
		return "addProduct";
	}
	
	@PostMapping
	public String addProduct(@ModelAttribute("record") AddProductDto addProductDto) {
		return "redirect:/addProduct?success";
		
	}

}
