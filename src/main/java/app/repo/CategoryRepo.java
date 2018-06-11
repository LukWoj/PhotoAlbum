package app.repo;

import app.model.Category;

import java.util.List;

public interface CategoryRepo {

    List<Category> listAllCategories();
    Category findByCategoryId(int categoryID);
}


