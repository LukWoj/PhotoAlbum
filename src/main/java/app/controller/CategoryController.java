/*package app.controller;

import app.model.Category;
import app.repo.CategoryRepository;
import app.repo.PicturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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

    @GetMapping("/categories/search")
    public String searchCategory(@RequestParam String q, ModelMap modelMap) {
        List<Category> categotyList = categoryRepository.findCategoriesByNameIgnoreCase(q);
        if (categotyList.isEmpty()) {
            modelMap.addAttribute("categories", categoryRepository.listAllCategories());
        } else {
            modelMap.addAttribute("categories", categotyList);
        }
        return "categories";
    }
}*/
