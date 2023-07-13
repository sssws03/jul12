package com.sssws03.web;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/* @Controller ==Controller
 * @Service    == Service
 * @Repository == DAO
 */
@Repository
public class BoardDAO {
	//DB와 연결할겁니다.
	@Autowired
	private SqlSession sqlSession;
}
