package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper08 {

	@Select("""
			<script>
			SELECT COUNT(*)
			FROM Customers
			<where>
				<if test="id &lt; 5">
				OR CustomerId &lt; #{id}
				</if>
			</where>
			</script>
			""")
	public Integer sql1(Integer id);
	
	@Select("""
			SELECT COUNT(*)
			FROM Customers
			WHERE CustomerId < #{id}
			""")
	public Integer sql2(Integer id);
	
	@Select("""
			<script>
			SELECT COUNT(*)
			FROM Customers
			WHERE CustomerId &lt; #{id}
			</script>
			""")
	public Integer sql3(Integer id);
	
	@Select("""
			<script>
			<![CDATA[
			SELECT COUNT(*)
			FROM Customers
			]]>
			<where>
				<if test="true">
				<![CDATA[
					OR CustomerId < #{id}
				]]>
				</if>
			</where>
			</script>
			""")
	public Integer sql4(Integer id);
	
}
