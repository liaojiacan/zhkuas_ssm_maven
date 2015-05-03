package com.zhku.service.db;

import com.zhku.bean.Notice;

public interface INoticeService {
	public void addNotice(Notice notice);
	public void deleteNotice(Notice notice);
	public void updateNotice(Notice notice);
	public Notice getNoticeById(int id);
	public Notice getNoticeByTermNo(String termNo);
}
