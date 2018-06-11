package app.repo;

import app.model.Category;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Component(value = "categoryRepo")
public class CategoryRepository implements CategoryRepo {

    private List<Category> categories;

    public CategoryRepository() {
        categories = new LinkedList<>();
        categories.add(new Category(1L, "Scenery"));
        categories.add(new Category(2L, "Water animals"));
        categories.add(new Category(3L, "Birds"));
    }

    @Override
    public List<Category> listAllCategories() {
        return categories;
    }

@Override
    public Category findByCategoryId(int categoryID){
        return categories.stream().filter(p -> p.getId() == categoryID).collect(Collectors.toList()).get(0);
    }
}
