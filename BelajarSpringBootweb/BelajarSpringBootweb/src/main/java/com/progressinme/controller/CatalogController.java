package com.progressinme.controller;

import com.progressinme.services.CatalogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CatalogController {
    private CatalogService catalogService;

    @Autowired
    public void setCatalogService(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @RequestMapping("/catalog")
    public String CatalogList(Model model) {
        model.addAttribute("catalog", catalogService.listCatalog());
        return "catalog";

    }

}
