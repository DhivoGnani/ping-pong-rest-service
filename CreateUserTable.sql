# Drop Tables

DROP TABLE IF EXISTS UserInfo;

# Create Tables

CREATE TABLE UserInfo(
	userInfoID INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	emailAddress VARCHAR(50) NOT NULL,
	passwordSalt VARCHAR(50) NOT NULL,
	password VARCHAR(50) NOT NULL,
	accountCreationDate DATETIME NOT NULL
);

# Insert

INSERT INTO UserInfo(userInfoID, name, emailAddress, passwordSalt, password, accountCreationDate)
			VALUES(1, 'John Snow', 'johnsnow@gmail.com', '$/jfie3', 'dfasdfjkdafi32423095', '0000-00-00 00:00:00');
INSERT INTO UserInfo(userInfoID, name, emailAddress, passwordSalt, password, accountCreationDate)
			VALUES(2, 'John Doe', 'johndoe@gmail.com', '$/jfidfsjke3', 'dfasdfjdfalkdsf32341kdaf5', '0000-00-00 00:00:00');
