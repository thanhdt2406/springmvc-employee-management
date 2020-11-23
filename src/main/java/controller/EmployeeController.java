package controller;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @GetMapping("/showform")
    public ModelAndView showForm(){
        return new ModelAndView("create","employee",new Employee());
    }

    @PostMapping("addEmployee")
    public ModelAndView submit(@ModelAttribute("employee") Employee employee){
        ModelAndView modelAndView = new ModelAndView("info");
        modelAndView.addObject("name",employee.getName());
        modelAndView.addObject("contactNumber",employee.getContactNumber());
        modelAndView.addObject("id",employee.getId());
        return modelAndView;
    }
}
