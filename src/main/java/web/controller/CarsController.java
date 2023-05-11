package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.dao.CarDAOImpl;
import web.service.CarService;

@Controller

public class CarsController {
	private final CarService carService;
	private final CarDAO carDAO = new CarDAOImpl();
	private final String countCars = "5";

	public CarsController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping(value="/cars")
	public String index(@RequestParam(value = "count", defaultValue = countCars) int count, Model model) {
			model.addAttribute("cars", carService.listCars(count));
		return "cars";
	}
}