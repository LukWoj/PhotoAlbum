/*package app.repo;

import app.model.Category;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Component(value = "categoryRepo")
public class CategoryRepository {
    private List<Category> categories = new LinkedList<>();

    public CategoryRepository() {
        categories.add(new Category(1L, "scenery"));
        categories.add(new Category(2L, "animal"));
        categories.add(new Category(3L, "bot"));
    }

    public List<Category> listAllCategories() {
        return categories;

    }

    public Category findByCategoryId(int categoryId) {
        return categories.stream().filter(category -> (category.getId() == categoryId)).collect(Collectors.toList()).get(0);
    }

    public List<Category> findCategoriesByNameIgnoreCase(String name) {
        return categories.stream().filter(category -> category.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }
}*/
