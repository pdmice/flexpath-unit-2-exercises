package org.example.Controllers;

import org.example.Models.ToDoList;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;
import java.util.ArrayList;


/**
 * The controller for to-do lists.
 */
@RestController
@RequestMapping("/todo-lists")
public class ToDoListController {
    /**
     * The JDBC template created at construction for querying the database.
     */
    private JdbcTemplate jdbcTemplate;

    /**
     * Creates a new to-do list controller.
     *
     * @param dataSource The data source for the controller.  (Provided by Spring with the
     *                   values from application.properties.)
     */
    public ToDoListController(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /**
     * Gets all to-do lists.
     *
     * @return All to-do lists.
     */
    @GetMapping
    public List<ToDoList> getToDoLists() {
        // TODO: Use the JDBC template to get all to-do lists from the database and map them to ToDoList objects.
        return new ArrayList<>();
    }

    /**
     * Gets a to-do list by ID.
     *
     * @param id The ID of the to-do list.
     * @return The to-do list with the given ID.
     */
    @GetMapping("/{id}")
    public ToDoList getToDoList(@PathVariable int id) {
        // TODO: Use the JDBC template to get the to-do list with the given ID from the database and map it to a ToDoList object.
        return new ToDoList();
    }

    /**
     * Creates a new to-do list.
     *
     * @param toDoList The to-do list to create.
     */
    @PostMapping
    public void createToDoList(@RequestBody ToDoList toDoList) {
        // TODO: Use the JDBC template to insert a new to-do list with the given title into the database.
    }

    /**
     * Updates a to-do list.
     *
     * @param id The ID of the to-do list.
     * @param toDoList The updated to-do list.
     */
    @PostMapping("/{id}")
    public void updateToDoList(@PathVariable int id, @RequestBody ToDoList toDoList) {
        // TODO: Use the JDBC template to update the to-do list with the given ID in the database with the given title.
    }

    /**
     * Deletes a to-do list.
     *
     * @param id The ID of the to-do list.
     */
    @PostMapping("/{id}/delete")
    public void deleteToDoList(@PathVariable int id) {
        // TODO: Use the JDBC template to delete the to-do list with the given ID from the database.
    }
}
