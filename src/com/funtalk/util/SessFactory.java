package com.funtalk.util;

import com.alibaba.druid.util.StringUtils;
import com.funtalk.mapper.ServMapper;
import com.funtalk.pojo.Serv;
import com.funtalk.pojo.SimpleServ;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SessFactory {

    public static SqlSessionFactory iotSessionFactory;
    public static SqlSessionFactory acctSessionFactory;

    private static final Map<String, SqlSessionFactory> dbs = new ConcurrentHashMap<String, SqlSessionFactory>();

    static{
        try {
            //使用MyBatis提供的Resources类加载mybatis的配置文件
            Reader mysqlReader = Resources.getResourceAsReader("mybatis-iot.xml");
            //构建sqlSession的工厂
            iotSessionFactory = new SqlSessionFactoryBuilder().build(mysqlReader);

            Reader oracleReader = Resources.getResourceAsReader("mybatis-acct.xml");
            //构建sqlSession的工厂
            acctSessionFactory = new SqlSessionFactoryBuilder().build(oracleReader);

            dbs.put("iot",iotSessionFactory);
            dbs.put("acct",acctSessionFactory);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
    //创建能执行映射文件中sql的sqlSession
    public static SqlSession getSession(String database) {

        String  dbfile="";
        Reader reader;
        SqlSession sqlSession=null;
        SqlSessionFactory sessionFactory;

        try{

            if (StringUtils.isEmpty(database)) {
                throw new IOException("The input for database id is Empty!");
            }

            if (dbs.get(database) == null) {

                dbfile="mybatis-"+database+".xml";

                reader = Resources.getResourceAsReader(dbfile);

                if (reader != null){
                    sessionFactory = new SqlSessionFactoryBuilder().build(reader);
                    dbs.put(database,sessionFactory);
                }else{
                    throw new IOException("The database[" + database + "]. is not found! ");
                }
            }

            sqlSession=dbs.get(database).openSession();

        }  catch (Exception e){

           e.printStackTrace();
        }

        return  sqlSession;

    }

    public static void main(String[] args) {

        SqlSession sqlSession=getSession("acct");

        ServMapper servMapper = sqlSession.getMapper(ServMapper.class);

        List<SimpleServ> accnbrList =new ArrayList<>();

        SimpleServ simpleServ=new SimpleServ();

        simpleServ.setAccNbr("17020116999");

        accnbrList.add(simpleServ);

        List<SimpleServ> newList = servMapper.selectStateByAccnbrForBatch(accnbrList);

        if (newList.size()>0)
            System.out.println("--------------->"+newList.get(0).getNewState());

    }
}
