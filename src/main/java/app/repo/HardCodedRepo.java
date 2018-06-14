package app.repo;

import app.model.Pictures;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component(value = "fileRepo")
public class HardCodedRepo implements PicturesRepository {

    private List<Pictures> picturesList;

    public HardCodedRepo() {
        picturesList = new LinkedList<>();
        picturesList.add(new Pictures("1", true, 1));
        picturesList.add(new Pictures("2", true,1));
        picturesList.add(new Pictures("3", true,1));
        picturesList.add(new Pictures("4", false,1));
        picturesList.add(new Pictures("5", false,2));
        picturesList.add(new Pictures("6", false,2));
        picturesList.add(new Pictures("7", false,2));
        picturesList.add(new Pictures("8", false,2));
        picturesList.add(new Pictures("9", false,2));
        picturesList.add(new Pictures("10", false,2));
        picturesList.add(new Pictures("11", false,2));
        picturesList.add(new Pictures("12", false,2));
        picturesList.add(new Pictures("13", false,2));
        picturesList.add(new Pictures("14", false,2));
        picturesList.add(new Pictures("15", false,2));
        picturesList.add(new Pictures("16", false,2));
        picturesList.add(new Pictures("17", false,2));
        picturesList.add(new Pictures("18", false,2));
        picturesList.add(new Pictures("19", false,2));
        picturesList.add(new Pictures("20", false,2));
        picturesList.add(new Pictures("21", false,2));
        picturesList.add(new Pictures("22", false,2));
        picturesList.add(new Pictures("23", false,2));
        picturesList.add(new Pictures("24", false,2));
        picturesList.add(new Pictures("25", false,3));
        picturesList.add(new Pictures("26", false,2));
        picturesList.add(new Pictures("27", false,2));
        picturesList.add(new Pictures("28", false,2));
        picturesList.add(new Pictures("29", false,2));
        picturesList.add(new Pictures("30", false,3));
        picturesList.add(new Pictures("31", false,3));
        picturesList.add(new Pictures("32", false,3));
        picturesList.add(new Pictures("33", false,1));
        picturesList.add(new Pictures("34", false,1));
    }

    @Override
    public List<Pictures> listAllPictures() {
        return picturesList;
    }

    @Override
    public List<Pictures> listFavouritesPictures() {
        return picturesList.stream().filter(Pictures::isFavorite).collect(Collectors.toList());
    }

    @Override
    public Optional<Pictures> findByName(String fileName) {
        return picturesList.stream().filter(p -> p.getFileName().equals(fileName)).findFirst();
    }


    @Override
    public List<Pictures> searchAllByNameIgnoreCase(String name) {
        return picturesList.stream().filter(p -> p.getFileName().toLowerCase()
                .contains(name.toLowerCase())).collect(Collectors.toList());
    }

    @Override
    public List<Pictures> findByCategoryId(int categoryId) {
        return picturesList.stream().filter(p -> p.getCategoryId() == categoryId)
                .collect(Collectors.toList());
    }






}