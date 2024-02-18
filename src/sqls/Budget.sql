use eslota;

create schema budget;

create table budget.BudgetEntries (
ID int IDENTITY PRIMARY KEY,
EntryDate datetime NOT NULL DEFAULT getdate(),
EntryName nvarchar(255) NOT NULL,
Amount money NOT NULL
);

insert into budget.BudgetEntries(Budget
SELECT*FROM budget.BudgetEntries;