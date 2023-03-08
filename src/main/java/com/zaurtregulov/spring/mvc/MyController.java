package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
//        Employee employee = new Employee();
//        employee.setName("Максим");
//        employee.setSurName("Кораблев");
//        employee.setSalary(750);
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

//    @RequestMapping(path = "/showDetails",method = RequestMethod.GET) // 2 способ получение текст из view .ДЛИННЫЙ СПОСОБ
    // ОПИСАНИЯ
@GetMapping(path = "/showDetails") // 2 способ получение текст из view
    public String shoeEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {
        // Атрибут Valid говорит что будет подвергаться валидации
        // BindingResult bindingResult отвечает прошла ли валидация (успешно или нет)
        if(bindingResult.hasErrors()){
            return "ask-emp-details-view";
        }
        else {
            return "show-emp-details-view";
        }
    }
}
