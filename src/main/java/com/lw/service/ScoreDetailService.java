package com.lw.service;

import com.lw.pojo.ScoreDetail;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @className: ScoreDetailService
 * @description: TODO 类描述
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/3 10:05
 **/
@Service
public class ScoreDetailService {
    public List<ScoreDetail> getScoreDetail(Map<String, Object> params) {
        ArrayList<ScoreDetail> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            ScoreDetail scoreDetail = new ScoreDetail();
            scoreDetail.setOdlValue("10");
            scoreDetail.setNewValue("20");
            scoreDetail.setCreatUser("Jack");
            scoreDetail.setCreatDate(new Date());
            scoreDetail.setUpdateUser("Rose");
            scoreDetail.setUpdateDate(new Date());
            list.add(scoreDetail);
        }
        return list;
    }
}
