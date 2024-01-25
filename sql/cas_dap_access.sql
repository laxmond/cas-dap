create table access_server_port
(
    id                int auto_increment comment '主键'
        primary key,
    port              int         not null comment '端口',
    transfer_protocol varchar(16) null comment '传输协议',
    status            bit         null comment '状态（0-不可用;1-可用）'
)
    comment '数据接入端口配置';
use cas_dap_access;
insert into access_server_port(port, transfer_protocol, status) values(30000, 'HJ212', 1);