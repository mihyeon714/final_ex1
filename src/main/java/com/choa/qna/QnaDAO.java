package com.choa.qna;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QnaDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="QnaMapper.";
	
	public int write(QnaDTO qnaDTO) throws Exception{
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("qnaDTO", qnaDTO);
		//System.out.println( sqlSession.insert(namespace+"write",map) ); //return 확인용
		sqlSession.insert(namespace+"write",map);
		
		int result = (Integer)map.get("result");
		System.out.println("result = "+result);
		return 0;
	}
	
	
	public int update(QnaDTO qnaDTO) throws Exception{
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("qnaDTO", qnaDTO);
		sqlSession.insert(namespace+"update",map);
		
		int result = (Integer)map.get("result");
		System.out.println("result = "+result);

		return 0;
	}

}
