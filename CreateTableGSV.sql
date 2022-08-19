-- CREATE TABLE - Gabriel Santorun

CREATE TABLE friends(
  id INTEGER,
  name TEXT,
  birthday DATE
);

INSERT INTO friends (id, name, birthday)
VALUES (1, 'Ororo Munroe', '30-05-1940');

SELECT * 
FROM friends;

INSERT INTO friends (id, name, birthday)
VALUES (2, 'Oda Nobunaga', '23-06-1534');

INSERT INTO friends (id, name, birthday)
VALUES (3, 'Liliʻuokalani', '02-09-1838');

SELECT * 
FROM friends;

UPDATE friends 
SET name = 'Storm' 
WHERE name = 'Ororo Munroe';

SELECT * 
FROM friends;

ALTER TABLE friends
ADD COLUMN email TEXT;

SELECT * 
FROM friends;

UPDATE friends 
SET email = 'storm@codecademy.com' 
WHERE name = 'Storm';

UPDATE friends 
SET email = 'oda.nobunaga@codecademy.com' 
WHERE name = 'Oda Nobunaga';

UPDATE friends 
SET email = 'liliuokalani@codecademy.com' 
WHERE name = 'Liliʻuokalani';

SELECT * 
FROM friends;

DELETE FROM friends
WHERE id = 1;

SELECT * 
FROM friends;