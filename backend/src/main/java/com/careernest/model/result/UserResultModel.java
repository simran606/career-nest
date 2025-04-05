package com.careernest.model.result;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResultModel {

    private String status;
    private String message;
    private Object data;

//    public String getStatus() { return status; }
//    public void setStatus(String status) { this.status = status; }
//
//    public String getMessage() { return message; }
//    public void setMessage(String message) { this.message = message; }
//
//    public Object getData() { return data; }
//    public void setData(Object data) { this.data = data; }
    
}
