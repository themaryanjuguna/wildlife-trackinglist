CREATE DATABASE wildlife_tracker;

\c wildlife_tracker;

CREATE TABLE animals(id Int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, name VARCHAR, age INT, location VARCHAR, behaviour VARCHAR, health VARCHAR, risk VARCHAR);
CREATE TABLE location(id Int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, type VARCHAR, time TIMESTAMP);
CREATE TABLE ranger(id Int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, rangerName VARCHAR, radioTelephoneFrequency INT, avatarUrl VARCHAR, badgeNumber VARCHAR);

CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;