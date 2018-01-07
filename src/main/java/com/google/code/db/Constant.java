package com.google.code.db;

public class Constant {
   public static final String MonetURL = "jdbc:monetdb://localhost:50000/demo?so_timeout=10000";
   
   public static final String MonetUser = "monetdb";
   
   public static final String MonetPwd = "monetdb";
   
   public static final String MySQLURL = "jdbc:mysql://localhost/test?user=minty&password=greatsqldb";
   
   public static final String MySQLUser = "root";
   
   public static final String MySQLPwd = "1234";
   
   public static final String MySQLhost = "10.77.40.47";
   
   public static final String BinlogFileName  = "mysql-bin.000001"; 
   
   public static final String Redishost = "120.24.98.91";
   
   public static final int Redisport = 6379;
   
   public static final int MySQLport = 3307;
   
   public static final int Serverid = 1;
   
   public static final int BinlogPosition = 190;
   
   public static final String Comma = ",";
   
   public static final String Semicolon = ";";
   
   public static final String Insval = "INSERT INTO ";
   
   public static final String Tableid_reg = "(?<=tableId\\=).*?(?=\\,)";
   
   public static final String Tablename_reg = "(?<=tableName\\=).*?(?=\\,)";
   
   public static final String Colvalue_reg = "(?<=ns\\=\\[).*?(?=\\])";
   
   public static final String Colcount_reg = "(?<=count\\=).*?(?=\\,)";
   
   public static final String Coltype_reg = "(?<=es\\=\\[).*?(?=\\])";
   
}
