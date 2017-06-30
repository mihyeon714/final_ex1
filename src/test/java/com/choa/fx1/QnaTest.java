package com.choa.fx1;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.qna.QnaDAO;
import com.choa.qna.QnaDTO;

public class QnaTest extends MyAbstractTestUnit {
	
	@Autowired
	private QnaDAO qnaDAO;

	@Test
	public void test() throws Exception {
		
		//assertNotNull(qnaDAO);
		
		/*
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setNum(10);
		qnaDTO.setWriter("q100MOD");
		qnaDTO.setTitle("q100TMOD");
		qnaDTO.setContents("q100CMOD");
		*/
		//qnaDAO.write(qnaDTO);
		//qnaDAO.update(qnaDTO);
		//assertEquals(1, qnaDAO.update(qnaDTO));
		//System.out.println("Finish TEST");
		//리턴 되는 것이 있는지 dao 에서 sysout 해둠
		/*
		QnaDTO qnaDTO  = qnaDAO.view(10);
		System.out.println("view 테스트 = "+qnaDTO.getWriter());
		*/
		List<QnaDTO> list = qnaDAO.list(1, 10);
		
		for(QnaDTO qnaDTO : list){
			System.out.println("list 테스트 = "+qnaDTO.getWriter());
		}
		
		
		
	}

}
