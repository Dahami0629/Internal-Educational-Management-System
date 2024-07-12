-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2024 at 10:31 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sector`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` varchar(20) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `mail`, `password`, `name`) VALUES
('1', 'admin@gmail.com', 'admin', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `g12_enrollment`
--

CREATE TABLE `g12_enrollment` (
  `id` int(20) NOT NULL,
  `month` varchar(20) NOT NULL,
  `tid` varchar(20) NOT NULL,
  `sid` varchar(20) NOT NULL,
  `payment` varchar(20) NOT NULL,
  `fees` double(11,2) NOT NULL,
  `nic` varchar(50) NOT NULL,
  `mail` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `g12_enrollment`
--

INSERT INTO `g12_enrollment` (`id`, `month`, `tid`, `sid`, `payment`, `fees`, `nic`, `mail`) VALUES
(1, 'June', 'T01', 'SA815', 'Paid', 3000.00, '200210602079', 'imethradawa12@gmail.com'),
(2, 'June', 'T01', 'SA225', 'Paid', 3000.00, '200168100970', 'dahamimalewana@gmail.com'),
(3, 'June', 'T01', 'SA832', 'Paid', 3000.00, '200179203167', 'ridminethmini10@gmail.com'),
(4, 'June', 'T01', 'SA278', 'Paid', 3000.00, '200351803880', 'hansani.rathnayake17@gmail.com'),
(5, 'June', 'T01', 'SA954', 'Paid', 3000.00, '200226401625', 'rayandinujaya4@gmail.com'),
(6, 'June', 'T02', 'sa225', 'Paid', 4000.00, '200168100970', 'dahamimalewana@gmail.com'),
(7, 'June', 'T02', 'sa278', 'Paid', 4000.00, '200351803880', 'hansani.rathnayake17@gmail.com'),
(8, 'June', 'T02', 'sa815', 'Paid', 4000.00, '200210602079', 'imethradawa12@gmail.com'),
(9, 'June', 'T02', 'sa832', 'Paid', 4000.00, '200179203167', 'ridminethmini10@gmail.com'),
(10, 'June', 'T02', 'sa954', 'Paid', 4000.00, '200226401625', 'rayandinujaya4@gmail.com'),
(12, 'May', 'T01', 'SA152', 'Paid', 3000.00, '200250602017', 'Sonal@gmail.com'),
(13, 'March', 'T03', 'SA225', 'Paid', 2500.00, '200168100970', 'dahamimalewana@gmail.com'),
(14, 'January', 'T01', 'SA738', 'Paid', 3000.00, '200310202087', 'onethpathiranage123@gmail.com'),
(15, 'April', 'T01', 'SA698', 'Paid', 3000.00, '95898979462', 'NilanthaSanjeewa@gmail.com'),
(16, 'May', 'T01', 'SA424', 'Not paid', 0.00, '2001581465565', 'dahamimalewana@gmail.com'),
(17, 'May', 'T02', 'SA152', 'Paid', 4000.00, '200250602017', 'Sonal@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `g12_teacher_salary`
--

CREATE TABLE `g12_teacher_salary` (
  `id` int(20) NOT NULL,
  `tid` varchar(20) NOT NULL,
  `month` varchar(50) NOT NULL,
  `student_fee` double(11,2) NOT NULL,
  `total_students` int(50) NOT NULL,
  `paid_students` int(50) NOT NULL,
  `notpaid_students` int(50) NOT NULL,
  `total_fees` double(11,2) NOT NULL,
  `monthly_salary` double(11,2) NOT NULL,
  `Institute_fee` double(11,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `g12_teacher_salary`
--

INSERT INTO `g12_teacher_salary` (`id`, `tid`, `month`, `student_fee`, `total_students`, `paid_students`, `notpaid_students`, `total_fees`, `monthly_salary`, `Institute_fee`) VALUES
(1, 'T01', 'June', 3000.00, 5, 5, 0, 15000.00, 11250.00, 3750.00);

-- --------------------------------------------------------

--
-- Table structure for table `g12_timetable`
--

CREATE TABLE `g12_timetable` (
  `id` int(20) NOT NULL,
  `tid` varchar(20) NOT NULL,
  `subject` varchar(50) NOT NULL,
  `teacher` varchar(50) NOT NULL,
  `day` varchar(50) NOT NULL,
  `start_time` varchar(100) NOT NULL,
  `end_time` varchar(100) NOT NULL,
  `hall` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `g12_timetable`
--

INSERT INTO `g12_timetable` (`id`, `tid`, `subject`, `teacher`, `day`, `start_time`, `end_time`, `hall`) VALUES
(2, 'T02', 'Physics', 'Lahiru Aththudawa', 'May 3, 2024', '12:01 AM', '02:10 AM', 'Hall 2'),
(3, 'T03', 'ICT', 'Sanoj Peiris', 'Jun 3, 2024', '03:00 PM', '07:00 PM', 'Hall 2'),
(4, 'T04', 'Chemistry', 'Dinesh Halovita', 'Jun 5, 2024', '08:00 AM', '02:00 PM', 'Hall 3'),
(5, 'T05', 'Accounting', 'Nishan Chamara', 'Jun 7, 2024', '08:00 AM', '12:00 PM', 'Hall 4'),
(6, 'T02', 'Physics', 'Lahiru Aththudawa', 'May 1, 2024', '06:30 AM', '06:30 AM', 'Hall 3'),
(7, 'T01', 'Combined Maths', 'Kasun Senarathne', 'May 1, 2024', '03:00 PM', '04:00 PM', 'Hall 1');

-- --------------------------------------------------------

--
-- Table structure for table `g13_enrollment`
--

CREATE TABLE `g13_enrollment` (
  `id` int(20) NOT NULL,
  `month` varchar(20) NOT NULL,
  `tid` varchar(20) NOT NULL,
  `sid` varchar(20) NOT NULL,
  `payment` varchar(20) NOT NULL,
  `fees` double(11,2) NOT NULL,
  `nic` varchar(50) NOT NULL,
  `mail` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `g13_enrollment`
--

INSERT INTO `g13_enrollment` (`id`, `month`, `tid`, `sid`, `payment`, `fees`, `nic`, `mail`) VALUES
(1, 'January', 'T01', 'SA788', 'Paid', 3000.00, '9920001245', 'Yudeesha@gmail.com'),
(2, 'February', 'T01', 'SA049', 'Paid', 3000.00, '200015386889', 'onethpathiranage123@gmail.com'),
(3, 'June', 'T01', 'SA075', 'Paid', 3000.00, '2001456478', 'Pasandi@gmail.com'),
(4, 'March', 'T01', 'SA608', 'Paid', 3000.00, '200210608454', 'imethjayasinghe02@gmail.com'),
(5, 'May', 'T01', 'SA365', 'Not paid', 0.00, '20021045', 'rayandinuajaya4@gmail.com'),
(6, 'May', 'T01', 'SA993', 'Paid', 3000.00, '2001581', 'dahamimalewana@gmail.com'),
(7, 'June', 'T01', 'SA670', 'Paid', 3000.00, '2003134792', 'hettiarachchithevni@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `g13_teacher_salary`
--

CREATE TABLE `g13_teacher_salary` (
  `id` int(20) NOT NULL,
  `tid` varchar(20) NOT NULL,
  `month` varchar(50) NOT NULL,
  `student_fee` double(11,2) NOT NULL,
  `total_students` int(50) NOT NULL,
  `paid_students` int(50) NOT NULL,
  `notpaid_students` int(50) NOT NULL,
  `total_fees` double(11,2) NOT NULL,
  `monthly_salary` double(11,2) NOT NULL,
  `Institute_fee` double(11,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `g13_teacher_salary`
--

INSERT INTO `g13_teacher_salary` (`id`, `tid`, `month`, `student_fee`, `total_students`, `paid_students`, `notpaid_students`, `total_fees`, `monthly_salary`, `Institute_fee`) VALUES
(1, 'T01', 'June', 3000.00, 2, 2, 0, 6000.00, 4500.00, 1500.00);

-- --------------------------------------------------------

--
-- Table structure for table `g13_timetable`
--

CREATE TABLE `g13_timetable` (
  `id` int(20) NOT NULL,
  `tid` varchar(20) NOT NULL,
  `subject` varchar(50) NOT NULL,
  `teacher` varchar(50) NOT NULL,
  `day` varchar(50) NOT NULL,
  `start_time` varchar(100) NOT NULL,
  `end_time` varchar(100) NOT NULL,
  `hall` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `g13_timetable`
--

INSERT INTO `g13_timetable` (`id`, `tid`, `subject`, `teacher`, `day`, `start_time`, `end_time`, `hall`) VALUES
(1, 'T01', 'Combined Maths', 'Kasun Senarathne', 'Jun 2, 2024', '04:00 PM', '08:00 PM', 'Hall 1'),
(2, 'T02', 'Physics', 'Lahiru Aththudawa', 'Jun 2, 2024', '08:00 AM', '12:00 PM', 'Hall 1'),
(3, 'T03', 'ICT', 'Sanoj Peiris', 'Jun 4, 2024', '03:00 PM', '08:00 PM', 'Hall 2'),
(4, 'T04', 'Chemistry', 'Dinesh Halovita', 'Jun 6, 2024', '08:00 AM', '02:00 PM', 'Hall 3'),
(5, 'T05', 'Accounting', 'Nishan Chamara', 'Jun 7, 2024', '02:00 PM', '07:00 PM', 'Hall 4');

-- --------------------------------------------------------

--
-- Table structure for table `institute_netprofit`
--

CREATE TABLE `institute_netprofit` (
  `id` int(20) NOT NULL,
  `month` varchar(50) NOT NULL,
  `total_income` double(11,2) NOT NULL,
  `inventory_cost` double(11,2) NOT NULL,
  `staff_salary` double(11,2) NOT NULL,
  `net_profit` double(11,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `id` int(20) NOT NULL,
  `month` varchar(50) NOT NULL,
  `product` varchar(100) NOT NULL,
  `quantity` int(100) NOT NULL,
  `cost` double(11,2) NOT NULL,
  `supplier` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`id`, `month`, `product`, `quantity`, `cost`, `supplier`) VALUES
(1, 'June', 'Class Cards', 100, 1000.00, 'Anushka Idunil'),
(2, 'June', 'Watter Bill', 1, 20000.00, 'Water Board'),
(3, 'June', 'Elecricity Bill', 1, 30000.00, 'C.E.B');

-- --------------------------------------------------------

--
-- Table structure for table `sector_g12_students`
--

CREATE TABLE `sector_g12_students` (
  `id` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `nic` varchar(50) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `enroll_subjects` varchar(100) NOT NULL,
  `enroll_date` varchar(100) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sector_g12_students`
--

INSERT INTO `sector_g12_students` (`id`, `name`, `nic`, `dob`, `gender`, `enroll_subjects`, `enroll_date`, `phone`, `mail`, `address`) VALUES
('SA152', 'Sonal Imsara', '200250602017', 'Feb 9, 2002', 'Male', 'Combined Maths, Physics', 'May 1, 2024, May 1, 2024', '078', 'Sonal@gmail.com', 'Panadura'),
('SA225', 'Dahami Sugandhani', '200168100970', 'Jun 29, 2001', 'Female', 'Combined Maths, Physics, ICT', 'Jun 1, 2024, Jun 3, 2024, Mar 4, 2024', '0716576555', 'dahamimalewana@gmail.com', 'Maharagama'),
('SA278', 'Hansani Rathnayaka', '200351803880', 'Jan 18, 2003', 'Female', 'Combined Maths, Physics', 'Jun 3, 2024, Jun 3, 2024', '0759204329', 'hansani.rathnayake17@gmail.com', 'Rathnapura'),
('SA424', 'Dahami Malewana', '2001581465565', 'Jun 29, 2001', 'Female', 'Combined Maths', 'May 6, 2024', '077', 'dahamimalewana@gmail.com', 'Maharagama'),
('SA698', 'Nilantha Sanjeewa', '95898979462', 'May 5, 1995', 'Male', 'Combined Maths', 'Apr 1, 2024', '078', 'NilanthaSanjeewa@gmail.com', 'Kadawatha'),
('SA738', 'Oneth', '200310202087', 'Dec 23, 2003', 'Male', 'Combined Maths', 'Jan 4, 2024', '0740681862', 'onethpathiranage123@gmail.com', 'Kottawa'),
('SA815', 'Imeth Jayasinghe', '200210602079', 'Apr 15, 2002', 'Male', 'Combined Maths, Physics', 'Jun 1, 2024, Jun 3, 2024', '0779094625', 'imethradawa12@gmail.com', 'Panadura'),
('SA832', 'Ridmi Nethmini', '200179203167', 'Oct 18, 2001', 'Female', 'Combined Maths, Physics', 'Jun 2, 2024, Jun 3, 2024', '0719734857', 'ridminethmini10@gmail.com', 'Mathugama'),
('SA954', 'Rayan Dinujaya', '200226401625', 'Sep 20, 2002', 'Male', 'Combined Maths, Physics', 'Jun 7, 2024, Jun 3, 2024', '0758387432', 'rayandinujaya4@gmail.com', 'Anuradhapura');

-- --------------------------------------------------------

--
-- Table structure for table `sector_g13_students`
--

CREATE TABLE `sector_g13_students` (
  `id` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `nic` varchar(50) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `enroll_subjects` varchar(100) NOT NULL,
  `enroll_date` varchar(100) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sector_g13_students`
--

INSERT INTO `sector_g13_students` (`id`, `name`, `nic`, `gender`, `dob`, `enroll_subjects`, `enroll_date`, `phone`, `mail`, `address`) VALUES
('SA049', 'Oneth Nimsath', '200015386889', 'Male', 'May 3, 2000', 'Combined Maths', 'Feb 1, 2024', '0777', 'onethpathiranage123@gmail.com', 'Maharagama'),
('SA075', 'Pasandi Hettiarachchi', '2001456478', 'Male', 'Oct 21, 2001', 'Combined Maths', 'Jun 2, 2024', '0784123487', 'Pasandi@gmail.com', 'Nawala'),
('SA365', 'Rayan Dinuajaya', '20021045', 'Male', 'Sep 20, 2024', 'Combined Maths', 'May 1, 2024', '074', 'rayandinuajaya4@gmail.com', 'Mihinthale'),
('SA608', 'Imeth Jayasinghe', '200210608454', 'Male', 'May 5, 2024', 'Combined Maths', 'Mar 4, 2024', '0747', 'imethjayasinghe02@gmail.com', 'Kaluthara'),
('SA670', 'Thevni Hettiarachchi', '2003134792', 'Male', 'Jan 18, 2003', 'Combined Maths', 'Jun 2, 2024', '071', 'hettiarachchithevni@gmail.com', 'Nawala'),
('SA788', 'Yudeesha Gunarathne', '9920001245', 'Female', 'Aug 16, 1999', 'Combined Maths', 'Jan 2, 2024', '0748978011', 'Yudeesha@gmail.com', 'Kaluthara'),
('SA993', 'Dahami Malewana', '2001581', 'Male', 'Jun 29, 2001', 'Combined Maths', 'May 1, 2024', '074', 'dahamimalewana@gmail.com', 'Maharagama');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `id` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `position` varchar(20) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `nic` varchar(20) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `salary` double(11,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`id`, `name`, `position`, `dob`, `nic`, `mail`, `phone`, `address`, `salary`) VALUES
('A01', 'Gunasiri Nimsath', 'Admin', 'Jul 2, 1980', '80569782120', 'imethradawa12@gmail.com', '0718976123', 'Panadura', 40000.00),
('C01', 'Oneth Nimsath', 'Cleaner', 'Sep 5, 1990', '90569784686', 'ridminethmini10@gmail.com', '0728974506', 'Wadduwa', 20000.00),
('D01', 'Nilantha', 'Driver', 'Oct 19, 1995', '95569784686', 'rayandinujaya4@gmail.com', '0768974506', 'Kadawatha', 30000.00),
('S01', 'Ashoka Gunasekara', 'Secuirty Guard', 'Jun 17, 1975', '75569784686', 'dahamimalewana@gmail.com', '0718975687', 'Colombo', 25000.00);

-- --------------------------------------------------------

--
-- Table structure for table `staff_salary`
--

CREATE TABLE `staff_salary` (
  `id` int(20) NOT NULL,
  `staff_id` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `position` varchar(50) NOT NULL,
  `month` varchar(50) NOT NULL,
  `salary` double(11,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `staff_salary`
--

INSERT INTO `staff_salary` (`id`, `staff_id`, `name`, `position`, `month`, `salary`) VALUES
(1, 'A01', 'Gunasiri Nimsath', 'Admin', 'June', 40000.00),
(2, 'C01', 'Oneth Nimsath', 'Cleaner', 'June', 20000.00),
(3, 'D01', 'Nilantha', 'Driver', 'June', 30000.00),
(4, 'S01', 'Ashoka Gunasekara', 'Secuirty Guard', 'June', 25000.00);

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `id` varchar(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `subject` varchar(20) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `student_fee` double(11,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`id`, `name`, `subject`, `mail`, `phone`, `address`, `student_fee`) VALUES
('T01', 'Kasun Senarathne', 'Combined Maths', 'imethradawa12@gmail.com', '0712602402', 'Panadura', 3000.00),
('T02', 'Lahiru Aththudawa', 'Physics', 'rayandinujaya4@gmail.com', '0766859223', 'Panadura', 4000.00),
('T03', 'Sanoj Peiris', 'ICT', 'dahamimalewana@gmail.com', '0754040513', 'Wadduwa', 2500.00),
('T04', 'Dinesh Halovita', 'Chemistry', 'ridminethmini10@gmail.com', '0713441164', 'Kaluthara', 4000.00),
('T05', 'Nishan Chamara', 'Accounting', 'hansani.rathnayake17@gmail.com', '0758532287', 'Mathugama', 3000.00),
('T06', 'Minul', 'Physics', 'Minul@gmail.com', '788798979', 'Colombo', 3000.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `g12_enrollment`
--
ALTER TABLE `g12_enrollment`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `g12_teacher_salary`
--
ALTER TABLE `g12_teacher_salary`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `g12_timetable`
--
ALTER TABLE `g12_timetable`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `g13_enrollment`
--
ALTER TABLE `g13_enrollment`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `g13_teacher_salary`
--
ALTER TABLE `g13_teacher_salary`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `g13_timetable`
--
ALTER TABLE `g13_timetable`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `institute_netprofit`
--
ALTER TABLE `institute_netprofit`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sector_g12_students`
--
ALTER TABLE `sector_g12_students`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sector_g13_students`
--
ALTER TABLE `sector_g13_students`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `staff_salary`
--
ALTER TABLE `staff_salary`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `g12_enrollment`
--
ALTER TABLE `g12_enrollment`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `g12_teacher_salary`
--
ALTER TABLE `g12_teacher_salary`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `g12_timetable`
--
ALTER TABLE `g12_timetable`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `g13_enrollment`
--
ALTER TABLE `g13_enrollment`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `g13_teacher_salary`
--
ALTER TABLE `g13_teacher_salary`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `g13_timetable`
--
ALTER TABLE `g13_timetable`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `institute_netprofit`
--
ALTER TABLE `institute_netprofit`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `staff_salary`
--
ALTER TABLE `staff_salary`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
