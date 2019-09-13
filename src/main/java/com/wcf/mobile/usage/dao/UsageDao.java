package com.wcf.mobile.usage.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by pmanickam on 9/10/2019 at 9:31 AM
 */

@Component
public class UsageDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    String headerSql = "Select COUNT(DISTINCT EMPLOYEEID) as \"nop\",  CURDATE() as \"rundate\", Sum(TOTALMINUTES) as \"tm\", Sum(TOTALDATA) as \"tm\", AVG(TOTALMINUTES) as \"am\" , AVG(TOTALDATA) as \"ad\" from CellPhoneUsageByMonth";

    String detailSql ="SELECT c.EMPLOYEEID,c.EMPLOYEENAME,c.PURCHASEDATE,c.MODEL,cpu.TOTALMINUTES,cpu.TOTALDATA  from CellPhone c INNER JOIN CellPhoneUsageByMonth cpu WHERE c.EMPLOYEEID = cpu.EMPLOYEEID ORDER BY c.EMPLOYEEID";
    public Map<String, Object> getHeaderReport()
    {

        return jdbcTemplate.queryForMap(headerSql);

    }

    public List<Map<String, Object>> getDetailReport()
    {

        return jdbcTemplate.queryForList(detailSql);

    }



}
