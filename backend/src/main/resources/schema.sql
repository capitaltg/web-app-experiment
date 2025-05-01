CREATE TABLE department (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL UNIQUE,
    description VARCHAR(255),
    created_at TIMESTAMP NOT NULL
);

CREATE TABLE employee (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    middle_name VARCHAR(255),
    last_name VARCHAR(255) NOT NULL,
    department_id BIGINT NOT NULL,
    created_at TIMESTAMP NOT NULL,
    FOREIGN KEY (department_id) REFERENCES department(id)
    -- ... Many other columns
);

CREATE TABLE sales_region (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,  
    created_at TIMESTAMP NOT NULL
);

CREATE TABLE employee_sales_region (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    FOREIGN KEY (employee_id) REFERENCES employee(id),
    FOREIGN KEY (sales_region_id) REFERENCES sales_region(id)
);
    
