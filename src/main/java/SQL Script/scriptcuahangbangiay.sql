-- MySQL Script generated by MySQL Workbench
-- Thu Mar 30 20:13:09 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema cuahangbangiay
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema cuahangbangiay
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cuahangbangiay` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `cuahangbangiay` ;

-- -----------------------------------------------------
-- Table `cuahangbangiay`.`phanloai`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`phanloai` (
  `IDPhanLoai` INT NOT NULL AUTO_INCREMENT,
  `Loai` VARCHAR(0) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  `Mota` VARCHAR(0) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  PRIMARY KEY (`IDPhanLoai`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`giay`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`giay` (
  `IDGiay` INT NOT NULL AUTO_INCREMENT,
  `Ten` VARCHAR(50) NULL DEFAULT NULL,
  `Size` DOUBLE NULL DEFAULT NULL,
  `Mau` VARCHAR(10) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  `VatLieu` VARCHAR(50) NULL DEFAULT NULL,
  `Anh` LONGBLOB NULL DEFAULT NULL,
  `GiaBan` DECIMAL(19,4) NULL DEFAULT NULL,
  `IDPhanLoai` INT NULL DEFAULT NULL,
  `ThemMoTa` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`IDGiay`),
  INDEX `IDPhanLoai` (`IDPhanLoai` ASC) VISIBLE,
  CONSTRAINT `giay_ibfk_1`
    FOREIGN KEY (`IDPhanLoai`)
    REFERENCES `cuahangbangiay`.`phanloai` (`IDPhanLoai`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`nhacungcap`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`nhacungcap` (
  `IDNhaCungCap` INT NOT NULL AUTO_INCREMENT,
  `Ten` VARCHAR(0) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  `SDT` INT NULL DEFAULT NULL,
  `Email` VARCHAR(0) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  `ThoiGianHopTac` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`IDNhaCungCap`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`hoadon`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`hoadon` (
  `IDHoaDon` INT NOT NULL AUTO_INCREMENT,
  `NgayLap` DATE NULL DEFAULT NULL,
  `IDKhachHang` INT NULL DEFAULT NULL,
  `TongTien` DECIMAL(19,4) NULL DEFAULT NULL,
  `IDNhanVien` INT NULL DEFAULT NULL,
  `IDNhaCungCap` INT NULL DEFAULT NULL,
  PRIMARY KEY (`IDHoaDon`),
  INDEX `IDNhanVien_idx` (`IDNhanVien` ASC) VISIBLE,
  INDEX `IDNhaCungCap` (`IDNhaCungCap` ASC) VISIBLE,
  CONSTRAINT `IDNhaCungCap`
    FOREIGN KEY (`IDNhaCungCap`)
    REFERENCES `cuahangbangiay`.`nhacungcap` (`IDNhaCungCap`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`chitiethoadon`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`chitiethoadon` (
  `IDHoaDon` INT NULL DEFAULT NULL,
  `IDGiay` INT NULL DEFAULT NULL,
  `SoLuong` INT NULL DEFAULT NULL,
  INDEX `IDGiay` (`IDGiay` ASC) VISIBLE,
  INDEX `IDHoadon` (`IDHoaDon` ASC) VISIBLE,
  CONSTRAINT `chitiethoadon_ibfk_1`
    FOREIGN KEY (`IDGiay`)
    REFERENCES `cuahangbangiay`.`giay` (`IDGiay`),
  CONSTRAINT `IDHoadon`
    FOREIGN KEY (`IDHoaDon`)
    REFERENCES `cuahangbangiay`.`hoadon` (`IDHoaDon`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`phieunhap`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`phieunhap` (
  `IDPhieuNhap` INT NOT NULL AUTO_INCREMENT,
  `NgayTaoPhieu` DATE NULL DEFAULT NULL,
  `IDNhanVien` INT NULL DEFAULT NULL,
  `TongTienNhap` DECIMAL(19,4) NULL DEFAULT NULL,
  `IDNhaCungCap` INT NULL DEFAULT NULL,
  PRIMARY KEY (`IDPhieuNhap`),
  INDEX `IDNhanVien_idx` (`IDNhanVien` ASC) VISIBLE,
  INDEX `IDNhaCungCap_idx` (`IDNhaCungCap` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`chitietphieunhap`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`chitietphieunhap` (
  `IDPhieuNhap` INT NULL DEFAULT NULL,
  `IDGiay` INT NULL DEFAULT NULL,
  `Gia` DECIMAL(19,4) NULL DEFAULT NULL,
  `Soluong` INT NULL DEFAULT NULL,
  INDEX `IDGiay` (`IDGiay` ASC) VISIBLE,
  INDEX `IDPhieuNhap_idx` (`IDPhieuNhap` ASC) VISIBLE,
  CONSTRAINT `chitietphieunhap_ibfk_1`
    FOREIGN KEY (`IDGiay`)
    REFERENCES `cuahangbangiay`.`giay` (`IDGiay`),
  CONSTRAINT `IDPhieuNhap`
    FOREIGN KEY (`IDPhieuNhap`)
    REFERENCES `cuahangbangiay`.`phieunhap` (`IDPhieuNhap`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`the`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`the` (
  `IDThe` INT NOT NULL AUTO_INCREMENT,
  `Loai` VARCHAR(20) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  `HeSo` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`IDThe`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`khachhang`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`khachhang` (
  `IDKhachHang` INT NOT NULL AUTO_INCREMENT,
  `IDThe` INT NULL DEFAULT NULL,
  `NgayLapThe` DATE NULL DEFAULT NULL,
  `HoVaTen` VARCHAR(100) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  `GioiTinh` VARCHAR(100) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  `NgaySinh` DATE NULL DEFAULT NULL,
  `DiaChi` VARCHAR(100) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  PRIMARY KEY (`IDKhachHang`),
  INDEX `IDThe` (`IDThe` ASC) VISIBLE,
  CONSTRAINT `IDThe`
    FOREIGN KEY (`IDThe`)
    REFERENCES `cuahangbangiay`.`the` (`IDThe`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`loainv`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`loainv` (
  `IDLoai` INT NOT NULL AUTO_INCREMENT,
  `TenLoai` VARCHAR(50) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  `GhiChu` VARCHAR(50) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  PRIMARY KEY (`IDLoai`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`manhinh`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`manhinh` (
  `IDManHinh` INT NOT NULL AUTO_INCREMENT,
  `TenManHinh` VARCHAR(0) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  `GhiChu` VARCHAR(0) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  PRIMARY KEY (`IDManHinh`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`nhanvien`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`nhanvien` (
  `IDNhanVien` INT NOT NULL AUTO_INCREMENT,
  `HoVaTen` VARCHAR(0) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  `SDT` INT NULL DEFAULT NULL,
  `NgaySinh` DATE NULL DEFAULT NULL,
  `email` VARCHAR(20) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  `Luong` DOUBLE NULL DEFAULT NULL,
  `IDLoai` INT NULL DEFAULT NULL,
  PRIMARY KEY (`IDNhanVien`),
  UNIQUE INDEX `UQ__NhanVien__CA1930A59FB4B072` (`SDT` ASC) VISIBLE,
  INDEX `IDLoai` (`IDLoai` ASC) VISIBLE,
  CONSTRAINT `IDLoai`
    FOREIGN KEY (`IDLoai`)
    REFERENCES `cuahangbangiay`.`loainv` (`IDLoai`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`nguoidung`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`nguoidung` (
  `IDNguoiDung` INT NOT NULL AUTO_INCREMENT,
  `IDNhanVien` INT NULL DEFAULT NULL,
  `TenDangNhap` VARCHAR(0) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  `TenTaiKhoan` VARCHAR(100) NULL DEFAULT NULL,
  `MatKhau` VARCHAR(0) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  PRIMARY KEY (`IDNguoiDung`),
  UNIQUE INDEX `UQ__NguoiDun__B106EAF8671942A3` (`TenTaiKhoan` ASC) VISIBLE,
  INDEX `IDNhanVien_idx` (`IDNhanVien` ASC) VISIBLE,
  CONSTRAINT `IDNhanVien`
    FOREIGN KEY (`IDNhanVien`)
    REFERENCES `cuahangbangiay`.`nhanvien` (`IDNhanVien`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`nhom`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`nhom` (
  `IDNhom` INT NOT NULL AUTO_INCREMENT,
  `TenNhom` VARCHAR(0) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  PRIMARY KEY (`IDNhom`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`nhomvanguoidung`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`nhomvanguoidung` (
  `IDNguoiDung` INT NULL DEFAULT NULL,
  `IDNhom` INT NULL DEFAULT NULL,
  `GhiChu` VARCHAR(0) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NULL DEFAULT NULL,
  INDEX `IDNguoiDung` (`IDNguoiDung` ASC) VISIBLE,
  INDEX `IDNhom_idx` (`IDNhom` ASC) VISIBLE,
  CONSTRAINT `IDNguoiDung`
    FOREIGN KEY (`IDNguoiDung`)
    REFERENCES `cuahangbangiay`.`nguoidung` (`IDNguoiDung`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `cuahangbangiay`.`phanquyen`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cuahangbangiay`.`phanquyen` (
  `IDManHinh` INT NULL DEFAULT NULL,
  `IDNhom` INT NULL DEFAULT NULL,
  `CoQuyen` TINYINT(1) NULL DEFAULT NULL,
  INDEX `IDNhom_idx` (`IDNhom` ASC) VISIBLE,
  INDEX `IDManHinh_idx` (`IDManHinh` ASC) VISIBLE,
  CONSTRAINT `IDManHinh`
    FOREIGN KEY (`IDManHinh`)
    REFERENCES `cuahangbangiay`.`manhinh` (`IDManHinh`),
  CONSTRAINT `IDNhom`
    FOREIGN KEY (`IDNhom`)
    REFERENCES `cuahangbangiay`.`nhom` (`IDNhom`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
