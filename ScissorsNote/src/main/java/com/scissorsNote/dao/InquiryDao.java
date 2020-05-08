package com.scissorsNote.dao;

import java.util.List;

import com.scissorsNote.entity.Inquiry;

public interface InquiryDao {
	
	void insertInquiry(Inquiry inquiry);
	
	List<Inquiry> getAll();
}
