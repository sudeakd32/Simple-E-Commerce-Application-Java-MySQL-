CREATE DATABASE ecommerce;
USE ecommerce;

CREATE TABLE products (
    productID INT AUTO_INCREMENT PRIMARY KEY,  
    productName VARCHAR(100) NOT NULL,       
    productDescription TEXT,               
    productPrice DOUBLE NOT NULL,             
    productStockQuantity INT NOT NULL         
);

CREATE TABLE customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

INSERT INTO products (productName, productDescription, productPrice, productStockQuantity) 
VALUES 
('Laptop', '16GB RAM, Intel i7, 512GB SSD', 15000, 10),
('Smartphone', '128GB storage, 8GB RAM', 8000, 20),
('Headphones', 'Wireless Bluetooth headphones', 500, 50),
('Television', '4K Ultra HD, 55-inch screen', 12000, 15),
('Tablet', '10-inch screen, 64GB storage', 3000, 25),
('Smartwatch', 'Heart rate monitoring, GPS', 2000, 30),
('Bluetooth Speaker', 'Portable, waterproof', 750, 40),
('Desktop Computer', 'RTX 3070, Intel i9, 16GB RAM', 20000, 5),
('Gaming Console', '1TB storage, 4K support', 7000, 8),
('Wireless Keyboard', 'Multimedia keys, Bluetooth', 600, 35);

INSERT INTO customers (name, email) 
VALUES 
('Melih Yıldız', 'melih@gmail.com'),
('Ayşe Demir', 'ayse@gmail.com'),
('Fatma Çelik', 'fatma@hotmail.com'),
('Ahmet Öz', 'ahmet@hotmail.com'),
('Eren Kılıç', 'eren@gmail.com');

