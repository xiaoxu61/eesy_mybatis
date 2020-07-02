第一个：创建IUserDao.xml 和 IUserDao.java 时名称是为了和我们之前的知识保持一直
	在mybatis中他把持久层的操作接口名称和映射文件也叫做 Mapper
	所以：IUserDao 和 IUserMapper是一样的
第二个：idea在创建是：com.itheima.dao.IUserDao 他是三级结构
	目录在创建时：com.itheima.dao.IUserDao 时一级目录
第三个：mybatis的映射配置文件位置必须和dao接口的包结构相同
第四个：映射配置文件的mapper标签namespace属性的取值必须是dao接口的全限定类名
第五个：映射配置文件的操作配置(select)，id属性的取值必须是dao接口的方法名

	当我们遵从了第三、四、五点之后，我们在开发中就无需再写dao的实现类

mybatis的入门案例
	//1.读取配置文件
	//2.创建SqlSessionFactory工厂
	//3.使用工厂生产SqlSession对象
	//4.使用SqlSession创建Dao接口的代理对象
	//5.使用代理对象执行方法
	//6.释放资源
	注意事项：不要忘记在映射配置中告知mybatis要封装在哪个实体类中
		配置方式：指定实体类的全限定类名

	mysql基于注解的入门案例：
		把IUserDao.xml移除，在dao接口的方法上使用@select注解，并且指定SQL语句
		同时需要在SqlMapConfig.xml中的mapper配置时，使用class属性指定dao接口的全限定类名
	明确：
	    实际开发中，都是越简便越好，所以都是采用不写dao实现类的方式。
	    不管使用XML还是注解配置
	    但是Mybatis他是支持写dao实现类