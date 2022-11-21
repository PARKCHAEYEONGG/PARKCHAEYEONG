package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

public interface ReplyMapper {
	
public int insert(ReplyVO vo);

public ReplyVO read (Long rno); //특정 댓글 읽기

public int delete(Long targetRno); //댓글 삭제하기

public int update(ReplyVO reply);  //댓글 수정

public List<ReplyVO> getListWithPaging(
		@Param("cri") Criteria cri,
		@Param("bno") Long bno);

}
