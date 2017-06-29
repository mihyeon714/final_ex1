package com.choa.fx1;

import static org.junit.Assert.assertEquals;

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
		
		
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setNum(10);
		qnaDTO.setWriter("q100MOD");
		qnaDTO.setTitle("q100TMOD");
		qnaDTO.setContents("q100CMOD");
		
		//qnaDAO.write(qnaDTO);
		//qnaDAO.update(qnaDTO);
		assertEquals(1, qnaDAO.update(qnaDTO));
		System.out.println("Finish TEST");
		//리턴 되는 것이 있는지 dao 에서 sysout 해둠
	}

}
