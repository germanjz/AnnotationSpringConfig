package mx.com.ejemplo.webapp.beans;

import java.util.ArrayList;
import java.util.List;

public class ListIataCodes {
	private List<IataCodesResponse> listResponse;
	private String msg;
	private boolean success;
	/**
	 * @return the listResponse
	 */
	public List<IataCodesResponse> getListResponse() {
		if (listResponse == null) {
			return new ArrayList<>();
		}
		return listResponse;
	}
	/**
	 * @param listResponse the listResponse to set
	 */
	public void setListResponse(List<IataCodesResponse> listResponse) {
		this.listResponse = listResponse;
	}
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}
	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ListIataCodes [listResponse=" + listResponse + ", msg=" + msg + ", success=" + success + "]";
	}
	
}
