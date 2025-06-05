create database quanlysach1;
go
use quanlysach1;
go

-- Tạo bảng sach với ma_sach là varchar
create table sach (
    ma_sach varchar(10) primary key,
    ten_sach nvarchar(100)
);
go

-- Thêm 3 bộ dữ liệu vào bảng sach
insert into sach (ma_sach, ten_sach) values ('s01', N'Sách Lập Trình C++');
insert into sach (ma_sach, ten_sach) values ('s02', N'Cơ Sở Dữ Liệu');
insert into sach (ma_sach, ten_sach) values ('s03', N'Kỹ Thuật Phần Mềm');
go