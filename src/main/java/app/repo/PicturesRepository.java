package app.repo;

import app.model.Pictures;

import java.util.List;
import java.util.Optional;

public interface PicturesRepository {

    List<Pictures> listAllPictures();

    List<Pictures> listFavouritesPictures();

    /*List<Pictures> findByCategoryId(int categoryId);

    List<Pictures> findAllByNameIgnoreCase(String name);
*/
    Optional<Pictures> findByName(String fileName);


}
