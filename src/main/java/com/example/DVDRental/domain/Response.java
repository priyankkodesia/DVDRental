package com.example.DVDRental.domain;

public class Response {


    String status;
    String errorMessage;
    public static final String SUCCESS = "Success";
    public static final String FAILED = "Failed";
    public static final String PROCESSING = "Processing";
    public static final String COMPLETED = "Completed";

    private Object data;
    private String access_token;
    private String refresh_token;
    private String auth_type;
    private String jti;

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }

    public Response() {
    }

    public Response(String status2 ) {
        this.status = status2;
    }

    public Response(String status2 , Object data) {
        this.status = status2;
        this.data = data;
    }

    public Response(String status2 , String errorMessage , Object data) {
        this.status = status2;
        this.data = data;
        this.errorMessage = errorMessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }


    public String getAuth_type() {
        return auth_type;
    }

    public void setAuth_type(String auth_type) {
        this.auth_type = auth_type;
    }

    @Override
    public String toString() {
        return "Response [status=" + status + ", errorMessage=" + errorMessage + ", data=" + data + ", access_token="
                + access_token + ", refresh_token=" + refresh_token + ", auth_type=" + auth_type + "]";
    }
}
