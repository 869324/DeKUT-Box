package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;
    private Map<String, Object> root = new HashMap<>();
    private Map<String, Object> data = new HashMap<>();
    private JdbcTemplate jdbc;

    @GetMapping(path = {"/", "index"})
    public ModelAndView home() {
        return new ModelAndView("index", root);
    }

    @GetMapping(path = "login")
    public ModelAndView toLogin(){
        return new ModelAndView("login", root);
    }

    @GetMapping(path = "signup")
    public ModelAndView toSignup(){
        return new ModelAndView("signup", root);
    }

    @PostMapping(path="/signup")
    public ModelAndView signup(Student student){
        studentRepo.save(student);
        if (root.containsKey("student")){
            root.replace("student", student);
        }
        else {
            root.put("student", student);
        }
        return new ModelAndView("index", root);
    }

    @PostMapping(path = "/login")
    public ModelAndView login(HttpServletRequest req){
        ModelAndView modelAndView;
        String regNo = req.getParameter("regNo");
        String password = req.getParameter("password");
        ArrayList<Student> students = (ArrayList<Student>) studentRepo.findAll();
        for (Student student:students) {
            if(student.getRegNo().equals(regNo) && student.getPassword().equals(password)){
                if (root.containsKey("student")){
                    root.replace("student", student);
                }
                else {
                    root.put("student", student);
                }
                modelAndView = new ModelAndView("index", root);
                return modelAndView;
            }


        }
        data = new HashMap<>();
        data.put("loginError", "Invalid Login credentials");
        modelAndView = new ModelAndView("login", data);
        return modelAndView;
    }

    }


