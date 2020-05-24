package com.capas.uca.labo6.Controllers;

import com.capas.uca.labo6.Domain.Estudiante;
import com.capas.uca.labo6.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private EstudianteService estudianteService;

    //mostar lista de estudiantes

    @RequestMapping("/inicio")
    public ModelAndView inicio() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("estudiante", new Estudiante());
        return mav;
    }

    @RequestMapping("/formEstudiante")
    public ModelAndView formEstudiante (@Valid @ModelAttribute Estudiante estudiante, BindingResult result) {
        ModelAndView mav = new ModelAndView();
        if(!(result.hasErrors())) {
            try{
                estudianteService.save(estudiante);
            }catch (Exception e) {
                e.printStackTrace();
            }
            mav.addObject("estudiante", new Estudiante());
        }
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("/listado")
    public ModelAndView listado() {
        ModelAndView mav = new ModelAndView();
        List<Estudiante> estudiantes = null;
        try {
            estudiantes = estudianteService.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        mav.addObject("estudiantes", estudiantes);
        mav.setViewName("listado");
        return mav;
    }

    @RequestMapping(value = "/borrarEstudiante", method= RequestMethod.POST)
    public ModelAndView borrarEstudiante(@RequestParam(value="codigo") int id) {
        ModelAndView mav = new ModelAndView();
        List<Estudiante> estudiantes = null;
        try {
            estudianteService.delete(id);
            estudiantes = estudianteService.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        mav.addObject("estudiantes", estudiantes);
        mav.setViewName("listado");
        return mav;
    }
    }


