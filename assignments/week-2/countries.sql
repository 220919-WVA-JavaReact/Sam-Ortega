CREATE TABLE country_info (
country varchar(255),
abbrv varchar(255),
"population in Millions" decimal(5,2),
continent varchar(255),
does_country_touch_usa boolean
);



INSERT INTO country_info
VALUES ('Canada', 'CA', 38.01, 'North America', TRUE);

INSERT INTO country_info
VALUES ('Germany', 'DE', 83.2, 'Europe', FALSE);

INSERT INTO country_info
VALUES ('Scotland', 'SCT', 5.45, 'Europe', FALSE);

INSERT INTO country_info
VALUES ('Mexico', 'MX', 128.9, 'North America', TRUE);

INSERT INTO country_info
VALUES ('Japan', 'JP', 125.8, 'Asia', FALSE);
