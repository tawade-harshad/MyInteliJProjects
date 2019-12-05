package com.training.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Partner implements Serializable {

    private long partnerCode;
    private String partnerName;
    private long mobileNumber;

}
