USE AdventureWorks;
-- wszystkie wiersze (wszystkie kolumny) tabeli [SalesOrderHeader]
SELECT*FROM Sales.SalesOrderHeader;
--3 wybrane kolumny tabeli [SalesOrderHeader] posortowanie wg kolumny ModifiedDate malej�co
SELECT ModifiedDate, CustomerID, SalesPersonID FROM Sales.SalesOrderHeader
ORDER BY ModifiedDate DESC
--3 kolumny tabeli [Person].[Contact], posortowane wg LastName malej�co i FirstName rosn�co
SELECT EmailAddress, LastName, FirstName FROM Person.Contact
ORDER BY LastName DESC, FirstName ASC

--wszystkie wiersze z tabeli Person.Contact zawieraj�ce �Michael� w kolumnie FirstName, posortowane wg kolumny Lastname
--wszystkie dane kontaktowe (tabela Person.Contact) os�b o innym imieniu ni� �Michael� i nazwisku zaczynaj�cym si� na Ac (zapytanie zwr�ci 4 wiersze)
--wszystkie dane kontaktowe zmodyfikowane mi�dzy 1, a 22 wrze�nia 2003 (928 wierszy)
--10 ostatnio zatrudnionych pracownik�w
--10 najstarszych pracownik�w p�ci �e�skiej
--pracownik�w, kt�rych stanowisko (kolumna Title) zaczyna si� na �Production Technician�, lub �Tool Designer�, posortowani wg nazwy stanowiska
--nazwy stanowisk bez duplikat�w (67 wierszy)
--3 kolumny z tabeli Person.Contact, korzystaj�c z alias�w, przet�umacz nazwy kolumn w wyniku na j�zyk polski: FirstName=Imie, LastName=Nazwisko, Phone=Telefon

--Polecenie: