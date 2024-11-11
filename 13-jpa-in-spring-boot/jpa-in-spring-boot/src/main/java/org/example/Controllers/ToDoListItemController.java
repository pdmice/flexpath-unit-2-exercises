package org.example.Controllers;
import org.example.Models.ToDoListItem;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;
import java.util.ArrayList;

/**
 * The controller for to-do list items.
 */
@RestController
@RequestMapping("/todo-list-items")
public class ToDoListItemController {
    private JdbcTemplate jdbcTemplate;

    /**
     * Creates a new to-do list item controller.
     *
     * @param dataSource The data source for the controller.  (Provided by Spring with the
     *                   values from application.properties.)
     */
    public ToDoListItemController(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /**
     * Gets all to-do list items.
     *
     * @return All to-do list items.
     */
    @GetMapping
    public List<ToDoListItem> getToDoListItems() {
        // TODO: Use the JDBC template to get all to-do list items from the database and map them to ToDoListItem objects.
        return new ArrayList<>();
    }

    /**
     * Gets a to-do list item by ID.
     *
     * @param id The ID of the to-do list item.
     * @return The to-do list item with the given ID.
     */
    @GetMapping("/{id}")
    public ToDoListItem getToDoListItem(@PathVariable int id) {
        // TODO: Use the JDBC template to get the to-do list item with the given ID from the database and map it to a ToDoListItem object.
        return new ToDoListItem();
    }

    /**
     * Creates a new to-do list item.
     *
     * @param toDoListItem The to-do list item to create.
     */
    @PostMapping
    public void createToDoListItem(@RequestBody ToDoListItem toDoListItem) {
        // TODO: Use the JDBC template to insert the to-do list item into the database.
    }

    /**
     * Updates a to-do list item.
     *
     * @param id The ID of the to-do list item.
     * @param toDoListItem The updated to-do list item.
     */
    @PostMapping("/{id}")
    public void updateToDoListItem(@PathVariable int id, @RequestBody ToDoListItem toDoListItem) {
        // TODO: Use the JDBC template to update the to-do list item in the database.
    }

    /**
     * Deletes a to-do list item.
     *
     * @param id The ID of the to-do list item.
     */
    @PostMapping("/{id}/delete")
    public void deleteToDoListItem(@PathVariable int id) {
        // TODO: Use the JDBC template to delete the to-do list item from the database.
    }
}
