create table credit_offer
(
    id                   uuid primary key,
    name_of_credit_offer text,
    amount_of_money      bigint,
    percent              float8,
    duration_in_days     int
);