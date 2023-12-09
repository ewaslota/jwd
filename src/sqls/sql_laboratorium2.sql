-- https://java.mmiklas.wszib.edu.pl/dodatki/lab-sql2.html
USE eslota
DROP SCHEMA IF EXISTS Forum;

CREATE SCHEMA Forum;
GO

CREATE TABLE Topics (
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

CREATE TABLE UserStats (
  ID int PRIMARY KEY,
  UserID
  TopicID
  Times
)