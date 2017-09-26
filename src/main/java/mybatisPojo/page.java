package mybatisPojo;

public class page{
      private int pageindex;
      private int pagecount;
      private int zongye;
      private int rongliang;
      //об╠Й
      private int index;
	public page() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public page(int pageindex, int pagecount, int zongye, int rongliang,
			int index) {
		super();
		this.pageindex = pageindex;
		this.pagecount = pagecount;
		this.zongye = zongye;
		this.rongliang = rongliang;
		this.index = index;
	}

	public int getPageindex() {
		return pageindex;
	}
	public void setPageindex(int pageindex) {
		if(pageindex<1){
			this.pageindex=1;
		}else if(pageindex>getZongye()){
			this.pageindex = getZongye();
		}else{
			this.pageindex = pageindex;
		}
		
	}
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	public int getZongye() {
		return zongye;
	}
	public void setZongye() {
		this.zongye = getPagecount()%getRongliang()==0?getPagecount()/getRongliang():(getPagecount()/getRongliang())+1;
	}
	public int getRongliang() {
		return rongliang;
	}
	public void setRongliang(int rongliang) {
		this.rongliang = rongliang;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "page [pageindex=" + pageindex + ", pagecount=" + pagecount
				+ ", zongye=" + zongye + ", rongliang=" + rongliang
				+ ", index=" + index + "]";
	}
	
}
