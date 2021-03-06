# Forest Service Wildlife Tracker Site
A JAVA Web App that records wildlife tracking list

## User Stories 
#### As a user;
- You can add & view Wildlife animals
- You can add & view Rangers
- You can add & view sighted endengered or least-concern animals 



## Setup
* Go to the [Wildlife Tracking List](https://github.com/themaryanjuguna/wildlife-trackinglist.git) repository on GitHub.
* Clone the project into your local device.
* On the terminal, navigate to the project directory and run `gradle compile`. Then navigate to the `main` directory in the build folder and run `java App`.

### DATABASE SET UP.
```
* Type in psql -U postgres
* CREATE DATABASE wildlife_tracker;
* \c wildlife_tracker 

CREATE TABLE animals(
id Int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
name VARCHAR,
age VARCHAR,
behaviour VARCHAR,
health VARCHAR,
risk VARCHAR
);

CREATE TABLE location(
id Int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
type VARCHAR,
time TIMESTAMP
);

CREATE TABLE ranger(
id Int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
rangerName VARCHAR,
radioTelephoneFrequency VARCHAR,
badgeNumber INTEGER
);

CREATE TABLE sightings(
id Int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
animalname VARCHAR,
animaltype VARCHAR,
location VARCHAR,
rangername VARCHAR,
time TIMESTAMP
);

CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;
```

## Dependencies
1. Java
2. Gradle
3. Heroku

## Technology used
1. Java

## Author Details
Maryanne Njuguna [Linktree Profile](https://linktr.ee/themaryanjuguna)