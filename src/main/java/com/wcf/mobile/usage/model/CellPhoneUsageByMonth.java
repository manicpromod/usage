package com.wcf.mobile.usage.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Created by pmanickam on 9/10/2019 at 9:29 AM
 */

@NoArgsConstructor
@AllArgsConstructor
public class CellPhoneUsageByMonth {

    private int employeeId;
    private String date;
    private String totalMinutes;
    private String totalData;

}
