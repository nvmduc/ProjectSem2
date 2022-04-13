CREATE DATABASE Project_Sem2
GO
USE Project_Sem2
GO
CREATE TABLE Account(
    idAccount INT IDENTITY PRIMARY KEY,
    name varchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    password varchar(255) NOT NULL,
    avatar varchar(255) DEFAULT('https://anhdep123.com/wp-content/uploads/2020/11/avatar-facebook-mac-dinh-nam.jpeg'),
    birthDay DATETIME NOT NULL,
    city nvarchar(255) NOT NULL,
    district nvarchar(255) NOT NULL,
    wards NVARCHAR(200) NOT NULL,
    street NVARCHAR(100) NOT NULL,
    apartmentNumber varchar(100) NOT NULL,
    zipcode varchar(50) NOT NULL,
    statusAccount bit DEFAULT(1),
    created_at_Account DATETIME DEFAULT(GETDATE()),
)
GO
CREATE TABLE Role(
    idRole INT IDENTITY PRIMARY KEY,
    nameRole nvarchar(100),
    statusRole bit DEFAULT(1),
    created_at_Role DATETIME DEFAULT(GETDATE()),
)
GO
CREATE TABLE Account_Role(
    idAccountRole INT IDENTITY PRIMARY KEY,
    idRole INT,
    idAccount INT,
    status bit DEFAULT(1),
    created_at DATETIME DEFAULT(GETDATE()),
)
GO
ALTER TABLE Account_Role ADD FOREIGN KEY (idRole) REFERENCES Role(idRole)
ALTER TABLE Account_Role ADD FOREIGN KEY (idAccount) REFERENCES Account(idAccount)
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
    idAccount INT,
    statusInformationCar bit DEFAULT(1),
    created_at_InformationCar DATETIME DEFAULT(GETDATE()),
)
ALTER TABLE InformationCar ADD FOREIGN KEY (idAccount) REFERENCES Account(idAccount)
GO
CREATE TABLE InsurancePackages(
    idPackage INT IDENTITY PRIMARY KEY,
    namePackage NVARCHAR(100) NOT NULL,
    imagePackage varchar(255) NOT NULL,
    statusPackage bit DEFAULT(1),
    created_at_Package DATETIME DEFAULT(GETDATE()),
)
GO
CREATE TABLE DetailPackage(
    idDetailPackage INT IDENTITY PRIMARY KEY,
    idPackage INT,
    descriptionPackage TEXT,
    insuranceFees FLOAT,
    compensation FLOAT,
    status bit DEFAULT(1),
    created_at DATETIME DEFAULT(GETDATE()),
)
ALTER TABLE DetailPackage ADD FOREIGN KEY (idPackage) REFERENCES InsurancePackages(idPackage)
GO
CREATE TABLE Evaluate(
    idEvaluate INT IDENTITY PRIMARY KEY,
    idAccount INT,
    contentEvaluate NTEXT NOT NULL,
    statusEvaluate bit DEFAULT(1),
    created_at_Evaluate DATETIME DEFAULT(GETDATE()),
)
GO
ALTER TABLE Evaluate ADD FOREIGN KEY (idAccount) REFERENCES Account(idAccount);
GO
create TABLE OrderInsurance(
    idOrder INT IDENTITY PRIMARY KEY,
    idPackage INT,
    idInformationCar INT,
    idAccount INT,
    numberYearInsurance INT,
    statusOrder bit DEFAULT(1),
    created_at_Order DATETIME DEFAULT(GETDATE()),
)
GO
ALTER TABLE OrderInsurance ADD FOREIGN KEY (idPackage) REFERENCES InsurancePackages(idPackage);
ALTER TABLE OrderInsurance ADD FOREIGN KEY (idInformationCar) REFERENCES InformationCar(idInformationCar);
ALTER TABLE OrderInsurance ADD FOREIGN KEY (idAccount) REFERENCES Account(idAccount);
GO
CREATE TABLE ContractInsurance(
    idContract VARCHAR(50) NOT NULL,
    idOrder INT,
    idAccount INT,
    idInformationCar INT,
    idPackage INT,
    dayStartInsurance DATETIME,
    dayEndInsurance DATETIME,
    status bit DEFAULT(1),
    created_at DATETIME DEFAULT(GETDATE()),
)
ALTER TABLE ContractInsurance ADD FOREIGN KEY (idOrder) REFERENCES OrderInsurance(idOrder);
ALTER TABLE ContractInsurance ADD FOREIGN KEY (idAccount) REFERENCES Account(idAccount);
ALTER TABLE ContractInsurance ADD FOREIGN KEY (idInformationCar) REFERENCES InformationCar(idInformationCar);
ALTER TABLE ContractInsurance ADD FOREIGN KEY (idPackage) REFERENCES InsurancePackages(idPackage);
