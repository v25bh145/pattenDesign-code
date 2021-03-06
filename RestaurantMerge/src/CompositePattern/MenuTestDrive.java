package CompositePattern;

import CompositePattern.Component.Menu;
import CompositePattern.Component.MenuComponent;
import CompositePattern.Component.MenuItem;

//测试程序
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));

        WaitressNew waitress = new WaitressNew(allMenus);
        waitress.printMenu();

        WaitressNew waitress2 = new WaitressNew(allMenus);
        System.out.println("now the vegetarian menu\n---");
        waitress2.printVegetarianMenu();
    }
}
