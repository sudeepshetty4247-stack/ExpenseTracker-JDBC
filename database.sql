CREATE DATABASE expense_db;

USE expense_db;

CREATE TABLE expenses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(50),
    amount DOUBLE,
    category VARCHAR(50)
);

-- Sample data (optional)
INSERT INTO expenses(title, amount, category)
VALUES
('Lunch',150,'Food'),
('Bus Ticket',40,'Travel'),
('Coffee',80,'Food');
