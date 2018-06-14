package app.controller;

import app.model.Pictures;
import app.repo.PicturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
//ctrl+alt+o - remove unused imports

@Controller
public class PicturesController {

    @Autowired
    private PicturesRepository fileRepo;


    @GetMapping("/")
    public String hello(Model modelMap) {
        modelMap.addAttribute("picturesList", fileRepo.listAllPictures());
        return "home";
    }

    @GetMapping("/favorites")
    public String favorites(Model modelMap) {
        modelMap.addAttribute("listFavouritesPictures", fileRepo.listFavouritesPictures());
        return "favorites";
    }

    @GetMapping("/gif/{name}")
    public String displayPicture(@PathVariable String name, ModelMap modelMap) {
        modelMap.addAttribute("gif", fileRepo.findByName(name).orElse(new Pictures("picture error", true)));
        return "gif-details";
    }

    @GetMapping("/gif/{name}/favorite")
    public String isFavouriteGifChange(@PathVariable String name, ModelMap modelMap) {
        fileRepo.findByName(name).orElse(new Pictures("android-explosion", true))
                .changeFavorite();
        modelMap.addAttribute("gif", fileRepo.findByName(name)
                .orElse(new Pictures("android-explosion", true)));
        return "gif-details";
    }

    @GetMapping("/search")
    public String searchPicture(@RequestParam String photo, ModelMap modelMap) {
        List<Pictures> picturesList = fileRepo.searchAllByNameIgnoreCase(photo);
        modelMap.addAttribute("search", fileRepo.searchAllByNameIgnoreCase(photo));
        return "home";
        }
    }


