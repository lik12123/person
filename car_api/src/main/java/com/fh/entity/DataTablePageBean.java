package com.fh.entity;

public class DataTablePageBean {
	
	private Integer draw;//类似于自增ID，每请求数据一次加一，多个表格时候使用。
	
	private Integer start;//起始下标，相当 ”于select * from user limit 7 , 100 “  中 7的作用;
	
	private Integer length;//每页显示几条

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}
	
	

}
