package com.maxxbyte.data;

import com.maxxbyte.models.MenuItem;
import com.maxxbyte.models.Restaurant;

import java.util.List;

public interface MenuItemDao {
    List<MenuItem> search(Integer restaurantId);
    List<MenuItem> listByMenuItemId(int restaurantId);
    MenuItem getByMenuItemId(int menuItemId);
    Restaurant create(MenuItem menuItem);
    void update(int menuItemId, MenuItem menuItem);
    void delete(int menuItemId);
}
