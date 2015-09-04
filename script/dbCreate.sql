    CREATE DATABASE IF NOT EXISTS play_store CHARACTER SET utf8 COLLATE utf8_general_ci;
    USE 'play_store';
    CREATE TABLE IF NOT EXISTS categories (
    id INT(3) UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
    );
    CREATE TABLE IF NOT EXISTS products (
    id INT(5) UNSIGNED NOT NULL AUTO_INCREMENT,
    categories_id INT(3) UNSIGNED NOT NULL,
    name VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    price DOUBLE(7, 2) NOT NULL,
    PRIMARY KEY (id)
    );