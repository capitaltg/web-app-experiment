CREATE TABLE department (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL UNIQUE,
  description VARCHAR(255),
  created_at TIMESTAMP NOT NULL
);

CREATE TABLE address (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  street_address_1 VARCHAR(255) NOT NULL,
  street_address_2 VARCHAR(255),
  city VARCHAR(255) NOT NULL,
  state VARCHAR(2) NOT NULL,
  zip VARCHAR(5) NOT NULL,
  zip_ext VARCHAR(4)
);

CREATE TABLE employee (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(255) NOT NULL,
  middle_name VARCHAR(255),
  last_name VARCHAR(255) NOT NULL,
  salary INTEGER NOT NULL,
  address_id BIGINT,
  department_id BIGINT NOT NULL,
  created_at TIMESTAMP NOT NULL,
  FOREIGN KEY (address_id) REFERENCES address(id),
  FOREIGN KEY (department_id) REFERENCES department(id)
);