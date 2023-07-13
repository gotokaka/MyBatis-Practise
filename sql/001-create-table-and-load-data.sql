DROP TABLE IF EXISTS names;

CREATE TABLE names (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO names (name) VALUES ("うなぎ猫");
INSERT INTO names (name) VALUES ("リョウジ");
INSERT INTO names (name) VALUES ("イーロンマスク");


