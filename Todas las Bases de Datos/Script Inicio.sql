CREATE DATABASE login1;
USE login1;
CREATE TABLE  login
(
  `sno` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `login` (`sno`, `username`, `password`) VALUES
(1, 'indra', '12345'),
(2, 'indra', '12345');


USE login1;
Select * From login;