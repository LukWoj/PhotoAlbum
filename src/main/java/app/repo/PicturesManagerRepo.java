package app.repo;

import app.model.PicturesProperties;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public abstract class PicturesManagerRepo implements ImageRepository {
    List<PicturesProperties> picturesList;

    PicturesManagerRepo() {
        picturesList = createPicturesList();
    }

    abstract List<PicturesProperties> createPicturesList();


    @Override
    public List<PicturesProperties> listAllPictures() {
        return picturesList;
    }

    @Override
    public List<PicturesProperties> listFavouritesPictures() {

        return picturesList.stream()
                .filter(PicturesProperties::isFavourite)
                .collect(toList());
    }


}
