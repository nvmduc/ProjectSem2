CREATE DATABASE Project_Sem2
GO
USE Project_Sem2
GO
CREATE TABLE Account(
    idAccount INT IDENTITY PRIMARY KEY,
    nameAccount varchar(100) NOT NULL,
    emailAccount varchar(100) NOT NULL,
    passwordAccount varchar(255) NOT NULL,
    statusAccount bit DEFAULT(1),
    created_at_Account DATETIME DEFAULT(GETDATE()),
)
GO
CREATE TABLE DetailAccound(
    idDetailAccount INT IDENTITY PRIMARY KEY,
    avatar varchar(255) DEFAULT('https://anhdep123.com/wp-content/uploads/2020/11/avatar-facebook-mac-dinh-nam.jpeg'),
    birthDay DATETIME NOT NULL,
    city nvarchar(255) NOT NULL,
    district nvarchar(255) NOT NULL,
    wards NVARCHAR(200) NOT NULL,
    street NVARCHAR(100) NOT NULL,
    apartmentNumber varchar(100) NOT NULL,
    zipcode varchar(50) NOT NULL,
    idAccount INT,
    status bit DEFAULT(1),
    created_at DATETIME DEFAULT(GETDATE()),
)
GO
ALTER TABLE DetailAccound ADD FOREIGN KEY (idAccount) REFERENCES Account(idAccount);
GO
CREATE TABLE YearOfManufacture(
    idYear INT IDENTITY PRIMARY KEY,
    yearName INT NOT NULL,
    statusYearOfManufacture bit DEFAULT(1),
    created_at_Year DATETIME DEFAULT(GETDATE()),
)
GO
CREATE TABLE CarCompany(
    idCarCompany INT IDENTITY PRIMARY KEY,
    nameCarCompany nvarchar(100) NOT NULL,
    idYear INT,
    statusCarCompany bit DEFAULT(1),
    created_at_CarCompany DATETIME DEFAULT(GETDATE()),
)
GO
ALTER TABLE CarCompany ADD FOREIGN KEY (idYear) REFERENCES YearOfManufacture(idYear);
GO
CREATE TABLE CarBrand(
    idCarBrand INT IDENTITY PRIMARY KEY,
    nameCarBrand NVARCHAR(50),
    idCarCompany INT,
    statusCarBrand bit DEFAULT(1),
    created_at_CarBrand DATETIME DEFAULT(GETDATE()),
)

CREATE TABLE CarType(
    idCarType INT IDENTITY PRIMARY KEY,
    nameCarType NVARCHAR(100),
    idCarBrand INT,
    statusCarType bit DEFAULT(1),
    created_at_CarType DATETIME DEFAULT(GETDATE()),
)
GO
ALTER TABLE CarType ADD FOREIGN KEY (idCarBrand) REFERENCES CarBrand(idCarBrand);
GO
CREATE TABLE InformationCar(
    idInformationCar INT IDENTITY PRIMARY KEY,
    idYear INT,
    idCarCompany INT,
    idCarBrand INT,
    idCarType INT,
    statusInformationCar bit DEFAULT(1),
    created_at_InformationCar DATETIME DEFAULT(GETDATE()),
)
GO
ALTER TABLE InformationCar ADD FOREIGN KEY (idYear) REFERENCES YearOfManufacture(idYear);
ALTER TABLE InformationCar ADD FOREIGN KEY (idCarCompany) REFERENCES CarCompany(idCarCompany);
ALTER TABLE InformationCar ADD FOREIGN KEY (idCarBrand) REFERENCES CarBrand(idCarBrand);
ALTER TABLE InformationCar ADD FOREIGN KEY (idCarType) REFERENCES CarType(idCarType);
GO
CREATE TABLE InsurancePackage(
    idPackage INT IDENTITY PRIMARY KEY,
    namePackage NVARCHAR(100) NOT NULL,
    imagePackage varchar(255) NOT NULL,
    statusPackage bit DEFAULT(1),
    created_at_Package DATETIME DEFAULT(GETDATE()),
)
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
CREATE TABLE OrderInsurance(
    idOrder INT IDENTITY PRIMARY KEY,
    idInsurancePackage INT,
    idInformationCar INT,
    idAccount INT,
    statusOrder bit DEFAULT(1),
    created_at_Order DATETIME DEFAULT(GETDATE()),
)
GO
ALTER TABLE OrderInsurance ADD FOREIGN KEY (idInsurancePackage) REFERENCES InsurancePackage(idPackage);
ALTER TABLE OrderInsurance ADD FOREIGN KEY (idInformationCar) REFERENCES InformationCar(idInformationCar);
ALTER TABLE OrderInsurance ADD FOREIGN KEY (idAccount) REFERENCES Account(idAccount);

