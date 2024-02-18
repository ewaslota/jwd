use eslota;
GO

create schema budget;
GO

create table budget.BudgetEntries (
ID int IDENTITY PRIMARY KEY,
EntryDate datetime NOT NULL DEFAULT getdate(),
EntryName nvarchar(255) NOT NULL,
Amount money NOT NULL
);
GO

SELECT*FROM budget.BudgetEntries;
INSERT INTO budget.BudgetEntries(EntryName, Amount) VALUES ('obiad', -47);
INSERT INTO budget.BudgetEntries(EntryName, Amount) VALUES ('WYPŁATA', 6000);