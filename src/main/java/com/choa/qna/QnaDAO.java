package com.choa.qna;

import java.util.HashMap;
import java.util.List;
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
	
	public QnaDTO view(int num) throws Exception{
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("num", num);
		sqlSession.selectOne(namespace+"view", map); // 알아서 map에 저장이 되어서 온다 
		List<QnaDTO> list = (List<QnaDTO>)map.get("qna");//qna란 Mapper.xml 에서 설정해준 키의 이름 //여러개 받아오는 걸로 했으니...
		return list.get(0);
		
	}
	
	public List<QnaDTO> list(int start, int last){
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", start);
		map.put("last", last);
		
		sqlSession.selectOne(namespace+"list", map); 
		//여기서는 굳이 list 안해도된다 우리는 map 하나를 꺼내오는 것이기 때문 //대부분 One으로 통일해준다
		
		List<QnaDTO> list = (List<QnaDTO>)map.get("qna");
		return list;
		
	}
	
	
	

}
