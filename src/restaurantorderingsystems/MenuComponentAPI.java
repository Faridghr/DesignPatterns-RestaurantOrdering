package restaurantorderingsystems;

import java.util.List;

/**
 *
 * An interface representing a component in a menu. It defines methods for adding, removing, and retrieving menu items. It serves as a common type for both individual menu items and composite menu items like combos.
 *
 */
public interface MenuComponentAPI { 
        void add(MenuItemAPI menuComponent); 
        void remove(MenuItemAPI menuComponent); 
	List<MenuItemAPI> getComponents(); 
}
