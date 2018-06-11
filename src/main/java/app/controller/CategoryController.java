package app.controller;

import app.repo.CategoryRepository;
import app.repo.PicturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    private PicturesRepository fileRepo;

    @GetMapping("/categories")
    public String displayAll(Model modelMap) {
        modelMap.addAttribute("categories", categoryRepository.listAllCategories());
        return "categories";
    }

    @GetMapping("/category/{id}")
    public String displayCategory(@PathVariable int id, ModelMap modelMap) {
        modelMap.addAttribute("category", categoryRepository.findByCategoryId(id));
        modelMap.addAttribute("gifs", fileRepo.findByCategoryId(id));
        return "category";
    }
}
