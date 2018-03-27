-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 19, 2017 at 11:55 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shopcake`
--

-- --------------------------------------------------------

--
-- Table structure for table `cake`
--

CREATE TABLE `cake` (
  `CodeCake` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `NameCake` varchar(20000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Price` bigint(20) NOT NULL,
  `Image` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Details` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cake`
--

INSERT INTO `cake` (`CodeCake`, `NameCake`, `Price`, `Image`, `Details`) VALUES
('Banh01', 'Pancake', 25000, 'Pancake.jpg', 'Pancake là loại bánh không yêu cầu nguyên liệu cầu kì, cách làm cũng đơn giản, nhanh và không cần máy làm bánh nên có vẻ là ứng cử viên rất sáng giá cho đồ ăn điểm tâm hoặc ăn chơi trong ngày lạnh hay mưa gió ???? Pancake có thể ăn không, hay ăn kèm với bơ, mật ong, các loại syrup, mứt, hoặc kể cả hoa quả tươi, đại loại là tùy điều kiện & sự sáng tạo của người nấu mà có nhiều cách biến tấu để tạo ra các loại Pancake khác nhau, cho nên không sợ nhàm chán.'),
('Banh02', 'red velet', 40000, 'redvelet.jpg', 'Đúng như tên gọi của mình, những chiếc bánh Red Velvet mang một màu đỏ nhung thật nồng nàn, say đắm. Red Velvet là sự kết hợp hài hòa của từng lớp bánh đỏ thắm đan xen với những lớp kem trắng mịn, bồng bềnh trông thật thích mắt và ngon miệng. Với màu đỏ đặc trưng, Red Velvet rất thích hợp để tặng cho nửa kia của bạn.Bánh red velvet nổi tiếng không chỉ bởi vẻ ngoài “quyến rũ” của màu đỏ đặc trưng mà còn bởi hương vị thơm nồng vị cacao. Thêm vào đó là lớp kem tươi béo ngậy làm nên một món bánh ngon tuyệt- chiếc bánh của tình yêu.'),
('Banh03', 'softcake', 40000, 'softcake.jpg', 'Cuối cùng, các bạn trình bày bánh sortcake dâu tây: các bạn đặt một lớp bánh quy, lên trên là lớp kem, một vài lát dâu tây, lại một lớp bánh quy và lớp kem dâu tây nữa ở trên cùng. Vậy là chúng ta đã có thể sẵn sàng thưởng thức món ngon này rồi.'),
('Banh04', 'Mousses', 35000, 'mousses.jpg', 'Nguyên liệu chính của mousse chính là gelatin và kem tươi. Đấy là 2 thành phần không thể thiếu khi muốn làm nên những chiếc bánh mousse ngon mịn. Hẳn ai mê mẩn bánh mousse thì sẽ nghĩ ngay đến lớp kem mát lạnh, mềm mượt mà khi cho vào trong miệng như tan trong miệng. Cùng với vị béo béo của kem tươi, người ta biến tấu ra rất nhiều loại mousse với những mùi vị và thành phần khác nhau như : mousse chanh leo, mousse dâu tây, mousse chocolate.'),
('Banh05', 'Cheesecake', 20000, 'Cheesecake.jpg', 'Thành phần không thể thiếu của cheesecake là cream cheese và kem tươi, có thể thêm lớp bánh quy nghiền vụn trộn với bơ đun chảy để làm đế bánh và cũng là làm tăng độ ngon cho cheesecake. Mùi vị đặc trưng của cheesecake là vị chua dịu của cream cheese kết hợp với vị beo béo của kem tươi tạo nên lớp kem bánh cực kì ngon miệng. Cheesecake không cần đến lò nướng, làm siêu nhanh nên cực kì thích hợp với những người bận rộn mà yêu thích bánh trái.'),
('Banh06', 'Bánh crepe', 25000, 'crepe.jpg', 'được xuất xứ từ nước Pháp, một nơi có nền ẩm thực vô cùng phong phú và đa dạng. Là một loại bánh rất mỏng, dẹt, thường được làm từ bột mỳ, trứng, sữa và bơ. Bánh crepe có màu vàng nhẹ, vỏ bánh nóng hổi, thơm ngon béo ngậy mùi  bơ sữa làm mê mẩn không biết bao nhiêu người. Cách làm bánh crepe thì khá đơn giản không hề khó lắm đâu. Có rất nhiều cách để làm bánh crepe ngon còn tùy vào khẩu vị của người như bánh crepe trà xanh, crepe sầu riêng,..'),
('Banh07', 'Bánh Croissant', 20000, 'Croissant.jpg', 'Nhắc đến nước Pháp hẳn ai cũng nghĩ đến món bánh sừng bò nổi tiếng, tuy nhiên Croissant lại được sinh ra tại Áo, dưới cái tên “kipferl”. Công thức chế biến loại bánh này sau đó đã được người Pháp chỉnh sửa lại và tạo ra món bánh sừng bò xốp mềm, ngậy thơm mùi bơ. Các nghệ nhân cho một khối lượng bơ khá lớn vào bột và gấp nó lại thật nhiều lần, bởi vậy bánh sừng bò có kết cấu rất xốp, thơm ngon ngậy béo.'),
('Banh08', 'Cup cake', 20000, 'cupcake.jpg', 'Cupcake là loại bánh mà không hề đòi hỏi kĩ thuật gì làm bánh quá cao siêu hay khó khăn, bởi chỉ cần cho từ từ các nguyên liệu từ khô cho đến ướt vào và trộn đều lên là ta đã có hỗn hợp bột bánh để cho vào cup rồi. Cupcake ngoài cách nướng bánh thông thường ta còn có 1 cách không cần dùng đến lò nướng và vẫn cực nhanh và cực ngon, đó là hấp bánh. Bánh sau khi hấp thì nở bông, mềm mịn và không khô như khi nướng bánh.'),
('Banh09', 'Muffin', 30000, 'muffin.jpg', 'Muffin có cách làm và nguyên liệu thì gần giống như cupcake, đôi khi có nhiều người còn đánh đồng cho chúng vào làm 1 loại. Muffin ngoài các nguyên liệu cơn bản như cupcake thì còn có thể thêm các loại hoa quả vào và trộn cùng bột hay các loại hoa quả khô, chocolate chip,… Vì thế nên món bánh muffin biến tấu được rất nhiều loại. Muffin hấp thì chất bánh mềm mịn, ẩm hơn muffin nướng trong lò. Bữa sáng mà được 1 chiếc bánh muffin nho khô hay muffin chuối thì còn gì bằng.'),
('Banh9.1', 'Mo Chi', 20000, 'mochi.jpg', 'Mochi chính là loại bánh truyền thống của Nhật được rất nhiều người ưa thích. Mochi ăn dẻo mềm với bột nếp kết hợp với rất nhiều nguyên liệu khác nhau tạo ra những loại bánh mochi đa dạng về hương vị. Mochi làm siêu nhanh, không hề cần đến lò nướng, chỉ cần hòa bột với nước cùng các nguyên liệu khác để tạo mùi vị như: trà xanh, mè đen, đậu đỏ,… rồi đem quay lò vi sóng là bạn đã có ngay phần vỏ bánh mềm dẻo thơm rồi.');

-- --------------------------------------------------------

--
-- Table structure for table `userinfor`
--

CREATE TABLE `userinfor` (
  `Name` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `UserName` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Address` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Role` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userinfor`
--

INSERT INTO `userinfor` (`Name`, `UserName`, `Password`, `Address`, `Role`) VALUES
('admin', 'admin', 'admin', 'Khong co ai', 'admin'),
('Phạm Thị Minh Hiền', 'MHien', '123', 'Đà Nẵng', 'user'),
('Thái Thị Như', 'NhuTT', '456', 'Quảng Nam', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cake`
--
ALTER TABLE `cake`
  ADD PRIMARY KEY (`CodeCake`);

--
-- Indexes for table `userinfor`
--
ALTER TABLE `userinfor`
  ADD PRIMARY KEY (`Name`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
