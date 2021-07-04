drop table if EXISTS ndfl;
CREATE table ndfl
(
    id                   UUID PRIMARY KEY,
    firstName            varchar(30) NOT NULL,
    surname              varchar(30) NOT NULL,
    patronymic           varchar(40) NOT NULL,
    inn                  int,
    kpp                  int,
    innInRF              int,
    theTaxpayerStatus    int,
    dateBirthday         date,
    codeCountry          int,
    codeDocument         int,
    serialDocument       int,
    numberDocument       int,
    sumSalary            int,
    taxBase              int,
    taxAmount            int,
    taxAmountCalculated  int,
    taxAmountWithheld    int,
    sumSalaryNotWithHeld int,
    sumSalaryNonDex      int
);