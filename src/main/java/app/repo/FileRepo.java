package app.repo;

import app.model.PicturesProperties;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Component(value = "fileRepo")
public class FileRepo extends PicturesManagerRepo {

    @Override
    List<PicturesProperties> createPicturesList() {

        URL resource = getClass().getResource("/static");

        List<PicturesProperties> gifList = new ArrayList<>();//Collections.emptyList();

        try {
            Path pathToStatic = Paths.get(resource.toURI());
            Path imagesPath = pathToStatic.resolve("gifs");

            gifList = Files.list(imagesPath)
                    .filter(Files::isRegularFile)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .map(PicturesProperties::new)
                    .collect(toList());

           PicturesProperties favouritePicture1 = gifList.get(4);
           favouritePicture1.setFavourite(true);
            PicturesProperties favouritePicture2 = gifList.get(5);
            favouritePicture2.setFavourite(true);



        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        return gifList;
    }


    public Optional<PicturesProperties> findByName(String name) {
        return createPicturesList().stream().filter(p -> p.getName().equals(name)).findFirst();
    }

}

