# Drop Tables

DROP TABLE IF EXISTS GameSet_Player;
DROP TABLE IF EXISTS Tournament_Game;
DROP TABLE IF EXISTS Player;
DROP TABLE IF EXISTS GameSet;
DROP TABLE IF EXISTS Game;
DROP TABLE IF EXISTS Tournament;

# Create Tables

CREATE TABLE Player(
	playerID INT PRIMARY KEY AUTO_INCREMENT,
	firstName VARCHAR(20) NOT NULL,
	lastName VARCHAR(20) NOT NULL,
	age INT NOT NULL,
	gender VARCHAR(1) NOT NULL
);

CREATE TABLE Game(
	gameID INT PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE GameSet(
	gameSetID INT PRIMARY KEY AUTO_INCREMENT,
	gameID INT NOT NULL,
	FOREIGN KEY (gameID) REFERENCES Game(gameID)
);

CREATE TABLE Tournament(
	tournamentID INT PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE GameSet_Player(
	gameSetID INT,
	playerID INT,
	score INT NOT NULL,
	PRIMARY KEY (gameSetID, playerID),
	FOREIGN KEY (gameSetID) REFERENCES GameSet(gameSetID),
	FOREIGN KEY (playerID) REFERENCES Player(playerID)
);

CREATE TABLE Tournament_Game(
	gameID INT PRIMARY KEY,
	tournamentID INT NOT NULL,
	FOREIGN KEY (gameID) REFERENCES Game(GameID),
	FOREIGN KEY (tournamentID) REFERENCES Tournament(TournamentID)
);

# Insert

INSERT INTO Player(playerID, firstName, lastName, age, gender)
				VALUES(1, 'John', 'Doe', 17, 'M');
INSERT INTO Player(playerID, firstName, lastName, age, gender)
				VALUES(2, 'John', 'Smith', 18, 'M');
INSERT INTO Player(playerID, firstName, lastName, age, gender)
				VALUES(3, 'John', 'Snow', 19, 'M');
INSERT INTO Player(playerID, firstName, lastName, age, gender)
				VALUES(4, 'John', 'Ice', 20, 'M');

INSERT INTO Game(gameID) VALUES(1);
INSERT INTO Game(gameID) VALUES(2);
INSERT INTO Game(gameID) VALUES(3);
INSERT INTO Game(gameID) VALUES(4);

INSERT INTO GameSet(gameSetID, gameID) VALUES(1,1);
INSERT INTO GameSet(gameSetID, gameID) VALUES(2,1);
INSERT INTO GameSet(gameSetID, gameID) VALUES(3,1);

INSERT INTO Tournament(tournamentID) VALUES(1);

INSERT INTO GameSet_Player(gameSetID, playerID, score) VALUES(1, 1, 11);
INSERT INTO GameSet_Player(gameSetID, playerID, score) VALUES(2, 1, 5);
INSERT INTO GameSet_Player(gameSetID, playerID, score) VALUES(3, 1, 11);
INSERT INTO GameSet_Player(gameSetID, playerID, score) VALUES(1, 2, 9);
INSERT INTO GameSet_Player(gameSetID, playerID, score) VALUES(2, 2, 11);
INSERT INTO GameSet_Player(gameSetID, playerID, score) VALUES(3, 2, 8);

INSERT INTO Tournament_Game(gameID, tournamentID) VALUES(2, 1);
INSERT INTO Tournament_Game(gameID, tournamentID) VALUES(3, 1);

