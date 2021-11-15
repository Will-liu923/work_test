package com.lw.service;

import com.lw.pojo.ScoreDetail;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className: UpdateService
 * @description: TODO 类描述
 * @author: wei.liu2mars@outlook.com  lw
 * @date: 2021/11/8 10:30
 **/
@Service
public class UpdateService {

    Map<String,ScoreDetail> objMap = new HashMap<>();

    public UpdateService(List<ScoreDetail> updateList) {
        for (ScoreDetail scoreDetail : updateList) {
            objMap.put(scoreDetail.getNewValue(),scoreDetail);
        }
    }
}
