package com.study.common.sql;

public class CommonSQL {

	public static final String PRE_PAGEING_QRY = 	"select * from (select a.*, ROWNUM rnum  from ( " ;
	public static final String POST_PAGEING_QRY = 	" )a where rownum <= ?  ) b   where rnum between ? and ? ";
	
	
}
