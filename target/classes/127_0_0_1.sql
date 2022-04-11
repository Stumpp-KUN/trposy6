-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1:3306
-- Время создания: Мар 29 2022 г., 11:37
-- Версия сервера: 10.3.22-MariaDB
-- Версия PHP: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `accessories`
--
CREATE DATABASE IF NOT EXISTS `accessories` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `accessories`;

-- --------------------------------------------------------

--
-- Структура таблицы `cpuamd`
--

CREATE TABLE `cpuamd` (
  `weight` tinyint(5) UNSIGNED NOT NULL,
  `name` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `amountofcore` tinyint(3) UNSIGNED NOT NULL,
  `cost` int(10) UNSIGNED NOT NULL,
  `id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `cpuamd`
--

INSERT INTO `cpuamd` (`weight`, `name`, `amountofcore`, `cost`, `id`) VALUES
(3, 'rPro1000', 2, 2000, 1),
(3, 'rPro2000', 3, 3500, 2),
(2, 'rPro3000', 4, 5000, 3);

-- --------------------------------------------------------

--
-- Структура таблицы `cpuintel`
--

CREATE TABLE `cpuintel` (
  `weight` int(10) UNSIGNED NOT NULL,
  `name` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `amountofcore` tinyint(3) UNSIGNED NOT NULL,
  `cost` int(10) NOT NULL,
  `id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `cpuintel`
--

INSERT INTO `cpuintel` (`weight`, `name`, `amountofcore`, `cost`, `id`) VALUES
(4, 'intel7', 3, 3500, 1),
(4, 'intel8', 3, 4500, 2),
(4, 'intel9', 4, 7000, 3);

-- --------------------------------------------------------

--
-- Структура таблицы `memorymodel5`
--

CREATE TABLE `memorymodel5` (
  `weight` int(10) UNSIGNED NOT NULL,
  `name` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  `amountofcore` tinyint(3) UNSIGNED NOT NULL,
  `cost` int(12) UNSIGNED NOT NULL,
  `id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `memorymodel5`
--

INSERT INTO `memorymodel5` (`weight`, `name`, `amountofcore`, `cost`, `id`) VALUES
(32, 'hx1000', 6, 2000, 1),
(20, 'hx2500', 5, 2500, 2);

-- --------------------------------------------------------

--
-- Структура таблицы `memorymodelten`
--

CREATE TABLE `memorymodelten` (
  `weight` int(10) UNSIGNED NOT NULL,
  `name` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  `amountofcore` tinyint(3) UNSIGNED NOT NULL,
  `cost` int(12) NOT NULL,
  `id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `memorymodelten`
--

INSERT INTO `memorymodelten` (`weight`, `name`, `amountofcore`, `cost`, `id`) VALUES
(64, 'hv6300', 10, 4000, 1),
(10, 'hv7400', 5, 5400, 2);

-- --------------------------------------------------------

--
-- Структура таблицы `videocardamd`
--

CREATE TABLE `videocardamd` (
  `fillrate` tinyint(3) UNSIGNED NOT NULL,
  `name` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  `amountofcore` tinyint(3) UNSIGNED NOT NULL,
  `cost` int(12) NOT NULL,
  `id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `videocardamd`
--

INSERT INTO `videocardamd` (`fillrate`, `name`, `amountofcore`, `cost`, `id`) VALUES
(4, 'AMD6', 8, 4000, 1),
(4, 'AMD7', 12, 7000, 2),
(4, 'AMD8', 16, 9000, 3);

-- --------------------------------------------------------

--
-- Структура таблицы `videocardnvidia`
--

CREATE TABLE `videocardnvidia` (
  `weight` int(10) UNSIGNED NOT NULL,
  `name` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  `amountofcore` tinyint(3) UNSIGNED NOT NULL,
  `cost` int(12) NOT NULL,
  `id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `videocardnvidia`
--

INSERT INTO `videocardnvidia` (`weight`, `name`, `amountofcore`, `cost`, `id`) VALUES
(3, 'RTX1090', 9, 5000, 1),
(4, 'RTX2090', 12, 7000, 2),
(5, 'RTX3090', 16, 9000, 3);

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `cpuamd`
--
ALTER TABLE `cpuamd`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `cpuintel`
--
ALTER TABLE `cpuintel`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `memorymodel5`
--
ALTER TABLE `memorymodel5`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `memorymodelten`
--
ALTER TABLE `memorymodelten`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `videocardamd`
--
ALTER TABLE `videocardamd`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `videocardnvidia`
--
ALTER TABLE `videocardnvidia`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `cpuamd`
--
ALTER TABLE `cpuamd`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT для таблицы `cpuintel`
--
ALTER TABLE `cpuintel`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT для таблицы `memorymodel5`
--
ALTER TABLE `memorymodel5`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT для таблицы `memorymodelten`
--
ALTER TABLE `memorymodelten`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT для таблицы `videocardamd`
--
ALTER TABLE `videocardamd`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT для таблицы `videocardnvidia`
--
ALTER TABLE `videocardnvidia`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- База данных: `chatdb`
--
CREATE DATABASE IF NOT EXISTS `chatdb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `chatdb`;

-- --------------------------------------------------------

--
-- Структура таблицы `user`
--

CREATE TABLE `user` (
  `id` int(10) UNSIGNED NOT NULL,
  `username` varchar(10) NOT NULL,
  `email` varchar(319) NOT NULL,
  `age` tinyint(4) NOT NULL,
  `password` binary(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Дамп данных таблицы `user`
--

INSERT INTO `user` (`id`, `username`, `email`, `age`, `password`) VALUES
(1, 'Stumpp', 'test@gmail.com', 25, 0x300000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000),
(2, 'Kilf', 'jkat@gmail.com', 15, 0x310000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000);

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `user`
--
ALTER TABLE `user`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
