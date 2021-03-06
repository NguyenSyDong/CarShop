USE [Wish]
GO
/****** Object:  ForeignKey [FK_Order_Accounts]    Script Date: 04/02/2021 01:19:58 ******/
ALTER TABLE [dbo].[Order] DROP CONSTRAINT [FK_Order_Accounts]
GO
/****** Object:  ForeignKey [FK_Order_product]    Script Date: 04/02/2021 01:19:58 ******/
ALTER TABLE [dbo].[Order] DROP CONSTRAINT [FK_Order_product]
GO
/****** Object:  ForeignKey [FK_product_Category1]    Script Date: 04/02/2021 01:19:58 ******/
ALTER TABLE [dbo].[product] DROP CONSTRAINT [FK_product_Category1]
GO
/****** Object:  Table [dbo].[Order]    Script Date: 04/02/2021 01:19:58 ******/
ALTER TABLE [dbo].[Order] DROP CONSTRAINT [FK_Order_Accounts]
GO
ALTER TABLE [dbo].[Order] DROP CONSTRAINT [FK_Order_product]
GO
DROP TABLE [dbo].[Order]
GO
/****** Object:  Table [dbo].[product]    Script Date: 04/02/2021 01:19:58 ******/
ALTER TABLE [dbo].[product] DROP CONSTRAINT [FK_product_Category1]
GO
DROP TABLE [dbo].[product]
GO
/****** Object:  Table [dbo].[Accounts]    Script Date: 04/02/2021 01:19:58 ******/
DROP TABLE [dbo].[Accounts]
GO
/****** Object:  Table [dbo].[Buyer]    Script Date: 04/02/2021 01:19:58 ******/
DROP TABLE [dbo].[Buyer]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 04/02/2021 01:19:58 ******/
DROP TABLE [dbo].[Category]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 04/02/2021 01:19:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Category](
	[cid] [int] IDENTITY(1,1) NOT NULL,
	[cname] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Category] ON
INSERT [dbo].[Category] ([cid], [cname]) VALUES (1, N'LAMBORGHINI')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (2, N'ROLLS_ROYCE')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (3, N'FERRARI')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (4, N'VINFAST')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (5, N'TOYOTA')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (6, N'TESLA')
INSERT [dbo].[Category] ([cid], [cname]) VALUES (7, N'KIA')
SET IDENTITY_INSERT [dbo].[Category] OFF
/****** Object:  Table [dbo].[Buyer]    Script Date: 04/02/2021 01:19:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Buyer](
	[bID] [int] IDENTITY(1,1) NOT NULL,
	[First Name] [varchar](255) NULL,
	[Last Name] [varchar](255) NULL,
	[Phone] [int] NULL,
	[Email] [varchar](255) NULL,
	[Address] [varchar](255) NULL,
	[sellid] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[bID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Buyer] ON
INSERT [dbo].[Buyer] ([bID], [First Name], [Last Name], [Phone], [Email], [Address], [sellid]) VALUES (71, N'Dong Sy', N'Nguen', 975259570, N'nguyensydong2000@gmail.com', N'Nghe An', NULL)
SET IDENTITY_INSERT [dbo].[Buyer] OFF
/****** Object:  Table [dbo].[Accounts]    Script Date: 04/02/2021 01:19:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Accounts](
	[uID] [int] IDENTITY(1,1) NOT NULL,
	[user] [varchar](255) NULL,
	[pass] [varchar](255) NULL,
	[isSell] [int] NULL,
	[isAdmin] [int] NULL,
	[Email] [varchar](255) NULL,
	[phone] [varchar](255) NULL,
	[block] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[uID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Accounts] ON
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (1, N'viato', N'123', 1, 0, N'viato@gmail.com', N'321312313', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (2, N'Dong', N'123', 0, 1, N'sdadsda@fasddf.com', N'4324324234', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (3, N'sydong123', N'321', 0, 1, N'sdadsda@fasddf.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (4, N'Katell', N'HWV8ZN', 0, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (5, N'Zahir', N'NPX7OF', 1, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (6, N'Conan', N'WIZ5VZ', 1, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (7, N'Cade', N'ZSW2LU', 1, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (8, N'Micah', N'RVV5SR', 0, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (9, N'Rowan', N'VAI6XR', 0, 1, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (10, N'Kirby', N'DNX6JK', 1, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (11, N'Tanisha', N'XWU7JP', 0, 1, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (12, N'Howard', N'TSR5MR', 0, 1, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (13, N'Tana', N'EHS8CM', 0, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (14, N'Hadassah', N'YOY7ZW', 1, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (15, N'Echo', N'IGE8TN', 1, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (16, N'Slade', N'OFO6QS', 0, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (17, N'Devin', N'IBM6RZ', 1, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (18, N'Rowan', N'ZYS9VI', 1, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (19, N'Rafael', N'WZA0IH', 1, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (20, N'Madaline', N'QMW4EN', 0, 1, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (21, N'Vera', N'CZB2VM', 0, 1, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (22, N'Declan', N'ZKE7QZ', 0, 1, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (23, N'Katell', N'SFS0IW', 1, 1, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (24, N'Summer', N'PSQ7LC', 0, 1, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (25, N'Robin', N'KIS9AF', 0, 1, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (26, N'Dominique', N'IKV0IX', 0, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (27, N'admin', N'123', 0, 1, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (28, N'mra', N'mra', 0, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (29, N'mrCC12345', N'123', 0, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (30, N'Camden', N'123', 0, 0, N'jdhjs@adsd.com', N'423423423', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (39, N'helo', N'123', 0, 0, N'sdad@gmail.com', N'3123123', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (40, N'hello', N'123', 0, 0, N'hello@gmail.com', N'09321331', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (49, N'sydong', N'123', 0, 0, N'dongn40@gmail.com', N'0975259570', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (63, N'lenovo', N'123', 0, 0, N'lenovo@gmail.com', N'2321213', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (69, N'avio', N'12345', 0, 0, N'avio23@gmail.com', N'123123', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (70, N'avio2', N'123', 1, 0, N'avio@gmail.com', N'213211233', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (71, N'lenovo123', N'12345', 0, 0, N'lenovo12dasds3@gmail.com', N'4234324', 0)
INSERT [dbo].[Accounts] ([uID], [user], [pass], [isSell], [isAdmin], [Email], [phone], [block]) VALUES (72, N'lenovo1234', N'123', 1, 0, N'nguyensydong2000@gmail.com', N'0975259570', 0)
SET IDENTITY_INSERT [dbo].[Accounts] OFF
/****** Object:  Table [dbo].[product]    Script Date: 04/02/2021 01:19:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](max) NULL,
	[image] [nvarchar](max) NULL,
	[price] [money] NULL,
	[title] [nvarchar](max) NULL,
	[description] [nvarchar](max) NULL,
	[cateID] [int] NULL,
	[sell_ID] [int] NULL,
	[block] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[product] ON
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (2, N'Rolls Royce Cullinan', N'https://www.asphalte.ch/news/wp-content/uploads/2018/05/Rolls-Royce-Cullinan-03-750.jpg', 1732558.0000, N'Rolls Royce Cullinan 2020 is a model that relieves the long-standing "off-road" desire of personality giants who love expensive cars. The price is in the high segment but the luxury amenities, the luxurious royal style are enough to make the Rolls Royce Cullinan 2020 become the desire of many people.', N'Rolls Royce Cullinan 2020 is a model that relieves the long-standing "off-road" desire of personality giants who love expensive cars. The price is in the high segment but the luxury amenities, the luxurious royal style are enough to make the Rolls Royce Cullinan 2020 become the desire of many people.', 2, 6, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (3, N'Lamborghini Huracan Sto', N'https://vcdn1-vnexpress.vnecdn.net/2020/11/19/lamborghini-huracan-sto-160577-6122-9252-1605777840.jpg?w=900&h=540&q=100&dpr=1&fit=crop&s=YrGcwGA6esan91ZDwYanEg', 996000.0000, N'Lamborghini just launched the Huracan STO. According to Lamborghini, the Huracan STO has the perfect combination of power, aerodynamics and mass. Lamborghini''s latest super cow is considered to be the best performance racing supercar in the world.', N'Lamborghini just launched the Huracan STO. According to Lamborghini, the Huracan STO has the perfect combination of power, aerodynamics and mass. Lamborghini''s latest super cow is considered to be the best performance racing supercar in the world.', 1, 7, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (4, N'Rolls Royce Ghost', N'https://vcdn-vnexpress.vnecdn.net/2020/09/02/2021-Rolls-ROyce-Ghost-3-3617-1599022529.jpg', 1500000.0000, N'Rolls Royce Ghost with the first version was released to the public in 2010. Is the most successful car in the history of Rolls Royce. So far, after 10 years on the market, the luxury automaker Rolls Royce introduced the second generation of Ghost sedans in September 2020. The new generation has many new upgrades from exterior to interior. Ghost 2021 has 03 versions including standard, Black Badge and extended wheelbase (EWB).', N'Rolls Royce Ghost with the first version was released to the public in 2010. Is the most successful car in the history of Rolls Royce. So far, after 10 years on the market, the luxury automaker Rolls Royce introduced the second generation of Ghost sedans in September 2020. The new generation has many new upgrades from exterior to interior. Ghost 2021 has 03 versions including standard, Black Badge and extended wheelbase (EWB).', 2, 1, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (6, N'Rolls Royce Phantom', N'https://vnn-imgs-f.vgcloud.vn/2019/12/28/17/2019-rolls-royce-phantom-6.jpg', 2600000.0000, N'The Rolls Royce Phantom is a large luxury sports car produced by Rolls Royce', N'The Rolls Royce Phantom is a large luxury sports car produced by Rolls Royce', 2, 7, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (7, N'Lamborghini Huracan Evo', N'https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2021-lamborghini-huracan-evo-mmp-1-1600293029.jpg', 1200000.0000, N'Huracan EVO is an upgrade of the Huracan Performante, debuted in early 2019 in Coupe format. After that, the EVO Spyder convertible version was also released in early 2020. With the changed design, the upgraded engine and a series of other assistive technologies, the Lamborghini Huracan EVO 2021 super sports car became strong. stronger and more modern. Exterior with many new points.', N'Huracan EVO is an upgrade of the Huracan Performante, debuted in early 2019 in Coupe format. After that, the EVO Spyder convertible version was also released in early 2020. With the changed design, the upgraded engine and a series of other assistive technologies, the Lamborghini Huracan EVO 2021 super sports car became strong. stronger and more modern. Exterior with many new points.', 1, 14, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (8, N'Vinfast President', N'https://shop.vinfastauto.com/on/demandware.static/-/Sites-app_vinfast_vn-Library/default/dwfd31fe7f/images/President/CE16.png', 200000.0000, N'VinFast President là mẫu xe phát triển từ dòng xe Lux SA2.0 và được định vị để trở thành một dòng xe đặc biệt nhắm tới những người Việt Nam thành đạt, tiên phong. Mẫu xe mới này sẽ chỉ được sản xuất giới hạn 500 chiếc và dành riêng cho thị trường Việt Nam. ', N'VinFast President là mẫu xe phát triển từ dòng xe Lux SA2.0 và được định vị để trở thành một dòng xe đặc biệt nhắm tới những người Việt Nam thành đạt, tiên phong. Mẫu xe mới này sẽ chỉ được sản xuất giới hạn 500 chiếc và dành riêng cho thị trường Việt Nam. ', 4, 15, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (9, N'Ferrari 488 Spider', N'https://baoquocte.vn/stores/news_dataimages/dangtuan/102020/15/14/bang-gia-xe-ferrari-2020-tai-viet-nam-moi-nhat-thang-102020_6.jpg?rt=20201015144127', 800000.0000, N'Ferrari 488 Spider is the most powerful V8 mid-engined sports car of the Ferrari family. With the same specifications as the couple that was released six months ago, the 488 Spider is equipped with a V8, twin-turbocharged, 3.9-liter cylinder capacity capable of producing a maximum capacity of 660. horse power. Super car can accelerate from 0 to 100 km / h in just 3 seconds and from 0 to 200 km / h in 8.7 seconds.', N'Ferrari 488 Spider is the most powerful V8 mid-engined sports car of the Ferrari family. With the same specifications as the couple that was released six months ago, the 488 Spider is equipped with a V8, twin-turbocharged, 3.9-liter cylinder capacity capable of producing a maximum capacity of 660. horse power. Super car can accelerate from 0 to 100 km / h in just 3 seconds and from 0 to 200 km / h in 8.7 seconds.', 3, 14, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (10, N'Vinfast Lux SA 2.0', N'https://vinfastchevroletnewway.com.vn/wp-content/uploads/2019/09/sa-orange-169.jpg', 46800.0000, N'VinFast Lux SA2.0 là mẫu xe thể thao đa dụng sang trọng (Luxury SUV) 7 chỗ đến từ thương hiệu Việt - hãng xe VinFast. Lux SA2.0 được giới thiệu lần đầu tiên tại Triển lãm xe hơi Paris 2018, và chính thức đi vào lắp ráp - sản xuất tại Việt Nam từ năm 2019.', N'VinFast Lux SA2.0 là mẫu xe thể thao đa dụng sang trọng (Luxury SUV) 7 chỗ đến từ thương hiệu Việt - hãng xe VinFast. Lux SA2.0 được giới thiệu lần đầu tiên tại Triển lãm xe hơi Paris 2018, và chính thức đi vào lắp ráp - sản xuất tại Việt Nam từ năm 2019.', 4, 15, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (11, N'Ferrari F8 Tributo', N'https://autopress.vn/uploads/userfiles/images/news_1555951599/Ferrari-F8-Tributo-launch-1-1200x628.jpg', 996000.0000, N'The Ferrari F8 Tributo is a mid-engine sports car from the Italian automaker Ferrari. F8 Tributo debuted at the Geneva Motor Show in March 2019 to replace the Ferrari 488 GTB.', N'The Ferrari F8 Tributo is a mid-engine sports car from the Italian automaker Ferrari. F8 Tributo debuted at the Geneva Motor Show in March 2019 to replace the Ferrari 488 GTB.', 3, 17, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (12, N'Ferrari F8 Tributo Red', N'https://cms-i.autodaily.vn/du-lieu/2019/03/01/ferrari-f8-tributo-lo-dien-2.jpg', 1000000.0000, N'RED FERRARI F8 TRIBUTO: Sleek and voluptuous, the 2020 Ferrari F8 Tributo is the new supercar to choose if you like your automotive performance packaged in an undeniably glamorous wrapper', N'RED FERRARI F8 TRIBUTO: Sleek and voluptuous, the 2020 Ferrari F8 Tributo is the new supercar to choose if you like your automotive performance packaged in an undeniably glamorous wrapper', 3, 19, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (13, N'Ferrari Ferrari 488 GTB', N'https://cdn.dicklovett.co.uk/uploads/used_stock_image/1_427163_ns.jpg?v=1605283220', 750000.0000, N'Ferrari 488 GTB sử dụng động cơ tăng áp kép V8 3.9L, sản sinh công suất 660 mã lực và mô-men xoắn 760 Nm. Siêu xe có thể tăng tốc 0-100 km/h trong 3 giây trước khi đạt tốc độ tối đa 330 km/h.', N'Ferrari 488 GTB sử dụng động cơ tăng áp kép V8 3.9L, sản sinh công suất 660 mã lực và mô-men xoắn 760 Nm. Siêu xe có thể tăng tốc 0-100 km/h trong 3 giây trước khi đạt tốc độ tối đa 330 km/h.', 3, 18, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (15, N'Vinfast President V8', N'https://media.baodautu.vn/Images/phuongthanh/2020/08/12/1.jpg', 210000.0000, N'VinFast President là mẫu xe phát triển từ dòng xe Lux SA2.0 và được định vị để trở thành một dòng xe đặc biệt nhắm tới những người Việt Nam thành đạt, tiên phong. Mẫu xe mới này sẽ chỉ được sản xuất giới hạn 500 chiếc và dành riêng cho thị trường Việt Nam. ', N'VinFast President là mẫu xe phát triển từ dòng xe Lux SA2.0 và được định vị để trở thành một dòng xe đặc biệt nhắm tới những người Việt Nam thành đạt, tiên phong. Mẫu xe mới này sẽ chỉ được sản xuất giới hạn 500 chiếc và dành riêng cho thị trường Việt Nam. ', 4, 6, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (17, N'Ferrari 250 GT', N'https://media-cdn.laodong.vn/Storage/NewsPortal/2019/7/14/744133/606673.jpg', 1000000.0000, N'Ferrari 250 GTO is classified as a rare and considered Ferrari masterpiece when there are only 39 units produced between 1962 and 1964, and it is also the most beautiful Ferrari car in history under the table. hands of famous Italian car designers', N'Ferrari 250 GTO is classified as a rare and considered Ferrari masterpiece when there are only 39 units produced between 1962 and 1964, and it is also the most beautiful Ferrari car in history under the table. hands of famous Italian car designers', 3, 1, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (18, N' Ferrari 458 Speciale', N'https://ss-images.saostar.vn/wp700/2019/02/10/4572615/ferrari_sp3jc_1-share_buorrml5.jpg', 850000.0000, N'Speciale in Italian means "special", which is the name for the premium version of the line of cars Ferrari 458 that debuted late last year. Unlike the F430 with the special 430 Scuderia, this time Ferrari simply took the Speciale name for the special edition of the 458 Italia, a two-door sports car with a 4.5L V8 engine.', N'Speciale in Italian means "special", which is the name for the premium version of the line of cars Ferrari 458 that debuted late last year. Unlike the F430 with the special 430 Scuderia, this time Ferrari simply took the Speciale name for the special edition of the 458 Italia, a two-door sports car with a 4.5L V8 engine.', 3, 7, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (36, N'Lamborghini Urus', N'https://www.pngfind.com/pngs/m/258-2585564_lamborghini-urus-2018-prix-hd-png-download.png', 910000.0000, N'SUV', N'SuperCar SUV ', 1, 1, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (45, N'Rolls Royce Ghost 2', N'https://icdn.dantri.com.vn/thumb_w/640/2020/12/05/rollsroyce-1607122730658.jpg', 1500000.0000, N'This is luxury car beautiful', N'Luxury car no1 in the world and...', 1, 65, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (50, N'Ferrari 3', N'https://storage.googleapis.com/f1-cms/2020/08/d173f63a-20200818_091531.png', 1000000.0000, N'new car', N'super car', 3, 1, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (51, N'Ferrari 4', N'https://image.vtc.vn/resize/th/upload/2020/05/10/ferrari-f42-2-18414282.jpg', 2000000.0000, N'New Car', N'Super car', 3, 1, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (52, N'Vinfast', N'https://cdn-thethao247.com/upload/hiep95/2020/06/19/vinfast-lux-a201592559777.jpg', 1000000.0000, N'Xe Viet Nam cua vingroup', N'Vinfast the he moi chat luong cao', 4, 1, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (55, N'Fotuner', N'https://hkbike.com.vn/wp-content/uploads/2018/12/gia-xe-toyota-1.jpg', 1000000.0000, N'Toyota 2021', N'Toyota', 5, 1, 0)
INSERT [dbo].[product] ([id], [name], [image], [price], [title], [description], [cateID], [sell_ID], [block]) VALUES (59, N'Tesla', N'https://www.investo.vn/wp-content/uploads/2020/12/tesla-model-x-dream-giveaway.jpg', 1000000.0000, N'SAS', N'ASS
', 6, 1, 0)
SET IDENTITY_INSERT [dbo].[product] OFF
/****** Object:  Table [dbo].[Order]    Script Date: 04/02/2021 01:19:58 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order](
	[AccountID] [int] NULL,
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](max) NULL,
	[image] [nvarchar](max) NULL,
	[price] [money] NULL,
	[sell_ID] [int] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Order] ON
INSERT [dbo].[Order] ([AccountID], [id], [name], [image], [price], [sell_ID]) VALUES (71, 50, N'Ferrari 3', N'https://storage.googleapis.com/f1-cms/2020/08/d173f63a-20200818_091531.png', 1000000.0000, NULL)
SET IDENTITY_INSERT [dbo].[Order] OFF
/****** Object:  ForeignKey [FK_Order_Accounts]    Script Date: 04/02/2021 01:19:58 ******/
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Accounts] FOREIGN KEY([AccountID])
REFERENCES [dbo].[Accounts] ([uID])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Accounts]
GO
/****** Object:  ForeignKey [FK_Order_product]    Script Date: 04/02/2021 01:19:58 ******/
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_product] FOREIGN KEY([id])
REFERENCES [dbo].[product] ([id])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_product]
GO
/****** Object:  ForeignKey [FK_product_Category1]    Script Date: 04/02/2021 01:19:58 ******/
ALTER TABLE [dbo].[product]  WITH CHECK ADD  CONSTRAINT [FK_product_Category1] FOREIGN KEY([cateID])
REFERENCES [dbo].[Category] ([cid])
GO
ALTER TABLE [dbo].[product] CHECK CONSTRAINT [FK_product_Category1]
GO
