CREATE TABLE user(
  Id INT(21) NOT NULL,
  FirstName VARCHAR(255),
  MiddleName VARCHAR(255),
  LastName VARCHAR(255),
  Age INT(3),
  PRIMARY KEY (Id)
);
CREATE TABLE email(
  Id INT(21) NOT NULL,
  UserId INT(21) NOT NULL,
  EmailId VARCHAR(255),
  PRIMARY KEY (Id),
  FOREIGN KEY (UserId) REFERENCES user(Id)
);
CREATE TABLE phone(
  Id INT(21) NOT NULL,
  UserId INT(21) NOT NULL,
  PhoneNumber LONG,
  PRIMARY KEY (Id),
  FOREIGN KEY (UserId) REFERENCES user(Id)
);
CREATE TABLE Role(
  Id INT(21) NOT NULL,
  UserId INT(21) NOT NULL,
  RoleType VARCHAR(255) NOT NULL,
  PRIMARY KEY (Id),
  FOREIGN KEY (UserId) REFERENCES user(Id)
);
CREATE TABLE password(
  Id INT(21) NOT NULL,
  UserId INT(21) NOT NULL,
  password VARCHAR(255),
  PRIMARY KEY (Id),
  FOREIGN KEY (UserId) REFERENCES user(Id)
);
CREATE TABLE password_recovery(
  Id INT(21) NOT NULL,
  UserId INT(21) NOT NULL,
  Question1 VARCHAR(255),
  Question2 VARCHAR(255),
  Question3 VARCHAR(255),
  Question4 VARCHAR(255),
  Question5 VARCHAR(255),
  PRIMARY KEY (Id),
  FOREIGN KEY (UserId) REFERENCES user(Id)
);
CREATE TABLE address(
  Id INT(21) NOT NULL,
  UserId INT(21) NOT NULL,
  Address VARCHAR(255),
  District VARCHAR(255),
  City VARCHAR(255),
  PostalCode INT,
  State VARCHAR(255),
  Country VARCHAR(255),
  Phone LONG,
  PRIMARY KEY (Id),
  FOREIGN KEY (UserId) REFERENCES user(Id)
)
