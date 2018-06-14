package app.repo;

import app.model.Pictures;

import java.util.List;
import java.util.Optional;

public interface PicturesRepository {

    List<Pictures> listAllPictures();

    List<Pictures> listFavouritesPictures();

    Optional<Pictures> findByName(String fileName);

    List<Pictures> searchAllByNameIgnoreCase(String name);

    List<Pictures> findByCategoryId(int categoryId);
}
