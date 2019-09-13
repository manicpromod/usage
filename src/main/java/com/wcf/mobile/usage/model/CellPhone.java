package com.wcf.mobile.usage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

/**
 * Created by pmanickam on 9/10/2019 at 9:25 AM
 */

@NoArgsConstructor
@AllArgsConstructor
public class CellPhone {

    private int employeeId;
    private String employeeName;
    private String purchaseDate;
    private String model;


}
