package addToCartResponsePojo;

public class AddToCartResponse{
	private int code;
	private Data data;
	private SuccessMessages successMessages;
	private String status;

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setSuccessMessages(SuccessMessages successMessages){
		this.successMessages = successMessages;
	}

	public SuccessMessages getSuccessMessages(){
		return successMessages;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}
}
