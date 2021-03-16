package org.yoojin.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	/*not Mapper.xml type*/
	@Select("select sysdate()")
	public String getTime();
	
	public String getTime2();
}
