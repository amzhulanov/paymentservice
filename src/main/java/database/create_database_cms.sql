CREATE DATABASE paymentSRV;
CREATE USER payment WITH PASSWORD 'paymentpassword';
GRANT ALL PRIVILEGES ON DATABASE paymentSRV TO payment;
\c paymentsrv
CREATE SCHEMA paymentsrv AUTHORIZATION payment;
SET search_path TO paymentsrv;

