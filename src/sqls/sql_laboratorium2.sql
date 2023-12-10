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
	EmailAddress int
	Passt datetime
	Firstname nvarchar(128)
	Lastname nvarchar(MAX)
	RegisterTime datetime
	RegConfirmTime datetime
	ForumPostsCnt int
)
GO