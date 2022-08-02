CREATE DATABASE Project_Sem2
GO
USE Project_Sem2
GO
delete from Account WHERE idAccount = 1
update Account set role = 0 WHERE idAccount = 5
SELECT * FROM Account
CREATE TABLE Account(
    idAccount INT IDENTITY PRIMARY KEY,
    name nvarchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    password varchar(255) NOT NULL,
    avatar varchar(255) DEFAULT('https://anhdep123.com/wp-content/uploads/2020/11/avatar-facebook-mac-dinh-nam.jpeg'),
    birthDay DATETIME NOT NULL,
    phone varchar(20) NOT NULL,
    city nvarchar(255) NOT NULL,
    district nvarchar(255) NOT NULL,
    wards NVARCHAR(200) NOT NULL,
    street NVARCHAR(100) NOT NULL,
    apartmentNumber nvarchar(100) NOT NULL,
    zipcode varchar(50) NOT NULL,
    role bit DEFAULT(1),
    statusAccount bit DEFAULT 1,
    created_at_Account DATETIME DEFAULT getdate(),
)
GO
SELECT * FROM Role
DELETE FROM Account WHERE idAccount = 7

GO
INSERT INTO Account VALUES ('name','email','password','avt',19-07-2002,'city','district','wards','street','apart','zip',0,19-04-2022)
GO
SELECT * FROM InsurancePackages
GO
CREATE TABLE InformationCar(
    idInformationCar INT IDENTITY PRIMARY KEY,
    carCompany NVARCHAR(100) NOT NULL,
    carLine NVARCHAR(50) NOT NULL,
    carType NVARCHAR(50) NOT NULL,
    yearOfManufacture INT NOT NULL,
    frameNumber VARCHAR(100) NOT NULL,
    engineNumber VARCHAR(100) NOT NULL,
    seaOfControl VARCHAR(20) NOT NULL,
    seats int NOT NULL,
    idAccount INT,
    statusInformationCar bit DEFAULT 1,
    created_at_InformationCar DATETIME DEFAULT getdate(),
)
ALTER TABLE InformationCar ADD FOREIGN KEY (idAccount) REFERENCES Account(idAccount)
GO
SELECT * FROM [dbo].[InformationCar]
GO
INSERT INTO InformationCar(carCompany,carLine,carType,yearOfManufacture,frameNumber,engineNumber,seaOfControl,seats,idAccount) VALUES('Mec','C300','AMG','2020','9831DJASIJHEQ','KJEQWJKBJA123JQ','29X5-71222',4,3)
CREATE TABLE InsurancePackages(
    idPackage INT IDENTITY PRIMARY KEY,
    namePackage NVARCHAR(100) NOT NULL,
    imagePackage varchar(255) NOT NULL,
    statusPackage bit DEFAULT 1,
    created_at_Package DATETIME DEFAULT getdate(),
)
SELECT * FROM InformationCar
GO
CREATE TABLE DetailPackage(
    idDetailPackage INT IDENTITY PRIMARY KEY,
    idPackage INT,
    descriptionPackage TEXT,
    insuranceFees FLOAT,
    compensation FLOAT,
    status bit DEFAULT 1,
    created_at DATETIME DEFAULT getdate(),
)
Select * FROM DetailPackage
INSERT INTO DetailPackage VALUES (1,N'diuahduihiuqw',1000,1000,1,'2022-05-13')
ALTER TABLE DetailPackage ADD FOREIGN KEY (idPackage) REFERENCES InsurancePackages(idPackage)
GO
create TABLE OrderInsurance(
    idOrder INT IDENTITY PRIMARY KEY,
    idPackage INT,
    idInformationCar INT,
    idAccount INT,
    numberYearInsurance INT,
    statusOrder bit DEFAULT 1,
    created_at_Order DATETIME DEFAULT getdate(),
)
GO
ALTER TABLE OrderInsurance ADD FOREIGN KEY (idPackage) REFERENCES InsurancePackages(idPackage);
ALTER TABLE OrderInsurance ADD FOREIGN KEY (idInformationCar) REFERENCES InformationCar(idInformationCar);
ALTER TABLE OrderInsurance ADD FOREIGN KEY (idAccount) REFERENCES Account(idAccount);
GO
CREATE TABLE ContractInsurance(
    idContract INT PRIMARY KEY IDENTITY NOT NULL,
    idOrder INT,
    idAccount INT,
    idInformationCar INT,
    idPackage INT,
    dayStartInsurance DATETIME,
    dayEndInsurance DATETIME,
    status bit DEFAULT 1,
    created_at DATETIME DEFAULT getdate(),
)
ALTER TABLE ContractInsurance ADD FOREIGN KEY (idOrder) REFERENCES OrderInsurance(idOrder);
ALTER TABLE ContractInsurance ADD FOREIGN KEY (idAccount) REFERENCES Account(idAccount);
ALTER TABLE ContractInsurance ADD FOREIGN KEY (idInformationCar) REFERENCES InformationCar(idInformationCar);
ALTER TABLE ContractInsurance ADD FOREIGN KEY (idPackage) REFERENCES InsurancePackages(idPackage);
GO
CREATE TABLE Banner(
    idBanner int IDENTITY PRIMARY KEY,
    titleBanner NVARCHAR(100) NOT NULL,
    nameBanner NVARCHAR(100) NOT NULL,
    imgBanner VARCHAR(255) NOT NULL,
    description NVARCHAR(255) NOT NULL,
    status bit DEFAULT 1,
    created_at DATETIME DEFAULT GETDATE()
)