package app;

import app.model.PicturesProperties;
import app.repo.FileRepo;
import app.repo.PicturesManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import app.repo.ImageRepository;
import org.springframework.web.bind.annotation.PathVariable;
//ctrl+alt+o - remove unused imports

@Controller
public class PhotoAlbumController {

    @Autowired
    private ImageRepository fileRepo;


    @GetMapping("/")
    public String hello(Model modelMap) {
        System.out.println(fileRepo.findByName("DSCF2933.JPG").toString());
        modelMap.addAttribute("picturesList", fileRepo.listAllPictures());
        return "home";
    }

    @GetMapping("/favorites")
    public String favorites(Model modelMap) {
        modelMap.addAttribute("picturesFavouritesList", fileRepo.listFavouritesPictures());
        return "favorites";
    }

   @GetMapping("/gif/{name}")
    public String displayPicture(@PathVariable String name, ModelMap modelMap) {
        modelMap.addAttribute("gif" , fileRepo.findByName(name));
        return "gif-details";
    }
}

