package WebServices;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Model.Product;
import Model.ShoppingList;
import Model.User;

public class WebServices {

    /**
     *
     * @param firstname user firstname
     * @param password user password
     * @param mail user mail
     * @param lastname user lastname, optionnal
     * @return User
     */
    public User createUser(String firstname, String password, String mail,  String lastname)
    {
        return new User();
    }

    /**
     *
     * @param mail user mail
     * @param password user password
     * @return User
     */
    public User login(String mail, String password)
    {
        return new User();
    }

    /**
     *
     * @param userToken user connection token
     * @param name shopping list name
     * @return ShoppingList
     */
    public ShoppingList createShoppingList(String userToken, String name)
    {
        return new ShoppingList();
    }

    /**
     * @param userToken user connection token
     * @return ArrayList<ShoppigList>
     */
    public ArrayList<ShoppingList> getShoppingLists(String userToken)
    {
        ShoppingList list = new ShoppingList();
        ArrayList<ShoppingList> shoppingLists = new ArrayList<>();
        shoppingLists.add(list);
        return shoppingLists;
    }

    /**
     *
     * @param userToken user connection token
     * @param id list id
     * @param name list new name
     * @param completed list new completion
     * @return Integer
     */
    public Integer editList(String userToken, Integer id, String name, Boolean completed)
    {
        return 0;
    }

    /**
     *
     * @param userToken user connection token
     * @param id list id
     * @return Integer
     */
    public Integer removeList(String userToken, Integer id)
    {
        return 0;
    }

    /**
     *
     * @param userToken user connection token
     * @param shoppingListId id of the shopping list where the product is added
     * @param name product name
     * @param quantity product quantity
     * @param price product  unity price
     * @return Product
     */
    public Product createProduct(String userToken, String shoppingListId, String name, Integer quantity, Double price)
    {
        return new Product();
    }

    /**
     *
     * @param userToken user connection token
     * @param listId list id
     * @return ArrayList
     */
    public ArrayList<Product> getProductsFromList(String userToken, Integer listId)
    {
        Product product = new Product();
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product);
        return productList;
    }

    /**
     *
     * @param userToken user connection token
     * @param id product id
     * @param name product name
     * @param quantity product quantity
     * @param price product price
     * @return Integer
     */
    public Integer editProduct(String userToken, Integer id, String name, Integer quantity, Double price)
    {
        return 0;
    }

    /**
     *
     * @param userToken user connection token
     * @param id product id
     * @return Integer
     */
    public Integer removeProduct(String userToken, String id)
    {
        return 0;
    }
}
