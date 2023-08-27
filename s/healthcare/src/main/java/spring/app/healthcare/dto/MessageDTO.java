package spring.app.healthcare.dto;

public class MessageDTO {

	private String messageID;
	private Boolean success;
	private Boolean fail;
	private int status;
	private String message;
	
	public String getMessageID() {
		return messageID;
	}
	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getFail() {
		return fail;
	}
	public void setFail(Boolean fail) {
		this.fail = fail;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "MessageDTO [messageID=" + messageID + ", success=" + success + ", fail=" + fail + ", status=" + status
				+ ", message=" + message + "]";
	}
	
	
	
	
}
