package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper09 {

	@Select("""
			<script>
			SELECT COUNT(*)
			FROM Customers
			WHERE country IN (
			<foreach collection="elems" item="elem" separator=", ">
				#{elem}
			</foreach>
			)
			</script>
			""")
	public Integer sql1(List<String> elems);

	@Select("""
			<script>
			SELECT *
			FROM Suppliers
			<where>
			<if test="countries neq null">
			country IN
			<foreach collection="countries" item="country"
			open="("
			separator=", "
			close=")">
			#{country}
			</foreach>
			</if>
			</where>
			</script>
			""")
	public List<Supplier> sql2(List<String> countries);

}
