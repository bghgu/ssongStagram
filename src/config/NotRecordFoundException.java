package config;

import java.sql.SQLException;

@SuppressWarnings("serial")
public class NotRecordFoundException extends SQLException {

	public NotRecordFoundException() {
		super("NotRecordFoundException");
		// TODO Auto-generated constructor stub
	}

	public NotRecordFoundException(String reason, String sqlState, int vendorCode, Throwable cause) {
		super(reason, sqlState, vendorCode, cause);
		// TODO Auto-generated constructor stub
	}

	public NotRecordFoundException(String reason, String SQLState, int vendorCode) {
		super(reason, SQLState, vendorCode);
		// TODO Auto-generated constructor stub
	}

	public NotRecordFoundException(String reason, String sqlState, Throwable cause) {
		super(reason, sqlState, cause);
		// TODO Auto-generated constructor stub
	}

	public NotRecordFoundException(String reason, String SQLState) {
		super(reason, SQLState);
		// TODO Auto-generated constructor stub
	}

	public NotRecordFoundException(String reason, Throwable cause) {
		super(reason, cause);
		// TODO Auto-generated constructor stub
	}

	public NotRecordFoundException(String reason) {
		super(reason);
		// TODO Auto-generated constructor stub
	}

	public NotRecordFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NotRecordFoundException: "+getMessage();
	}

}
