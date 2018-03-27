/*
SQLyog Ultimate v11.27 (32 bit)
MySQL - 5.7.20-log : Database - guoya
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`guoya` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `guoya`;

/*Table structure for table `gy_daily_summary` */

DROP TABLE IF EXISTS `gy_daily_summary`;

CREATE TABLE `gy_daily_summary` (
  `SNO` varchar(5) DEFAULT NULL,
  `IMG_PATH` varchar(200) DEFAULT NULL,
  `CREATE_TIME` date DEFAULT NULL,
  `SUMMARY_DATE` varchar(10) DEFAULT NULL,
  `OUTSTANDING` varchar(2) DEFAULT '0',
  `SID` int(5) DEFAULT NULL,
  `STATUS` tinyint(1) DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `gy_daily_summary` */

insert  into `gy_daily_summary`(`SNO`,`IMG_PATH`,`CREATE_TIME`,`SUMMARY_DATE`,`OUTSTANDING`,`SID`,`STATUS`) values ('S0501','/guoya-client/basicClass/images/summarizes/S0501_2018-03-16_mmexport1521247071564.jpg','2018-03-19','2018-03-16','1',NULL,1),('S0702','/guoya-client/basicClass/images/summarizes/S0702_2018-03-19_image.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0802','/guoya-client/basicClass/images/summarizes/S0802_2018-03-19_微信图片_20180319101707.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0401','/guoya-client/basicClass/images/summarizes/S0401_2018-03-19_697022876536973110.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0403','/guoya-client/basicClass/images/summarizes/S0403_2018-03-19_IMG_7283.JPG','2018-03-19','2018-03-19','0',NULL,1),('S0102','/guoya-client/basicClass/images/summarizes/S0102_2018-03-19_9EE63AC4-D237-47F5-AEFD-CE5394B210BE.jpeg','2018-03-19','2018-03-19','0',NULL,1),('S0803','/guoya-client/basicClass/images/summarizes/S0803_2018-03-19_微信图片_20180319101217.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0302','/guoya-client/basicClass/images/summarizes/S0302_2018-03-19_314995199138097601.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0402','/guoya-client/basicClass/images/summarizes/S0402_2018-03-19_226305344291630779.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0401','/guoya-client/basicClass/images/summarizes/S0401_2018-03-19_499456285743194245.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0802','/guoya-client/basicClass/images/summarizes/S0802_2018-03-19_微信图片_20180319102245.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0601','/guoya-client/basicClass/images/summarizes/S0601_2018-03-19_297935986446793910.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0203','/guoya-client/basicClass/images/summarizes/S0203_2018-03-19_张兴.png','2018-03-19','2018-03-19','0',NULL,1),('S0503','/guoya-client/basicClass/images/summarizes/S0503_2018-03-19_IMG_20180319_102336.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0103','/guoya-client/basicClass/images/summarizes/S0103_2018-03-19_微信图片_20180319102504.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0603','/guoya-client/basicClass/images/summarizes/S0603_2018-03-19_wx_camera_1521426065929.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0602','/guoya-client/basicClass/images/summarizes/S0602_2018-03-19_492728085275997472.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0703','/guoya-client/basicClass/images/summarizes/S0703_2018-03-19_微信图片_20180319102235.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0303','/guoya-client/basicClass/images/summarizes/S0303_2018-03-19_div.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0101','/guoya-client/basicClass/images/summarizes/S0101_2018-03-19_5A78B0AE-3B52-4829-96BF-43BEC4B36885.jpeg','2018-03-19','2018-03-19','0',NULL,1),('S0301','/guoya-client/basicClass/images/summarizes/S0301_2018-03-19_微信图片_20180319102842.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0801','/guoya-client/basicClass/images/summarizes/S0801_2018-03-19_微信图片_20180319102509.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0302','/guoya-client/basicClass/images/summarizes/S0302_2018-03-19_000.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0701','/guoya-client/basicClass/images/summarizes/S0701_2018-03-19_caotu.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0702','/guoya-client/basicClass/images/summarizes/S0702_2018-03-19_image.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0502','/guoya-client/basicClass/images/summarizes/S0502_2018-03-19_微信图片_20180319102425.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0702','/guoya-client/basicClass/images/summarizes/S0702_2018-03-19_image.jpg','2018-03-19','2018-03-19','0',NULL,1),('S0101','xxxx/xxxx/xxxx.jpg',NULL,NULL,'0',NULL,1);

/*Table structure for table `gy_exercise` */

DROP TABLE IF EXISTS `gy_exercise`;

CREATE TABLE `gy_exercise` (
  `SNO` varchar(10) NOT NULL COMMENT '学号',
  `SNAME` varchar(20) DEFAULT NULL COMMENT '姓名',
  `GROUPID` tinyint(2) DEFAULT NULL COMMENT '群组',
  `URL` varchar(200) DEFAULT NULL COMMENT '地址',
  `STATUS` tinyint(2) DEFAULT '0' COMMENT '状态，0未通过，1通过',
  `TUTOR` varchar(20) DEFAULT NULL COMMENT '导师',
  PRIMARY KEY (`SNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `gy_exercise` */

insert  into `gy_exercise`(`SNO`,`SNAME`,`GROUPID`,`URL`,`STATUS`,`TUTOR`) values ('S0101','陈琳',1,'http://192.168.1.53:8080/cl/homepage.html',0,'曾春苗'),('s0102','唐文',1,'http://192.168.1.29:8080/tangwen1/kuangjia.html',0,'曾春苗'),('S0103','丁国梁',1,'http://192.168.1.25:8080/guoya/url/lianxi.html',1,'曾春苗'),('S0201','陈倪1',2,'http://192.168.1.65:8080/cn/zgwz.html',0,'李苏云'),('S0202','吴浪',2,'http://192.168.1.31:8080/basicClass/shouye.html',0,'李苏云'),('S0203','张兴',2,'http://192.168.1.18:8080/zhangxing/day06/frame.html',0,'李苏云'),('S0301','郑地',3,'http://192.168.1.37:8080/MyfirstWEB/frame/homepage.html',0,'马超'),('S0302','胡小芬',3,'http://192.168.1.75:8080/hxf_notebook/hxf课堂笔记/day06/myindex.html',0,'马超'),('S0303','张聪',3,'http://192.168.1.24:8080/OneMoreTime/frame/index.html',0,'马超'),('S0304','郑地1',3,'http://192.168.1.37:8080/MyfirstWEB/frame/homepage.html',0,'马超'),('S0401','陈海东',4,'http://192.168.1.43:8080/chdweb/html/wed.html',0,'王凯'),('S0402','金兆斌',4,'http://192.168.1.40:8080/0309/frame/zhuye.html',0,'王凯'),('S0403','徐英',4,'http://192.168.1.2:8080/xuying/abc/frame3/shouye.html',0,'王凯'),('S0501','王静',5,'http://192.168.1.54:8080/guoyaruanjia/shouye.html',0,'戴全明'),('S0502','刘广洲',5,'http://192.168.1.30:8080/basscclass/frame/xinwangzhan.html',0,'戴全明'),('S0503','王均',5,'http://192.168.1.26:8080/basicClass/frame/shuoye.html',0,'戴全明'),('s0601','肖飞飞',6,'http://192.168.1.39:8080/xiaofeifei/kuangjia2.html',0,'戈维维'),('S0602','刘樊',6,'http://192.168.1.20:8080/666/web/frameset.html',0,'戈维维'),('s0603','朱赛健',6,'http://192.168.1.56:8080/gongcheng2/3.9/123.html',1,'戈维维'),('S0701','庄昌宁1',7,'http://192.168.1.11:8080/zcn/basicClass/frame/shouye.html',0,'周启明'),('s0702','魏聿明',7,'http://192.168.1.10:8080/weiyuming/01.html',0,'周启明'),('S0703','李静',7,'http://192.168.1.8:8080/cx/shouye.html',0,'周启明'),('S0801','陈超',8,'http://192.168.1.48:8080/cc/shouye.html',0,'李晓阳'),('S0802','周盛明',8,'http://192.168.1.59:8080/zhousm/fema.html',0,'李晓阳'),('s0803','蒋方妍',8,'http://192.168.1.46:8080/jiangfangyan/09/20180308/shouye.html',0,'李晓阳'),('S0901','吴令',9,'http://192.168.1.42:8080/guoya_client/html/MyHtml.html',0,''),('s0902','吴昊',9,'http://192.168.1.42:8080/guoya_client/html/MyHtml.html',0,''),('S0903','吴令',9,'http://192.168.1.42:8080/guoya_client/html/MyHtml.html',0,'');

/*Table structure for table `gy_exercise_zd0106` */

DROP TABLE IF EXISTS `gy_exercise_zd0106`;

CREATE TABLE `gy_exercise_zd0106` (
  `SNO` varchar(10) NOT NULL COMMENT '学号',
  `SNAME` varchar(20) DEFAULT NULL COMMENT '姓名',
  `GROUPID` tinyint(2) DEFAULT NULL COMMENT '群组',
  `URL` varchar(200) DEFAULT NULL COMMENT '地址',
  `STATUS` tinyint(2) DEFAULT '0' COMMENT '状态，0未通过，1通过',
  `TUTOR` varchar(20) DEFAULT NULL COMMENT '导师',
  PRIMARY KEY (`SNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `gy_exercise_zd0106` */

insert  into `gy_exercise_zd0106`(`SNO`,`SNAME`,`GROUPID`,`URL`,`STATUS`,`TUTOR`) values ('S0101','陈琳',1,'http://192.168.1.53:8080/cl/homepage.html',0,'曾春苗'),('S0102','唐文',1,'http://192.168.1.29:8080/tangwen1/kuangjia.html',0,'曾春苗'),('S0103','丁国梁',1,'http://192.168.1.25:8080/guo/url/lianxi.html',0,'曾春苗'),('S0201','陈倪',2,'http://192.168.1.53:8080/cl/homepage.html',0,'李苏云'),('S0202','吴浪',2,'http://192.168.1.31:8080/basicClass/shouye.html',0,'李苏云'),('S0203','张兴',2,'http://192.168.1.18:8080/zhangxing/day06/frame.html',1,'李苏云'),('S0301','郑地',3,'http://192.168.1.37:8080/MyfirstWEB/frame/homepage.html',0,'马超'),('S0302','胡小芬',3,'http://192.168.1.75:8080/hxf_notebook/hxf课堂笔记/day06/myindex.html',0,'马超'),('S0303','张聪',3,'http://192.168.1.24:8080/OneMoreTime/frame/index.html',0,'马超'),('S0401','陈海东',4,'http://192.168.1.43:8080/chdweb/html/wed.html',0,'王凯'),('S0402','金兆斌',4,'http://192.168.1.40:8080/0309/frame/zhuye.html',0,'王凯'),('S0403','徐英',4,'http://192.168.1.2:8080/xuying/abc/frame3/shouye.html',0,'王凯'),('S0501','王静',5,'http://192.168.1.54:8080/guoyaruanjia/shouye.html',0,'戴全明'),('S0502','刘广洲',5,'http://192.168.1.30:8080/basscclass/frame/xinwangzhan.html',0,'戴全明'),('S0503','王均',5,'http://192.168.1.26:8080/basicClass/frame/shuoye.html',0,'戴全明'),('S0601','肖飞飞',6,'http://192.168.1.39:8080/xiaofeifei/kuangjia2.html',0,'戈维维'),('S0602','刘樊',6,'http://192.168.1.20:8080/666/web/frameset.html',0,'戈维维'),('S0603','朱赛健',6,'http://192.168.1.56:8080/gongcheng2/3.9/123.html',0,'戈维维'),('S0701','庄昌宁',7,'http://192.168.1.11:8080/zcn/basicClass/frame/shouye.html',0,'周启明'),('S0702','魏聿明',7,'http://192.168.1.10:8080/weiyuming/01.html',0,'周启明'),('S0703','李静',7,'http://192.168.1.8:8080/cx/shouye.html',0,'周启明'),('S0801','陈超',8,'http://192.168.1.48:8080/cc/shouye.html',0,'李晓阳'),('S0802','周盛明',8,'http://192.168.1.59:8080/zhousm/fema.html',0,'李晓阳'),('S0803','蒋方妍',8,'http://192.168.1.46:8080/jiangfangyan/09/20180308/shouye.html',0,'李晓阳'),('s0902','吴令',9,'http://127.0.0.1:8080/guoya-client/html/20018_03_19_switchImg.html',0,''),('S0903','大吴老师',9,'http://192.168.1.42:8080/guoya_client/html/MyHtml.html',0,'');

/*Table structure for table `gy_task` */

DROP TABLE IF EXISTS `gy_task`;

CREATE TABLE `gy_task` (
  `UPDATE_TIME` datetime DEFAULT NULL,
  `TASKID` int(4) DEFAULT NULL,
  `TASKNAME` varchar(100) DEFAULT NULL,
  `CREATETIME` datetime DEFAULT NULL,
  `DEMO_URL` varchar(50) DEFAULT NULL,
  `EXEC_DATE` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `gy_task` */

insert  into `gy_task`(`UPDATE_TIME`,`TASKID`,`TASKNAME`,`CREATETIME`,`DEMO_URL`,`EXEC_DATE`) values ('2018-03-19 15:16:45',7,'动态生成状态图片，点击改变状态','2018-03-19 15:16:45','','2018-03-19'),('2018-03-20 08:53:58',8,'开发者模式修改浏览器本地界面','2018-03-20 08:53:58','','2018-03-20'),('2018-03-19 13:21:14',6,'JavaScript根据json数据生成“单个”动态界面','2018-03-19 13:21:14','','2018-03-19'),('2018-03-19 07:50:22',4,'前端基础串讲','2018-03-19 07:50:22','','2018-03-19'),('2018-03-19 13:12:54',5,'点击按钮，触发JavaScript方法动态生成固定界面','2018-03-19 13:12:54','','2018-03-19'),('2018-03-20 09:35:11',9,'前后端初次整合','2018-03-20 09:35:11','','2018-03-20'),('2018-03-21 08:37:04',10,'初次使用数据库','2018-03-21 08:37:04','','2018-03-21'),(NULL,1,'自动生成一批相同的学生信息','2018-03-13 00:00:00','','2018-03-13'),(NULL,2,'自动生成不同姓名的学生信息','2018-03-14 00:00:00','','2018-03-14'),(NULL,3,'使用一个字符串描述一个班的学生信息','2018-03-15 00:00:00','','2018-03-15');

/*Table structure for table `gy_task_item` */

DROP TABLE IF EXISTS `gy_task_item`;

CREATE TABLE `gy_task_item` (
  `ITEMID` int(4) DEFAULT NULL,
  `ITEMNAME` varchar(50) DEFAULT NULL,
  `TASKID` int(4) DEFAULT NULL,
  `ITEMDESC` varchar(200) DEFAULT NULL,
  `ITEMSTATUS` varchar(1) DEFAULT NULL,
  `PRIORITY` varchar(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `gy_task_item` */

insert  into `gy_task_item`(`ITEMID`,`ITEMNAME`,`TASKID`,`ITEMDESC`,`ITEMSTATUS`,`PRIORITY`) values (22,'html写步骤',4,'按照手绘界面写注释，描述步骤','1','3'),(19,'检查点4：',3,'使用xml描述一个学生的所有信息','0','4'),(23,'html写界面布局',4,'按照步骤逐步写布局代码，内容用文字填充','1','4'),(24,'替换文字内容',4,'将填充文字换成真实内容，比如输入框、文本框、按钮等','1','5'),(36,'给div添加静态界面',5,'讲变量的值给div元素的innerHTML','1','5'),(26,'css样式选择器',4,'演示样式选择器的执行过程，定义十二栅格化的样式，row和col-1至col-12的样式，其中row加上display: flex;','1','7'),(39,'获取图片元素',7,'根据ID获取图片，alert图片的src','1','2'),(37,'新增1张图片',7,'设置图片ID，添加点击事件','1',''),(38,'新增状态切换函数',7,'alert测试按钮和函数是否可用','1','1'),(40,'判断src是否包含cross.jpg',7,'使用字符串自带的indexOf()方法，判断字符串是否包含cross.jpg，如果包含，位置大于0，如果不包含，则为-1','1','3'),(41,'改变图片的src切换状态',7,'如果包含cross.jpg，则将src设置为tick.jpg；否则设为cross.jpg','1','4'),(44,'找到元素选取按钮',8,'点击元素选取按钮，点击查找要修改的元素','1','2'),(45,'编辑“百度一下”按钮',8,'将“百度一下”按钮文字改为“果芽一下”','1','3'),(43,'打开F12开发者模式',8,'按F12，或者菜单选项中的开发者工具','1','1'),(27,'添加按钮',5,'写一个按钮，点击调用生成界面函数','1','1'),(20,'十二栅格化布局',4,'将界面分成12列，为什么分成12列，因为12是1、2、3、4、6、12的倍数，可以进行丰富的单元格合并','1','1'),(21,'纸上画界面布局',4,'在纸上面绘制界面布局草图，确定大致样式','1','2'),(28,'天剑函数',5,'写一个函数，点击alert提示“ok”，确保按钮和函数可用','1','2'),(29,'定义变量，值为界面代码',5,'修改函数的方法，将静态界面写成字符串','1','3'),(30,'获取内容面板div元素',5,'获取界面元素div，一个界面元素包括元素名、属性（属性名 属性值）、标签对之间的内容innerHTML','1','4'),(31,'xml写数据报文',6,'使用xml格式写“一个”学生的信息','1','1'),(32,'xml生成json',6,'使用在线工具，将xml转成json','1','2'),(33,'定义json对象',6,'定义一个变量，值为学生信息json','1','3'),(34,'测试json是否可用',6,'使用alert测试读取json对象的属性，语法为：对象.属性，其中“.”的含义就是“的”','1','4'),(46,'新增按钮和refresh方法',9,'新增一个界面，界面新增一个按钮，按钮调用一个方法，alert测试是否可用','1','1'),(51,'打开mysql客户端sqlyog',10,'打开mysql客户端sqlyog，远程连接mysql服务端，登录guoya数据库','1','1'),(1,'检查点1：',1,'新增“生成界面”按钮，点击按钮，调用函数（function），弹出alert提示','0','1'),(2,'检查点2：',1,'界面写一个空白的table，没有tr和td，点击“生成界面”按钮，往table里面添加一行一列，列里面随便写一句话','0','2'),(3,'检查点31：',1,'点击“生成界面”按钮，往table里面插入一个学生的作业信息','0','3'),(4,'检查点4：',1,'点击“生成界面”按钮，往table里面插入“指定个数”的作业信息','0','4'),(5,'检查点5：',1,'打开“作业检查”界面时，自动调用“生成界面”方法，省去手工点击的步骤','0','5'),(6,'检查点1：',2,' 变量：定义变量姓名name、状态status、地址url，点击生成界面按钮，alert逐个弹框显示变量值','0','1'),(7,'检查点2：',2,'字符串拼装：将所有变量组合成一个字符串，如“姓名：”+name+“,状态：”+status等等，点击按钮，alert弹“框显示整句话','0','2'),(8,'检查点3：',2,' js更改界面内容：将自动生成界面的模板中的“姓名”、“url”值改为变量的值','0','3'),(9,'检查点4：',2,' 数组：定义一个数组，里面存放5个名字；再定义一个数组，里面存放5个url','0','4'),(10,'检查点5：',2,' js循环控制器：获取数组大小，循环遍历数组，alert数组中的每一个值','0','5'),(11,'检查点6：',2,' js循环控制器：变量姓名数组，将自动生成界面的模板值替换成数组中的值，最终生成的界面姓名都不一样','0','6'),(12,'检查点1：',3,' 启动tomcat，“作业检查”界面确认网址可用，测试通过打钩','1','1'),(13,'检查点2：',3,' 新增一个按钮，点击，往界面插入一句话','1','2'),(14,'检查点3：',3,' 使用key=value&键值对描述一个学生的所有信息','0','3'),(47,'调用接口获取学生JSON数据',9,'使用Ajax调用后台接口，获取数据库的实时数据，数据格式为json串','1','2'),(16,'检查点5：',3,' 使用json描述一个学生的所有信息','0','5'),(17,'检查点6：',3,' 将学生信息从xml转成json','0','6'),(18,'检查点7：',3,' 用xml和json描述一个班的学生信息(班class>组group>学生student)','0','7'),(48,'接口规范',9,'接口的开发过程：先写接口规范，再开发前端界面和后端接口，代码是根据接口规范进行开发','1','3'),(49,'JavaScript解析json数据',9,'javascript解析接口返回的json串，alert测试数据读取是否ok，逐个alert学生的sno和sname','1','4'),(50,'将json数据整合到界面模板',9,'将json数据跟界面模板整合，根据数据的条数和值生成不同的学生界面','1','5');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
