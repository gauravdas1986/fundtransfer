INSERT INTO banking_core_user (id, email, first_name, identification_number, last_name)
VALUES ('1', 'sam@gmail.com', 'Arun', '808829932V', 'Kumar');
INSERT INTO banking_core_user (id, email, first_name, identification_number, last_name)
VALUES ('2', 'guru@gmail.com', 'Guru', '901830556V', 'Darmaraj');
INSERT INTO banking_core_user (id, email, first_name, identification_number, last_name)
VALUES ('3', 'ragu@gmail.com', 'Ragu', '348829932V', 'Sivaraj');
INSERT INTO banking_core_user (id, email, first_name, identification_number, last_name)
VALUES ('4', 'randor@gmail.com', 'Ram', '842829932V', 'Manoon');

INSERT INTO banking_core_account
    (actual_balance, `number`, status, `type`, user_id)
VALUES (100000.00, 100015003000, 'ACTIVE', 'SAVINGS_ACCOUNT', '1'),
       (100000.00, 100015003002, 'ACTIVE', 'SAVINGS_ACCOUNT', '2'),
       (12000.00, 100015003005, 'ACTIVE', 'SAVINGS_ACCOUNT', '3'),
       (889000.33, 100015003013, 'ACTIVE', 'SAVINGS_ACCOUNT', '4');

