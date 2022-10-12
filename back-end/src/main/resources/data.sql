/*
 数据库：stu_pallet
 */
create table if not exists user
(
    id           int auto_increment
    primary key,
    userName     varchar(30) null,
    userAccount  varchar(30) null,
    userPassword varchar(30) null
    )
    comment '用户表';

