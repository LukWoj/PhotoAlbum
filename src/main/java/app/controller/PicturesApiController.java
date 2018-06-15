package app.controller;

import app.model.Pictures;
import app.repo.PicturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PicturesApiController {

    @Autowired
    private PicturesRepository fileRepo;

    @GetMapping("/api/gifs")
    public List<Pictures> pictures() {
        return fileRepo.listAllPictures();
    }

    //http://localhost:8080/api/gifs/find?name=1
    @GetMapping("/api/gifs/find")
    public List<Pictures> findGifs(@RequestParam String name) {
        return fileRepo.findAllByNameIgnoreCase(name);
    }

}
