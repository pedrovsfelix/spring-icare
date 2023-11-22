package com.web.icare.SpringWeb.controllers;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.icare.SpringWeb.Servico.CookieService;
import com.web.icare.SpringWeb.models.Anamnese;
import com.web.icare.SpringWeb.repositorio.AnamneseRepo;

@Controller
public class AnamneseController {

    @Autowired
    private AnamneseRepo anarepo;

    @GetMapping("/anamneses")
    public String index(Model model, HttpServletRequest request) throws UnsupportedEncodingException {
        model.addAttribute("nome", CookieService.getCookie(request, "nomeUsuario"));
        List<Anamnese> anamnese = (List<Anamnese>) anarepo.findAll();
        model.addAttribute("anamneses", anamnese);
        return "anamneses/index";
    }

    @GetMapping("/anamneses/novo")
    public String novo(Model model, HttpServletRequest request) throws UnsupportedEncodingException {
        model.addAttribute("nome", CookieService.getCookie(request, "nomeUsuario"));
        return "anamneses/novo";
    }

    @PostMapping("/anamneses/criar")
    public String criar(Anamnese anamnese) {
        anarepo.save(anamnese);
        return "redirect:/anamneses";
    }

    @GetMapping("/anamneses/{id}")
    public String busca(@PathVariable int id, Model model) {
        Optional<Anamnese> admin = anarepo.findById(id);
        try {
            model.addAttribute("anamnese", admin.get());
        } catch (Exception err) {
            return "redirect:/anamneses";
        }

        return "/anamneses/editar";
    }

    @PostMapping("/anamneses/{id}/atualizar")
    public String atualizar(@PathVariable int id, Anamnese anamnese) {
        if (!anarepo.existsById(id)) {
            return "redirect:/anamneses";
        }

        anarepo.save(anamnese);

        return "redirect:/anamneses";
    }

    @GetMapping("/anamneses/{id}/excluir")
    public String excluir(@PathVariable int id) {
        anarepo.deleteById(id);
        return "redirect:/anamneses";
    }
}
