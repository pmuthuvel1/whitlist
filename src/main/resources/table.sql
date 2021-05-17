CREATE TABLE TBL_MOBILE_WHITELIST (
MOBILE_ID  SERIAL PRIMARY KEY, 
MSISDN  VARCHAR(20) NOT NULL UNIQUE ,
IMSI VARCHAR(25) ,
CREATED_ON TIMESTAMP DEFAULT now(),
CREATED_BY VARCHAR(20) DEFAULT 'SYSTEM',
UPDATED_ON TIMESTAMP DEFAULT now(),
UPDATED_BY VARCHAR(20) DEFAULT 'SYSTEM',
DELETION_STATUS CHAR(1) DEFAULT 'N');

CREATE TABLE TBL_FIXED_WHITELIST (
FIXED_ID  SERIAL PRIMARY KEY, 
ACCOUNT_NUMBER  VARCHAR(20) NOT NULL ,
CREATED_ON TIMESTAMP DEFAULT now(),
CREATED_BY VARCHAR(20) DEFAULT 'SYSTEM',
UPDATED_ON TIMESTAMP DEFAULT now(),
UPDATED_BY VARCHAR(20) DEFAULT 'SYSTEM',
DELETION_STATUS CHAR(1) DEFAULT 'N');

CREATE TABLE TBL_ISP_WHITELIST (
ISP_ID  SERIAL PRIMARY KEY, 
USER_ID  VARCHAR(20) NOT NULL ,
DOMAIN_NAME VARCHAR(25) NOT NULL  ,
CREATED_ON TIMESTAMP DEFAULT now(),
CREATED_BY VARCHAR(20) DEFAULT 'SYSTEM',
UPDATED_ON TIMESTAMP DEFAULT now(),
UPDATED_BY VARCHAR(20) DEFAULT 'SYSTEM',
DELETION_STATUS CHAR(1) DEFAULT 'N');

CREATE TABLE TBL_USERS (
ID  SERIAL PRIMARY KEY, 
USER_ID  TEXT NOT NULL UNIQUE,
PASSWORD TEXT NOT NULL  ,
ROLE_NAME VARCHAR(10) NOT NULL DEFAULT 'QA',
CREATED_ON TIMESTAMP DEFAULT now(),
CREATED_BY VARCHAR(20) DEFAULT 'SYSTEM',
UPDATED_ON TIMESTAMP DEFAULT now(),
UPDATED_BY VARCHAR(20) DEFAULT 'SYSTEM',
DELETION_STATUS CHAR(1) DEFAULT 'N');

CREATE TABLE TBL_USERS (
  id SERIAL PRIMARY KEY,
  email TEXT NOT NULL UNIQUE,
  password TEXT NOT NULL
);

INSERT INTO TBL_USERS (USER_ID, password) VALUES (
  'murugan',
  crypt('test123', gen_salt('bf'))
);