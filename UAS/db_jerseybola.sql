-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 18, 2022 at 03:41 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_jerseybola`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_cetakreport`
--

CREATE TABLE `tb_cetakreport` (
  `nik` int(36) NOT NULL,
  `nama` varchar(76) NOT NULL,
  `jenismember` varchar(72) NOT NULL,
  `merkjersey` varchar(64) NOT NULL,
  `tipejersey` varchar(74) NOT NULL,
  `hargajersey` int(58) NOT NULL,
  `totalbiaya` int(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_datajersey`
--

CREATE TABLE `tb_datajersey` (
  `kodejersey` char(55) NOT NULL,
  `merkjersey` varchar(76) NOT NULL,
  `tipejersey` varchar(79) NOT NULL,
  `hargajersey` int(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_konsumen`
--

CREATE TABLE `tb_konsumen` (
  `nik` int(30) NOT NULL,
  `nama` varchar(86) NOT NULL,
  `jenismember` varchar(70) NOT NULL,
  `potongan` int(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_login`
--

CREATE TABLE `tb_login` (
  `username` char(76) NOT NULL,
  `password` char(81) NOT NULL,
  `nama` varchar(75) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_registrasi`
--

CREATE TABLE `tb_registrasi` (
  `username` char(76) NOT NULL,
  `password` char(81) NOT NULL,
  `repassword` char(81) NOT NULL,
  `nama` varchar(75) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `merkjersey` varchar(76) NOT NULL,
  `hargajersey` int(45) NOT NULL,
  `jumlahbeli` int(50) NOT NULL,
  `potongan` int(45) NOT NULL,
  `totalbiaya` int(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
