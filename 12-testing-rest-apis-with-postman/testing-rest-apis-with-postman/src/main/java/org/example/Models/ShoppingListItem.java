package org.example.Models;

/**
 * Represents a shopping list item.
 */
public class ShoppingListItem {
    /**
     * The id of the item.
     */
    private int id;

    /**
     * The title of the item.
     */
    private String title;

    /**
     * The price of the item.
     */
    private double price;

    /**
     * The quantity of the item.
     */
    private int quantity;

    /**
     * Gets the title of the item.
     *
     * @return The title of the item.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the id of the item.
     *
     * @return The id of the item.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the price of the item.
     *
     * @return The price of the item.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the quantity of the item.
     *
     * @return The quantity of the item.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the id of the item.
     *
     * @param id The id of the item.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the title of the item.
     *
     * @param title The title of the item.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets the price of the item.
     *
     * @param price The price of the item.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Sets the quantity of the item.
     *
     * @param quantity The quantity of the item.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Initializes a new instance of the ShoppingListItem class.
     */
    public ShoppingListItem(int id, String title, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }
}
