package com.lw.controller;

import com.lw.common.BaseResponse;
import com.lw.common.ResponseExtBase;
import com.lw.pojo.ScoreDetail;
import com.lw.service.ScoreDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className: ScoreGivingDetailController
 * @description: TODO 类描述
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/3 9:20
 **/

@RestController
@RequestMapping("/account")
public class ScoreGivingDetailController {
    @Autowired
    private ScoreDetailService service;

    @RequestMapping(value = "/score/givingDetail",method = RequestMethod.POST)
    public ResponseExtBase scoreDetail(@RequestParam(name = "accountNo",required = true) String accountNo,
                                    @RequestParam(name = "currentPage",required = false,defaultValue = "1") Integer currentPage,
                                    @RequestParam(name = "pageSize",required = false,defaultValue = "10") Integer pageSize) {
        ResponseExtBase response = new ResponseExtBase();
        Map<String,Object> params = new HashMap<>();
        params.put("accountNo",accountNo);
        params.put("currentPage",currentPage);
        params.put("pageSize",pageSize);
        List<ScoreDetail> data = service.getScoreDetail(params);
        int totalSize = data.size();
        int totalPages = totalSize / pageSize;
        int mod = totalSize % pageSize;
        if (mod > 0) {
            totalPages = totalPages + 1;
        }
        response.setTotalPages(totalPages);
        response.setTotalSize(totalSize);
        response.setResult(data);
        return response;
    }
}
