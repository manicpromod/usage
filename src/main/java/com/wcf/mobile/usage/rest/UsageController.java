package com.wcf.mobile.usage.rest;

import com.wcf.mobile.usage.dao.UsageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by pmanickam on 9/10/2019 at 6:54 PM
 */

@Controller
public class UsageController {


    @Autowired
    private UsageDao usageDao;


    @GetMapping("/report")
    private void getData(Model model)  {

        Map<String, Object> headerMap =  usageDao.getHeaderReport();
        model.addAllAttributes(headerMap);

        List<Map<String, Object>> detailsMap =  usageDao.getDetailReport();
        model.addAttribute(detailsMap);

        }


        }


