package com.blitz.blog.utils.tools;
import java.util.List;
import java.util.Map;

/**
 * 
 * @Description: 分页参数
 * @author jianglong
 * @date 2015-6-12
 */
public class PageBean {

	public PageBean(){}
	
	public PageBean(int start, int pageSize){
		this.start = start;
		this.pageSize = pageSize;
	}
	public PageBean(int start, int pageSize,String field,String dir){
		this.start = start;
		this.pageSize = pageSize;
		this.field=field;
		this.dir=dir;
	}
	
	private List<?> list; // 要返回的某一页的记录列表
	
	private int start;//开始记录的编号
	
	private int limit;
	
	private Map<?, ?> sort;//排序字段与方式如{col1:'asc',col2:'desc'}多个排序字段
	
	private String field;//单个排序字段
	
	private String dir;//排序方式'asc'，'desc'
	
	private int allRow; // 总记录数

	private int totalPage; // 总页数

	private int currentPage; // 当前页

	private int pageSize=20; // 每页记录数


	private boolean isFirstPage; // 是否为第一页

	private boolean isLastPage; // 是否为最后一页

	private boolean hasPreviousPage; // 是否有前一页
  
	private boolean hasNextPage; // 是否有下一页
   /**
	 * 初始化分页信息
	 */
	public void init() {
		this.isFirstPage = isFirstPage();
		this.isLastPage = isLastPage();
		this.hasPreviousPage = isHasPreviousPage();
		this.hasNextPage = isHasNextPage();
	}
	public void destroy(){
		this.list=null;
		this.isFirstPage=false;
		this.currentPage=0;
		this.pageSize=0;
		this.allRow=0;
		this.totalPage=0;
	}
    
	public boolean isFirstPage() {
		return currentPage == 1; // 如是当前页是第1页
	}

	public boolean isLastPage() {
		return currentPage == totalPage; // 如果当前页是最后一页
	}

	public boolean isHasPreviousPage() {
		return currentPage != 1; // 只要当前页不是第1页
	}

	public boolean isHasNextPage() {
		return currentPage != totalPage; // 只要当前页不是最后1页
	}

	public static int countTotalPage(final int pageSize, final int allRow) {
		int totalPage = allRow % pageSize == 0 ? allRow / pageSize : allRow
				/ pageSize + 1;
		return totalPage;
	}

	public static int countOffset(final int pageSize, final int currentPage) {
		final int offset = pageSize * (currentPage - 1);
		return offset;
	}

	public static int countCurrentPage(int page) {
		final int curPage = (page == 0 ? 1 : page);
		return curPage;
	}
	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	public int getAllRow() {
		return allRow;
	}

	public void setAllRow(int allRow) {
		this.allRow = allRow;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}

	public void setFirstPage(boolean isFirstPage) {
		this.isFirstPage = isFirstPage;
	}

	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}
	
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Map<?, ?> getSort() {
		return sort;
	}

	public void setSort(Map<?, ?> sort) {
		this.sort = sort;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

}
