-- Using the Products and OrderItems tables, write a query to find the total revenue generated for
-- each product. The result should display the ProductID, ProductName, and the TotalRevenue
-- (calculated as the sum of Price * Quantity for each OrderItem entry for the product).
-- Order the results by ProductID in ascending order.

SELECT OrderItems.ProductID,Products.ProductName,  SUM(OrderItems.PRICE * OrderItems.Quantity) AS 'TotalRevenue'
FROM OrderItems
JOIN Products ON OrderItems.ProductID = Products.ProductID
GROUP BY OrderItems.ProductID;
