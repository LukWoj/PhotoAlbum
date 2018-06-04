package app.repo;

import app.model.PicturesProperties;

import java.util.List;
import java.util.Optional;

public interface ImageRepository {

    List<PicturesProperties> listAllPictures();
    List<PicturesProperties> listFavouritesPictures();
    Optional<PicturesProperties> findByName(String name);

}
