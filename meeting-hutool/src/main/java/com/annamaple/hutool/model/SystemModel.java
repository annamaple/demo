package com.annamaple.hutool.model;

import cn.hutool.core.date.DateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;


/**
 * @author xionglei
 * @create 2022-05-09 13:53
 */
@Data
@AllArgsConstructor
@ToString
public class SystemModel {

    private SystemModel() {
    }

    public static SystemModel newInstance() {
        SystemModel systemModel = new SystemModel();
        systemModel.setSystemDate(DateTime.now());
        systemModel.setTime(DateTime.now());
        systemModel.setDate(DateTime.now().toString("yyyyMMdd"));
        return systemModel;
    }

    /**
     * 真实时间
     */
    private Date time;

    /**
     * yyyyMMdd 8位长度
     */
    private String date;

    /**
     * 系统内部时间，当跑完每日批量后业务时间 + 1
     */
    private Date systemDate;

}
