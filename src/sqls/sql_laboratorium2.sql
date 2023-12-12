-- https://java.mmiklas.wszib.edu.pl/dodatki/lab-sql2.html
USE eslota
DROP SCHEMA IF EXISTS Forum;

CREATE SCHEMA Forum;
GO

CREATE TABLE Forum.Topics (
	ID int
	ParentID int
	CreateTime datetime
	TopicSubject nvarchar(128)
	TopicBody nvarchar(MAX)
	AuthorID int
	ClueID int
	ViewsCnt int
	AnswersCnt int
)
GO

CREATE TABLE Forum.UserStats (
  ID int
  UserID int
  TopicID int
  Times datetimes
)
GO

CREATE TABLE Forum.User (
	ID int
	EmailAddress nvarchar(100)
	Pass nvarchar(250)
	Firstname nvarchar(100)
	Lastname nvarchar(100)
	RegisterTime datetime
	RegConfirmTime datetime
	ForumPostsCnt int
)
GO

CREATE TABLE Forum.Clues (
    ID int
    Name nvarchar(50)
    Descript nvarchar(400)
    TopicsCnt int
)
GO

CREATE TABLE Forum.UsersLogins (
    ID int
    UserID int
    LoginTime datetime
    IPAddress varchar(30)
    HostName nvarchar(100)
)
GO