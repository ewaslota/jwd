use eslota
go

create schema budget;
go

create table budget.BudgetEntries (
	ID int IDENTITY PRIMARY KEY,
	EntryDate datetime NOT NULL DEFAULT getdate(),
	EntryName nvarchar(255) NOT NULL,
	Amount money NOT NULL
);

select * from budget.BudgetEntries