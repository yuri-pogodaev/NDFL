drop table if EXISTS ndfl;
CREATE table ndfl
(
    id                   UUID PRIMARY KEY,
    firstName            varchar(30) NOT NULL,
    surname              varchar(30) NOT NULL,
    patronymic           varchar(40) NOT NULL,
    inn                  varchar(40) NOT NULL,
    kpp                  varchar(40) NOT NULL,
    list                 varchar(4) NOT NULL ,
    infAdjNum            varchar(10) NOT NULL,
    innInRF              varchar(40) NOT NULL,
    theTaxpayerStatus    varchar(40) NOT NULL,
    dateBirthday         VARCHAR(40),
    countryCodeId          varchar(40) NOT NULL,
    documentCode         varchar(40) NOT NULL,
    serialOfDocument       varchar(40) NOT NULL,
    numberOfDocument       varchar(40) NOT NULL,
    sumSalary            varchar(40) NOT NULL,
    taxBase              varchar(40) NOT NULL,
    taxAmount            varchar(40) NOT NULL,
    taxTrans             varchar(40) NOT NULL,
    taxAmountCalculated  varchar(40) NOT NULL,
    taxAmountWithheld    varchar(40) NOT NULL,
    sumSalaryNotWithHeld varchar(40) NOT NULL,
    sumSalaryNonDex      varchar(40) NOT NULL
);