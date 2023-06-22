DROP TABLE IF EXISTS animals;

CREATE TABLE animals (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO animals (id, name) VALUES (1, "猫");
INSERT INTO animals (id, name) VALUES (2, "犬");
INSERT INTO animals (id, name) VALUES (3, "鳥");


