DROP TABLE IF EXISTS ordered_products CASCADE;

DROP TABLE IF EXISTS products;

DROP TABLE IF EXISTS product_types;

DROP TABLE IF EXISTS orders CASCADE;

DROP TABLE IF EXISTS order_states;

 
CREATE TABLE product_types (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);
 
INSERT INTO product_types (name) VALUES
  ('Type1'),
  ('Type2'),
  ('Type3');

CREATE TABLE products (
  id INT AUTO_INCREMENT PRIMARY KEY,
  type_id int NOT NULL,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) DEFAULT NULL,
  stock INT DEFAULT 0,
  FOREIGN KEY (type_id) REFERENCES product_types(id)
);
 
INSERT INTO products (name, type_id, description, stock) VALUES
  ('Product1', 1, 'Not good', 10),
  ('Product2', 2, null, 20);
 
CREATE TABLE order_states (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(30) NOT NULL
);
  
CREATE TABLE orders (
	id INT AUTO_INCREMENT PRIMARY KEY,
	state_id INT NOT NULL,
	FOREIGN KEY (state_id) REFERENCES order_states(id)
);

CREATE TABLE ordered_products (
	order_id INT,
	product_id INT,
	product_count INT NOT NULL,
	PRIMARY KEY (order_id, product_id),
	FOREIGN KEY (order_id) REFERENCES orders(id),
	FOREIGN KEY (product_id) REFERENCES products(id)
);

INSERT INTO order_states (id, name) VALUES
  (1, 'Running'),
  (2, 'Delivered'),
  (3, 'Cancelled');
  
INSERT INTO orders (id, state_id) VALUES 
  (1, 1);
  
INSERT INTO ordered_products (order_id, product_id, product_count) VALUES
	(1, 1, 4),
	(1, 2, 10);

  